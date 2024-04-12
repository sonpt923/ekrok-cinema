package com.example.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class ApplicationContextProvider {

    private static ApplicationContext context;

    private ApplicationContextProvider() {
    }

    public static ApplicationContext getApplicationContext() {
        return context;
    }

    public static <T> T getBean(String name, Class<T> aClass) {
        return context.getBean(name, aClass);
    }

    public static void setApplicationContext(ApplicationContext ctx) throws BeansException {
        context = ctx;
    }
}
