package com.example.exception;

public class UnauthorizationException extends AppException {

    public UnauthorizationException(String code, String message) {
        super(code, message);
    }

    public UnauthorizationException(String message) {
        super(message);
    }

    public UnauthorizationException() {
        super("You don't have permission access to resource!!");
    }

}