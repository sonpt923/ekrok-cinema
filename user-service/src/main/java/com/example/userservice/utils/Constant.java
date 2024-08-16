package com.example.userservice.utils;

import com.example.utils.BaseConstants;

public class Constant extends BaseConstants {

    public static final Long OTP_TIME = 60L;

    public interface AP_DOMAIN {

        String OTP_CODE = "OTP";

    }

    public interface user {

        Integer ACTIVE = 1;

        Integer IN_ACTIVE = 0;

    }

    public interface mail_type {

        String CREATE = "C";

        String UPDATE = "U";

        String IN_ACTIVE = "I";

    }

    public static final Integer OTP_LENGTH = 9;

}
