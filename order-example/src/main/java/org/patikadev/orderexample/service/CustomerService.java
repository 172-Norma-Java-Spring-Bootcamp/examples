package org.patikadev.orderexample.service;

import org.patikadev.orderexample.dto.CustomerDTO;

public interface CustomerService {
    void create(CustomerDTO customerDTO);

    CustomerDTO getCustomer(Long id);
}
