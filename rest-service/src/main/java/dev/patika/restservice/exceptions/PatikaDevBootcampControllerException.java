package dev.patika.restservice.exceptions;

public class PatikaDevBootcampControllerException extends Exception {

    public PatikaDevBootcampControllerException() {
    }

    public PatikaDevBootcampControllerException(String message) {
        super(message);
    }

    public PatikaDevBootcampControllerException(String message, Throwable cause) {
        super(message, cause);
    }
}
