package org.patikadev.orderexample.repository;

import org.patikadev.orderexample.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Collection<Customer> findAllByIsDeleted(boolean deleted);

    @Query("SELECT c FROM Customer c WHERE c.isDeleted = ?1")
    Collection<Customer> findAllCustomersByDeleteStatusByJPQL(boolean status);
}
