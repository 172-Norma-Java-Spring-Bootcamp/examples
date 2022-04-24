package org.patikadev.orderexample.service;

import org.patikadev.orderexample.dto.CreateCustomerRequestDTO;
import org.patikadev.orderexample.dto.GetCustomersResponseDTO;
import org.patikadev.orderexample.exception.BaseException;

import java.util.Collection;

public interface CustomerService {
    void create(CreateCustomerRequestDTO customerDTO);

    CreateCustomerRequestDTO getCustomer(Long id) throws BaseException;

    Collection<GetCustomersResponseDTO> getCustomers();

    void delete(Long id, boolean hardDelete) throws BaseException;
}
