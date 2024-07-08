package com.example.cinemaservice.utils;

public class Constant {

    public static final Integer CODE_LENGTH = 8;

    public interface chair {

        Integer AVAILABLE = 0;

        Integer RESERVED = 1;

        Integer BOOKED = 3;

        Integer UNVAILABLE = 4;

    }

    public interface room {

        Integer SHOWING = 0;

        Integer NOT_SHOWING = 1;

        Integer CLEANING = 2;

        Integer TECHNICAL_CHECK = 3;

        Integer PREPARING_FOR_NEXT_SHOW = 4;

        Integer CLOSED = 5;

    }

}
