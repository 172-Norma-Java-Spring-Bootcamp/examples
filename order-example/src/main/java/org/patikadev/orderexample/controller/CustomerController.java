package org.patikadev.orderexample.controller;

import lombok.RequiredArgsConstructor;
import org.patikadev.orderexample.dto.CreateCustomerRequestDTO;
import org.patikadev.orderexample.dto.GetCustomersResponseDTO;
import org.patikadev.orderexample.service.CustomerService;
import org.patikadev.orderexample.validator.Validator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/customers")
public class CustomerController {

    private final Validator<CreateCustomerRequestDTO> createCustomerValidator;
    private final Validator<Long> customerIdValidator;
    private final CustomerService customerService;


    @PostMapping
    public ResponseEntity<?> create(@RequestBody CreateCustomerRequestDTO createCustomerRequestDTO) {
        createCustomerValidator.validate(createCustomerRequestDTO);
        customerService.create(createCustomerRequestDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Collection<GetCustomersResponseDTO>> getCustomers() {
        return ResponseEntity.ok(customerService.getCustomers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CreateCustomerRequestDTO> getCustomer(@PathVariable Long id) {
        customerIdValidator.validate(id);
        return ResponseEntity.ok(customerService.getCustomer(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id,
                                    @RequestParam(name = "hardDelete", required = false) boolean hardDelete) {
        customerIdValidator.validate(id);
        customerService.delete(id,hardDelete);
        return ResponseEntity.ok().build();
    }


}
