package org.patikadev.orderexample.controller;

import lombok.RequiredArgsConstructor;
import org.patikadev.orderexample.dto.CustomerDTO;
import org.patikadev.orderexample.exception.ControllerOperationException;
import org.patikadev.orderexample.service.CustomerService;
import org.patikadev.orderexample.validator.CreateCustomerValidator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/customers")
public class CustomerController {

    private final CreateCustomerValidator createCustomerValidator;
    private final CustomerService customerService;


    @PostMapping
    public ResponseEntity<?> create(@RequestBody CustomerDTO customerDTO) {
        createCustomerValidator.validate(customerDTO);
        customerService.create(customerDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable Long id) {
        if (id < 0) {
            throw new ControllerOperationException.CustomerIDNotValidException("Customer ID should be greater than zero.");
        }
        return ResponseEntity.ok(customerService.getCustomer(id));
    }
}
