package org.patikadev.orderexample.exception;

public final class ServiceOperationException {

    private ServiceOperationException() {
    }

    public static class CustomerNotFoundException extends BaseException {
        public CustomerNotFoundException(String message) {
            super(message);
        }
    }
}
