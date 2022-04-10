package dev.patika.restservice.controller;


import dev.patika.restservice.exceptions.PatikaDevBootcampControllerException;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

@RestControllerAdvice
@Slf4j
public class RestServiceControllerAdvice extends ResponseEntityExceptionHandler {


    @ExceptionHandler(PatikaDevBootcampControllerException.class)
    public PatikaError onNullPointerExceptionHandled(PatikaDevBootcampControllerException exception) {
        return new PatikaError(exception.getMessage(), false);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<?> onConstraintViolationExceptionHandle(ConstraintViolationException exception) {
        return ResponseEntity.badRequest().body(exception.getConstraintViolations().stream().map(ConstraintViolation::getMessage).toList());
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String parameterName = ex.getParameter().getParameterName();
        Class<?> parameterType = ex.getParameter().getParameterType();
        String message = ex.getMessage();
        log.info("{},{},{}", parameterName, parameterType, message);
        return ResponseEntity.badRequest().body(message);
    }


    @Override
    protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String parameterName = ex.getParameterName();
        String parameterType = ex.getParameterType();
        log.info("Parameter Name -> {}, Parameter Type -> {}", parameterName, parameterType);
        return ResponseEntity.ok(new PatikaError("Parameter Not Valid", false));
    }

    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return super.handleHttpRequestMethodNotSupported(ex, headers, status, request);
    }

    @Getter
    @Setter
    public static class PatikaError {
        public String message;
        public boolean isOk;

        public PatikaError(String message, boolean isOk) {
            this.message = message;
            this.isOk = isOk;
        }
    }
}
