package dev.patika.restservice.exceptions;

public class RequestParameterNotValidException extends PatikaDevBootcampControllerException {

    public RequestParameterNotValidException() {
        super();
    }

    public RequestParameterNotValidException(String message) {
        super(message);
    }

    public RequestParameterNotValidException(String message, Throwable cause) {
        super(message, cause);
    }
}
