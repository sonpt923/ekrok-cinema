
package com.example.utils;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

public class StringUtil {

    public static String nvl(Object objInput, String strNullValue) {
        if (objInput == null)
            return strNullValue;
        return objInput.toString();
    }

    public static String generatorCurrentDateTime() {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateUtil.FORMAT_DATE_TIME4);
        String formattedTime = currentTime.format(formatter);
        return formattedTime;
    }

    public static boolean stringIsNullOrEmty(String str) {
        if (str == null)
            return true;
        else {
            if (str.trim().length() <= 0)
                return true;
        }
        return false;
    }

    public static boolean stringIsNullOrEmty(Object str) {
        if (str == null)
            return true;
        else {
            if (str.toString().trim().length() <= 0)
                return true;
        }
        return false;
    }

    public static String generateString(int length) {
        String str = UUID.randomUUID().toString();
        str = str.replaceAll("\\D", "");
        if (str.length() < length) {
            str = StringUtils.repeat("0", length - str.length()) + str;
        }
        return str.substring(0, length);
    }


    public static boolean isListEmpty(List lst) {
        return lst == null || lst.isEmpty();
    }

    public static String generateString() {
        String str = UUID.randomUUID().toString();
        String[] strings = str.split("\\D");
        for (String s : strings) {

        }
    }

}