package org.patikadev.springsecurityjwtapi.controller;

import lombok.RequiredArgsConstructor;
import org.patikadev.springsecurityjwtapi.repository.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerRepository customerRepository;


    @GetMapping
    public ResponseEntity<?> getCustomers() {
        return ResponseEntity.ok(customerRepository.findAll());
    }
}
