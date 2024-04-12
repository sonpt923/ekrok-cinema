package com.example.exception;

import lombok.Getter;
import lombok.Setter;

public class AppException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private int code;
    private String message;

    public AppException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public AppException(Exception e, String message) {
        super(e);
        this.message = message;
    }

    public AppException(Exception e, int code, String message) {
        super(e);
        this.code = code;
        this.message = message;
    }

    public AppException withErrorCode(int code) {
        this.code = code;
        return this;
    }

    public AppException(String msg) {
        super(msg);
    }
}
