package org.patikadev.orderexample.converter;

import org.patikadev.orderexample.dto.CreateCustomerRequestDTO;
import org.patikadev.orderexample.dto.GetCustomersResponseDTO;
import org.patikadev.orderexample.model.Customer;

public interface CustomerConverter {

    Customer toCustomer(CreateCustomerRequestDTO createCustomerRequestDTO);

    CreateCustomerRequestDTO toCreateCustomerRequest(Customer customer);

    GetCustomersResponseDTO toGetCustomersResponse(Customer customer);
}
