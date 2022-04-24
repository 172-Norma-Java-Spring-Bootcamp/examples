package org.patikadev.orderexample.exception;

public final class ValidationOperationException {

    private ValidationOperationException() {
    }

    public static class CustomerNotValidException extends BaseException {
        public CustomerNotValidException(String message) {
            super(message);
        }
    }

    public static class ProductNotValidException extends BaseException {
        public ProductNotValidException(String message) {
            super(message);
        }
    }

    public static class CustomerIDNotValidException extends BaseException {
        public CustomerIDNotValidException(String message) {
            super(message);
        }
    }

}
