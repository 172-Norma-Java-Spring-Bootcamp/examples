package org.patikadev.springsecurityjwtapi.config;

import lombok.RequiredArgsConstructor;
import org.patikadev.springsecurityjwtapi.entity.Customer;
import org.patikadev.springsecurityjwtapi.entity.User;
import org.patikadev.springsecurityjwtapi.helper.DataCreator;
import org.patikadev.springsecurityjwtapi.repository.CustomerRepository;
import org.patikadev.springsecurityjwtapi.repository.UserRepository;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Collection;

@Configuration
@RequiredArgsConstructor
public class InitializerConfig {

    private final UserRepository userRepository;
    private final CustomerRepository customerRepository;


    @PostConstruct
    public void onInit() {
        Collection<User> users = DataCreator.createUsers();
        Collection<Customer> customers = DataCreator.createCustomers();
        userRepository.saveAll(users);
        customerRepository.saveAll(customers);

    }
}
