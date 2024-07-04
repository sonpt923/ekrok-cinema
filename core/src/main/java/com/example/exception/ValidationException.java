package com.example.exception;

public class ValidationException extends AppException {

    public ValidationException(String code, String message) {
        super(code, message);
    }

    public ValidationException(String message) {
        super(message);
    }
}
