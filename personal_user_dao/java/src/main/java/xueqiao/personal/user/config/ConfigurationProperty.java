package xueqiao.personal.user.config;

import org.apache.commons.lang.StringUtils;
import org.soldier.platform.dal_set.DalSetDataSource;
import org.soldier.platform.db_helper.DBQueryHelper;
import org.soldier.platform.id_maker.IdException;
import org.soldier.platform.id_maker.IdMaker;
import org.soldier.platform.id_maker.IdMakerFactory;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import org.soldier.platform.svr_platform.comm.PlatformArgs;
import org.soldier.platform.svr_platform.container.TServiceCntl;
import xueqiao.personal.user.dao.thriftapi.PersonalUserDaoVariable;

import java.sql.Connection;
import java.util.Properties;

public class ConfigurationProperty {

    private String roleName;

    private static ConfigurationProperty config;

    private IdMaker userIdMaker;
    private IdMaker favoriteFolderIdMaker;
    private IdMaker favoriteChartIdMaker;

    private ConfigurationProperty() {
    }

    public static ConfigurationProperty instance() {
        if (config == null) {
            synchronized (ConfigurationProperty.class) {
                if (config == null) {
                    config = new ConfigurationProperty();
                }
            }
        }
        return config;
    }

    public void init(Properties props) throws IdException, ErrorInfo {
        this.roleName = props.getProperty("role_xiaoha_chart", "role_xiaoha_chart");
        int userIdmakerNum = Integer.parseInt(props.getProperty("userIdMaker", "222"));
        int favoriteFolderIdmakerNum = Integer.parseInt(props.getProperty("favoriteFolderIdmaker", "223"));
        int favoriteChartIdmakerNum = Integer.parseInt(props.getProperty("favoriteChartIdMaker", "224"));
        this.userIdMaker = IdMakerFactory.getInstance().getIdMaker(userIdmakerNum);
        this.favoriteFolderIdMaker = IdMakerFactory.getInstance().getIdMaker(favoriteFolderIdmakerNum);
        this.favoriteChartIdMaker = IdMakerFactory.getInstance().getIdMaker(favoriteChartIdmakerNum);

        System.out.println("roleName=" + roleName);
        System.out.println("userIdmakerNum=" + userIdmakerNum);
        System.out.println("favoriteFolderIdmakerNum=" + favoriteFolderIdmakerNum);
        System.out.println("favoriteChartIdmakerNum=" + favoriteChartIdmakerNum);

        if (this.userIdMaker == null) {
            throw new IdException("userIdMaker create failed!");
        }

        if (roleName == null || "".equals(roleName)) {
            throw new IllegalArgumentException("role name not found.");
        }

        new DBQueryHelper<Void>(getDataSource(null)) {
            @Override
            protected Void onQuery(Connection connection) throws Exception {
                return null;
            }
        }.query();
    }

    public IdMaker getUserIdMaker() {
        return this.userIdMaker;
    }

    public String getRoleName() {
        return roleName;
    }

    public DalSetDataSource getDataSource(String serviceName) {
        if (StringUtils.isEmpty(serviceName)) {
            TServiceCntl oCntl = new TServiceCntl(PersonalUserDaoVariable.serviceKey, "reqPersonalUser", new PlatformArgs());
            serviceName = oCntl.getDalSetServiceName();
        }
        return new DalSetDataSource(roleName, serviceName, false, 0);
    }

    public IdMaker getFavoriteFolderIdMaker() {
        return favoriteFolderIdMaker;
    }

    public IdMaker getFavoriteChartIdMaker() {
        return favoriteChartIdMaker;
    }
}
