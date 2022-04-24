package org.patikadev.springsecurity.configuration;

import lombok.RequiredArgsConstructor;
import org.patikadev.springsecurity.entities.MyUser;
import org.patikadev.springsecurity.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class UserCreateService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @PostConstruct
    public void onInit() {
        MyUser user = new MyUser();
        user.setPassword(passwordEncoder.encode("password"));
        user.setUsername("BaranBuyuk");
        userRepository.save(user);
    }
}
