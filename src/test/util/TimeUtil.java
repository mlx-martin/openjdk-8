package test.util;

import java.util.TimeZone;

public class TimeUtil {

    /**
     * 获取今日零点时间戳
     */
    public static Long getZeroTimestampOfToday() {
        long current = System.currentTimeMillis();
        return current/(1000*3600*24)*(1000*3600*24) - TimeZone.getDefault().getRawOffset();
    }
}
