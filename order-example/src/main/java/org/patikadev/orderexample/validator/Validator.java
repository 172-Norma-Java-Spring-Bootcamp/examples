package org.patikadev.orderexample.validator;

import org.patikadev.orderexample.exception.BaseValidationException;

public interface Validator<T> {

    void validate(T input) throws BaseValidationException;
}
