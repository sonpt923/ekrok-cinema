package com.example.service;

public interface MyDictionary {

    String get(String key, Object[] params);

    String get(String key, Object param);

    String get(String key);

    String get(String key, Object param1, Object param2);

    String get(String key, Object param1, Object param2, Object param3);

}
