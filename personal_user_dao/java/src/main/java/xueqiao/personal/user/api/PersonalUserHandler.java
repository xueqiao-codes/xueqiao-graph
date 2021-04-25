package xueqiao.personal.user.api;

import com.google.common.base.Preconditions;
import org.soldier.platform.db_helper.DBQueryHelper;
import org.soldier.platform.db_helper.DBTransactionHelper;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import xueqiao.personal.user.dao.thriftapi.storage.FavoriteChartTable;
import xueqiao.personal.user.dao.thriftapi.storage.FavoriteFolderTable;
import xueqiao.personal.user.dao.thriftapi.storage.PersonalUserTable;
import xueqiao.personal.user.dao.thriftapi.storage.UserRelateInfoTable;
import xueqiao.personal.user.thriftapi.*;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

public class PersonalUserHandler {

    public long addPersonalUser(DataSource dataSource, PersonalUserEntry personalUserEntry) throws ErrorInfo {
        Preconditions.checkNotNull(personalUserEntry, "PersonalUserEntry must not null.");

        return new DBTransactionHelper<Long>(dataSource) {
            PersonalUserTable table;
            long personalUserId;
            FavoriteFolderTable favoriteFolderTable;

            @Override
            public void onPrepareData() throws ErrorInfo, Exception {
                table = new PersonalUserTable(getConnection());
                favoriteFolderTable = new FavoriteFolderTable(getConnection());
            }

            @Override
            public void onUpdate() throws ErrorInfo, Exception {
                if (personalUserEntry.isSetTel()) {
                    List<PersonalUserEntry> list = table.query(new ReqPersonalUserOption().setTel(personalUserEntry.getTel()));
                    if (list.size() > 0) {
                        throw new ErrorInfo(PersonalUserErrorCode.USER_EXISTS.getValue(), "User exists.");
                    }
                }
                personalUserId = table.add(personalUserEntry);
                FavoriteFolder baseFolder = new FavoriteFolder();
                baseFolder.setPersonalUserId(personalUserId);
                baseFolder.setParentFolderId(0);
                baseFolder.setFolderName("收藏夹");
                favoriteFolderTable.add(baseFolder);
            }

            @Override
            public Long getResult() {
                return personalUserId;
            }
        }.execute().getResult();
    }


    public List<PersonalUserEntry> reqPersonalUser(DataSource dataSource, ReqPersonalUserOption option) throws ErrorInfo {
        return new DBQueryHelper<List<PersonalUserEntry>>(dataSource) {
            @Override
            protected List<PersonalUserEntry> onQuery(Connection connection) throws Exception {
                return new PersonalUserTable(connection).query(option);
            }
        }.query();
    }


    public void addUserRelateInfo(DataSource dataSource, UserRelateInfo userRelateInfo) throws ErrorInfo {
        Preconditions.checkNotNull(userRelateInfo, "UserRelateInfo must not null.");
        new DBTransactionHelper<Void>(dataSource) {
            PersonalUserTable table;
            UserRelateInfoTable relateInfoTable;

            @Override
            public void onPrepareData() throws ErrorInfo, Exception {
                table = new PersonalUserTable(getConnection());
                relateInfoTable = new UserRelateInfoTable(getConnection());
            }

            @Override
            public void onUpdate() throws ErrorInfo, Exception {
                ReqPersonalUserOption option = new ReqPersonalUserOption();
                option.addToPersonalUserIds(userRelateInfo.getPersonalUserId());
                List<PersonalUserEntry> list = table.query(option);
                if (list.size() == 0) {
                    throw new ErrorInfo(PersonalUserErrorCode.USER_NOT_FOUND.getValue(), "user not found.");
                }

                ReqUserRelateInfoOption relateOption = new ReqUserRelateInfoOption();
                relateOption.setPersonUserId(userRelateInfo.getPersonalUserId());
                List<UserRelateInfo> relateInfoList = relateInfoTable.query(relateOption);
                if (relateInfoList.size() > 0) {
                    throw new ErrorInfo(PersonalUserErrorCode.PERSONAL_USER_RELATION_EXISTS.getValue(), "personal user relation exists.");
                }

                ReqUserRelateInfoOption relateOption2 = new ReqUserRelateInfoOption();
                relateOption2.setCompanyId(userRelateInfo.getCompanyId());
                relateOption2.setCompanyUserId(userRelateInfo.getCompanyUserId());

                relateInfoList = relateInfoTable.query(relateOption2);
                if (relateInfoList.size() > 0) {
                    throw new ErrorInfo(PersonalUserErrorCode.COMPANY_USER_RELATION_EXISTS.getValue(), "company user relation exists.");
                }
                relateInfoTable.add(userRelateInfo);
            }

            @Override
            public Void getResult() {
                return null;
            }
        }.execute();
    }

    public List<UserRelateInfo> reqUserRelateInfo(DataSource dataSource, ReqUserRelateInfoOption option) throws ErrorInfo {
        return new DBQueryHelper<List<UserRelateInfo>>(dataSource) {
            @Override
            protected List<UserRelateInfo> onQuery(Connection connection) throws Exception {
                return new UserRelateInfoTable(connection).query(option);
            }
        }.query();
    }

    public void mergeUserRelateInfo(DataSource dataSource, long companyUserRelatePersonalUserId, long forMergePersonalUserId) throws ErrorInfo {
        //
        // 查询 relate1 companyUserRelatePersonalUserId
        // 查询 relate2 forMergePersonalUserId 是否存在
        // 查询 companyUserRelatePersonalUserId 的收藏夹，收藏图片, userId -- > forMergePersonalUserId
        // relate1 companyId, companyUserId --> 0
        // 添加relate2 设置 companyId, companyUserId relateInfo

        new DBTransactionHelper<Void>(dataSource) {
            UserRelateInfoTable relateInfoTable;
            PersonalUserTable personalUserTable;
            FavoriteFolderTable favoriteFolderTable;
            FavoriteChartTable favoriteChartTable;

            @Override
            public void onPrepareData() throws ErrorInfo, Exception {
                relateInfoTable = new UserRelateInfoTable(getConnection());
                personalUserTable = new PersonalUserTable(getConnection());
                favoriteFolderTable = new FavoriteFolderTable(getConnection());
                favoriteChartTable = new FavoriteChartTable(getConnection());
            }

            @Override
            public void onUpdate() throws ErrorInfo, Exception {
                UserRelateInfo item = relateInfoTable.query(companyUserRelatePersonalUserId);
                if (item == null) {
                    throw new ErrorInfo(PersonalUserErrorCode.RELATION_NOT_FOUND.getValue(),"Relation not found.");
                }
                UserRelateInfo forMergeItem = relateInfoTable.query(forMergePersonalUserId);
                if (forMergeItem != null) {
                    throw new ErrorInfo(PersonalUserErrorCode.PERSONAL_USER_RELATION_EXISTS.getValue(),"personal user relation exists.");
                }

                UserRelateInfo relateInfo = new UserRelateInfo();
                relateInfo.setLinked(true);
                relateInfo.setCompanyId(item.getCompanyId());
                relateInfo.setCompanyUserId(item.getCompanyUserId());
                relateInfo.setPersonalUserId(forMergePersonalUserId);
                relateInfoTable.delete(companyUserRelatePersonalUserId);
                relateInfoTable.add(relateInfo);

                FavoriteFolder forMergeRootFolder = favoriteFolderTable.queryRootFolder(forMergePersonalUserId);
                FavoriteFolder oldRelateRootFolder = favoriteFolderTable.queryRootFolder(companyUserRelatePersonalUserId);

                long rootFolderId = oldRelateRootFolder.getFolderId();
                favoriteFolderTable.delete(rootFolderId);
                favoriteFolderTable.batModifyParent(
                        oldRelateRootFolder.getPersonalUserId(),
                        oldRelateRootFolder.getFolderId(),
                        forMergeRootFolder.getPersonalUserId(),
                        forMergeRootFolder.getFolderId());

                favoriteFolderTable.batModifyOwner(oldRelateRootFolder.getPersonalUserId(), forMergeRootFolder.getPersonalUserId());
                favoriteChartTable.batModifyOwner(oldRelateRootFolder.getPersonalUserId(), forMergePersonalUserId);

                personalUserTable.delete(companyUserRelatePersonalUserId);
            }

            @Override
            public Void getResult() {
                return null;
            }
        }.execute();
    }
}
