package org.patikadev.orderexample.validator;

import org.patikadev.orderexample.dto.CreateCustomerRequestDTO;
import org.patikadev.orderexample.exception.BaseValidationException;
import org.patikadev.orderexample.exception.ValidationOperationException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Objects;

@Component
public class CreateCustomerRequestValidator implements Validator<CreateCustomerRequestDTO> {

    @Override
    public void validate(CreateCustomerRequestDTO customerDTO) throws BaseValidationException {
        // fail first approach.
        if (Objects.isNull(customerDTO)) {
            throw new ValidationOperationException.CustomerNotValidException("Customer can not be null or empty");
        }
        if (!(StringUtils.hasLength(customerDTO.userName()))) {
            throw new ValidationOperationException.CustomerNotValidException("Customer username can not be null or empty");
        }
        if (!(StringUtils.hasLength(customerDTO.password()))) {
            throw new ValidationOperationException.CustomerNotValidException("Customer password can not be null or empty");
        }
        if (Objects.isNull(customerDTO.identity())) {
            throw new ValidationOperationException.CustomerNotValidException("Customer identity can not be null or empty");
        }
        if (Objects.isNull(customerDTO.gender())) {
            throw new ValidationOperationException.CustomerNotValidException("Customer gender can not be null or empty");
        }
        // customer address should validate

    }
}
