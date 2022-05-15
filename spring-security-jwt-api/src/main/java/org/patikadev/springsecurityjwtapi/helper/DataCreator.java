package org.patikadev.springsecurityjwtapi.helper;

import org.patikadev.springsecurityjwtapi.entity.Customer;
import org.patikadev.springsecurityjwtapi.entity.Role;
import org.patikadev.springsecurityjwtapi.entity.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public final class DataCreator {


    private DataCreator() {
        throw new UnsupportedOperationException();
    }

    public static Collection<User> createUsers() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        User user = new User();
        user.setUsername("baran");
        user.setPassword(passwordEncoder.encode("password"));
        Role adminRole = new Role();
        adminRole.setName("ROLE_ADMIN");
        user.addRoles(Collections.singleton(adminRole));
        return Collections.singletonList(user);
    }

    public static Collection<Customer> createCustomers() {
        Customer customer = new Customer();
        customer.setName("Google");
        Customer customer1 = new Customer();
        customer.setName("Microsoft");
        return Arrays.asList(customer1, customer);
    }
}
