package org.patikadev.orderexample.exception;

import java.io.File;

public class BaseException extends RuntimeException {

    private final String message;

    public BaseException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
