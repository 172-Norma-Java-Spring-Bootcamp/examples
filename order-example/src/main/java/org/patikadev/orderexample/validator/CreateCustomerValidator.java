package org.patikadev.orderexample.validator;

import org.patikadev.orderexample.dto.CustomerDTO;
import org.patikadev.orderexample.exception.BaseException;

public interface CreateCustomerValidator {
    void validate(CustomerDTO customerDTO) throws BaseException;
}
