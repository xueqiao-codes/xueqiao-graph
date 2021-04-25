package com.xueqiao.job;

import com.longsheng.xueqiao.goose.thriftapi.client.GooseAoStub;
import net.qihoo.qconf.Qconf;
import net.qihoo.qconf.QconfException;
import org.apache.thrift.TException;
import org.soldier.base.logger.AppLog;
import org.soldier.platform.svr_platform.comm.ErrorInfo;

import java.text.DateFormat;
import java.util.Date;

public class Entry {

    public static void main(String[] args) {
        AppLog.init("refresh_xiaoha_chart");
        boolean done = false;
        int retryCount = 0;
        do {
            Date date = new Date();
            String log = "time now: " + DateFormat.getInstance().format(date);
            AppLog.d(log);
            AppLog.e("DAEMON working");

            try {
                boolean success = new XiaohaChartSync().sync();
                if (!success) {
                    throw new ErrorInfo(1, "sync fail");
                }
                AppLog.e("sync done");
                done = true;
            } catch (Exception e) {
                AppLog.e(e.getMessage(), e);
                AppLog.e("DAEMON Stop at exception");
                retryCount++;
                if (retryCount == 5) {
                    sendSms("refresh currency rate fail.");
                    done = true;
                }
            }
        } while (!done);
    }


    private static void sendSms(String msg) {
        try {
            String env = "";
            try {
                env = Qconf.getConf("platform/environment");
            } catch (QconfException e) {
                e.printStackTrace();
            }
            new GooseAoStub().sendUserNotificationSms("18576421291", env + ": " + msg);
        } catch (TException e1) {
            AppLog.e(e1.getMessage(), e1);
        }
    }
}
