package org.patikadev.springsecurityjwtapi.repository;

import org.patikadev.springsecurityjwtapi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
