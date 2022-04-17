package org.patikadev.orderexample.validator;

import org.patikadev.orderexample.dto.CustomerDTO;
import org.patikadev.orderexample.exception.BaseException;
import org.patikadev.orderexample.exception.ControllerOperationException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Objects;

@Component
public class CreateCustomerValidatorImpl implements CreateCustomerValidator {
    @Override
    public void validate(CustomerDTO customerDTO) throws BaseException {
        // fail first approach.
        if (Objects.isNull(customerDTO)) {
            throw new ControllerOperationException.CustomerNotValidException("Customer can not be null or empty");
        }
        if (!(StringUtils.hasLength(customerDTO.userName()))) {
            throw new ControllerOperationException.CustomerNotValidException("Customer username can not be null or empty");
        }
        if (!(StringUtils.hasLength(customerDTO.password()))) {
            throw new ControllerOperationException.CustomerNotValidException("Customer password can not be null or empty");
        }
        if (Objects.isNull(customerDTO.identity())) {
            throw new ControllerOperationException.CustomerNotValidException("Customer identity can not be null or empty");
        }
        if (Objects.isNull(customerDTO.gender())) {
            throw new ControllerOperationException.CustomerNotValidException("Customer gender can not be null or empty");
        }
        // customer address should validate

    }
}
