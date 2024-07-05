package com.example.exception;

public class SystemException extends AppException {

    public SystemException(String code, String message) {
        super(code, message);
    }

    public SystemException(String message) {
        super(message);
    }
}
