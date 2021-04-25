package xueqiao.graph.xiaoha.chart.storage;

import org.apache.commons.lang.StringUtils;
import org.soldier.base.logger.AppLog;
import org.soldier.base.sql.SqlQueryBuilder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Utils {

    public static Set<String> strings2Set(String tagStrs) {
        String[] tagArray = StringUtils.split(tagStrs, ",");
        Set<String> tags = new HashSet<>();
        for (String tag : tagArray) {
            tags.add(tag);
        }
        return tags;
    }

    public static Set<Long> string2LongSet(String strs) {
        String[] array = StringUtils.split(strs, ",");
        Set<Long> ids = new HashSet<>();
        for (String id : array) {
            try {
                ids.add(Long.valueOf(id));
            } catch (Exception e) {
                AppLog.e(e.getMessage(), e);
            }
        }
        return ids;
    }

    public static String getConditionORString(List<String> columns) {
        return getConditionString(columns, SqlQueryBuilder.ConditionType.OR);
    }

    public static String[] getConditionValues(List<String> values) {
        String[] array = new String[values.size()];
        int i = 0;
        for (String s : values) {
            array[i] = "%" + s + "%";
            i++;
        }
        return array;
    }

    public static String getConditionString(List<String> columns, SqlQueryBuilder.ConditionType type) {
        String typeStr = SqlQueryBuilder.ConditionType.AND.equals(type) ? "AND" : "OR";
        boolean first = true;
        StringBuffer buffer = new StringBuffer(128);
        for (String column : columns) {
            if (first) {
                buffer.append(" ");
            } else {
                buffer.append(" ");
                buffer.append(typeStr);
                buffer.append(" ");
            }

            buffer.append("(");
            buffer.append(column);
            buffer.append(" like ? ");
            buffer.append(")");
            first = false;
        }
        return buffer.toString();
    }
}
