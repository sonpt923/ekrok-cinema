package com.example.exception;

import lombok.Data;

@Data
public class AppException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String code;
    private String message;

    public AppException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public AppException(Exception e, String message) {
        super(e);
        this.message = message;
    }

    public AppException(Exception e, String code, String message) {
        super(e);
        this.code = code;
        this.message = message;
    }

    public AppException withErrorCode(String code) {
        this.code = code;
        return this;
    }

    public AppException(String msg) {
        super(msg);
    }
}
