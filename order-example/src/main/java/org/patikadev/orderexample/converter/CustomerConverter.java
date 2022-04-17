package org.patikadev.orderexample.converter;

import org.patikadev.orderexample.dto.CustomerDTO;
import org.patikadev.orderexample.model.Customer;

public interface CustomerConverter {

    Customer convert(CustomerDTO customerDTO);

    CustomerDTO convert(Customer customer);
}
