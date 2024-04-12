package com.example.utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExceptionUtils {

    public static void printException(Exception e, String url, Object message) {
        log.error("Tracking {} {}", e.getClass(), e.getMessage());
        log.error("URL {}", url);
        log.info("Message {}", message);
    }
}
