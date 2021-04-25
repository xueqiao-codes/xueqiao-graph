package xueqiao.graph.xiaoha.chart.config;

import org.apache.commons.lang.StringUtils;
import org.soldier.platform.dal_set.DalSetDataSource;
import org.soldier.platform.db_helper.DBQueryHelper;
import org.soldier.platform.id_maker.IdException;
import org.soldier.platform.id_maker.IdMaker;
import org.soldier.platform.id_maker.IdMakerFactory;
import org.soldier.platform.svr_platform.comm.ErrorInfo;
import org.soldier.platform.svr_platform.comm.PlatformArgs;
import org.soldier.platform.svr_platform.container.TServiceCntl;
import xueqiao.graph.xiaoha.chart.dao.thriftapi.XiaohaChartDaoVariable;

import java.sql.Connection;
import java.util.Properties;

public class ConfigurationProperty {

    private String roleName;

    private static ConfigurationProperty config;

    private IdMaker chartIdMaker;

    private IdMaker chartFolderIdMaker;

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
        int chartIdMakerNum = Integer.parseInt(props.getProperty("chartIdMaker", "220"));
        int chartFolderIdMakerNum = Integer.parseInt(props.getProperty("chartFolderIdMaker", "221"));
        this.chartIdMaker = IdMakerFactory.getInstance().getIdMaker(chartIdMakerNum);
        this.chartFolderIdMaker = IdMakerFactory.getInstance().getIdMaker(chartFolderIdMakerNum);

        System.out.println("roleName=" + roleName);
        System.out.println("chartIdMakerNum=" + chartIdMakerNum);
        System.out.println("chartFolderIdMakerNum=" + chartFolderIdMakerNum);

        if (this.chartIdMaker == null) {
            throw new IdException("chartIdMaker create failed!");
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

    public IdMaker getChartIdMaker() {
        return this.chartIdMaker;
    }

    public String getRoleName() {
        return roleName;
    }

    public DalSetDataSource getDataSource(String serviceName) {
        if (StringUtils.isEmpty(serviceName)) {
            TServiceCntl oCntl = new TServiceCntl(XiaohaChartDaoVariable.serviceKey, "reqChart", new PlatformArgs());
            serviceName = oCntl.getDalSetServiceName();
        }
        return new DalSetDataSource(roleName, serviceName, false, 0);
    }

    public IdMaker getChartFolderIdMaker() {
        return chartFolderIdMaker;
    }
}
