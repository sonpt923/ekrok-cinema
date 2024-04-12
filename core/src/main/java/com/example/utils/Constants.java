package com.example.utils;

public class Constants {

    public interface ROLE_CODE {
        String CLIENT = "CLIENT";

        String STAFF = "STAFF";

        String ADMIN = "ADMIN";
    }

    public interface STATUS {
        Long ACTIVE = 0L;
        Long IN_ACTIVE = 1L;
    }


    public static final String TOKEN_TYPE = "Bearer ";

    public static final String TEMPLE_SPLIT = "|!@#$%^&*()|";


    public interface TYPE_QUESTION_ITEM {
        String SINGLE = "Single";

        String GROUP = "Group";
    }



}
