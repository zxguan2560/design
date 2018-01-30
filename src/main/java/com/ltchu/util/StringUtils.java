package com.ltchu.util;

public class StringUtils {

    public static Boolean isBlank(String str) {
        return (null == str || "".equals(str.trim())) ? true : false;
    }

    public static Boolean isNotBlank(String str) {
        return StringUtils.isBlank(str) ? false : true;
    }

    public static Boolean isNotBlank(String... strs) {
        for (String str : strs) {
            if (StringUtils.isBlank(str))
                return false;
        }
        return true;
    }
}
