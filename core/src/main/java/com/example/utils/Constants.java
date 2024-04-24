package com.example.utils;

public class Constants {

    public static final String SUCCESSFUL = "API000";
    public static final String SUCCESS = "SUCCESS";

    public static final String ERROR = "ERROR";
    public static final String ERROR_STATUS_ALIAS = "APP982";

    public static final String AUTOMATIC_LINKING_ACCOUT = "AUTOMATIC_LINKING_ACCOUT";

    public static final String ERROR_SYSTEM = "APP001";
    public static final String ERROR_DUPLICATE = "APP002";

    public static final String ERROR_NOT_NULL = "APP003";
    public static final String ERROR_USER_NAME_EMAIL_EXIST = "APP004";
    public static final String ERROR_NOT_DECLARE = "APP005";

    public static final String ERROR_NOT_HAVE_PERMISSION = "APP006";

    public static final String ERROR_USER_NAME_EMAIL_NOT_EXIST = "APP007";

    public static final String ERROR_UNIQUE = "API500";

    public static final String ERROR_LOGIC = "API501";
    public static final String ERROR_DATA_USING = "API502";

    public static final String ERROR_DATA_NOT_FOUND = "API503";

    public static final String ERROR_MAX_LENGTH = "APP300";

    public static final String ERROR_PASSWORD = "APP301";

    public static final String ERROR_PASSWORD_NOT_NULL = "APP302";

    public static final String ERROR_APP_NOT_COMPARE = "APP303";

    public static final String PERMIT = "APP304";

    public static final String ERROR_APP305 = "APP305";

    public static final String ERROR_APP306 = "APP306";

    public static final String ERROR_PASS_001 = "APP003";

    public static final String ERROR_PASS_002 = "APP004";

    public static final String ERROR_PASS_003 = "APP005";

    public static final String ERROR_PASS_004 = "APP006";

    public static final String ERROR_PASS_007 = "APP007";

    public static final String ERROR_PASS_008 = "APP008";

    public static final String ERROR_OTP_000 = "OTP000";

    public static final String ERROR_OTP_001 = "OTP001";

    public static final String ERROR_LOCK_TIME = "APP999";

    public static final String ERROR_CREATE_STAFF = "API504";


    public interface ROLE_CODE {
        String CLIENT = "CLIENT";

        String STAFF = "STAFF";

        String ADMIN = "ADMIN";
    }

    public interface STATUS {
        Long ACTIVE = 1L;
        Long IN_ACTIVE = 0L;
    }


    public static final String TOKEN_TYPE = "Bearer ";

    public static final String TEMPLE_SPLIT = "|!@#$%^&*()|";


    public interface TYPE_QUESTION_ITEM {
        String SINGLE = "Single";

        String GROUP = "Group";
    }


}
