package org.patikadev.orderexample.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.patikadev.orderexample.converter.CustomerConverter;
import org.patikadev.orderexample.dto.CustomerDTO;
import org.patikadev.orderexample.exception.ServiceOperationException;
import org.patikadev.orderexample.model.Customer;
import org.patikadev.orderexample.model.Gender;
import org.patikadev.orderexample.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    private final CustomerConverter customerConverter;
    private final CustomerRepository customerRepository;

    @Override
    public void create(CustomerDTO customerDTO) {
        Customer customer = customerConverter.convert(customerDTO);
        log.info("Customer ID should be null -> {}", customer.getId());
        customerRepository.save(customer);
        log.info("Customer ID should not be null -> {}", customer.getId());

        customer.setGender(Gender.OTHER);
        customerRepository.save(customer);

        throw new RuntimeException("Exception occurred");

    }

    @Override
    public CustomerDTO getCustomer(Long id) {
        Customer customer = customerRepository
                .findById(id)
                .orElseThrow(() -> new ServiceOperationException.CustomerNotFoundException("Customer not found"));
        return customerConverter.convert(customer);
    }
}
