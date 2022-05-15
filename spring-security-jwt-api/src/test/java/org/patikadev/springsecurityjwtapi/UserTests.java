package org.patikadev.springsecurityjwtapi;

import org.assertj.core.api.Assertions;
import org.hibernate.exception.ConstraintViolationException;
import org.junit.jupiter.api.Test;
import org.patikadev.springsecurityjwtapi.entity.Role;
import org.patikadev.springsecurityjwtapi.entity.User;
import org.patikadev.springsecurityjwtapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.Optional;
import java.util.Set;

@SpringBootTest
class UserTests {

    @Autowired
    public UserRepository userRepository;


    @Test
    void should_create_success_user() {
        User user = new User();
        user.setUsername("baranbuyuk");
        user.setPassword("password");
        Role adminRole = new Role();
        adminRole.setName("ROLE_ADMIN");
        Role userRole = new Role();
        userRole.setName("ROLE_USERS");
        user.addRoles(Set.of(adminRole, userRole));
        userRepository.save(user);
        Assertions.assertThat(user.getId()).isNotNull();
        Optional<User> optionalUser = userRepository.findById(user.getId());
        Assertions.assertThat(optionalUser).isPresent();
        User u = optionalUser.get();
        Assertions.assertThat(u.getUsername()).isNotEmpty();
        Assertions.assertThat(u.getUsername()).isEqualTo("baranbuyuk");
        Assertions.assertThat(u.getPassword()).isNotEmpty();
        Assertions.assertThat(u.getPassword()).isEqualTo("password");
        Assertions.assertThat(u.getRoles()).hasSize(2);
    }


    @Test
    void should_match_encoded_user_password() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        User user = new User();
        user.setUsername("baranbuyuk");
        user.setPassword(passwordEncoder.encode("password"));
        userRepository.save(user);
        Assertions.assertThat(user.getId()).isNotNull();
        Optional<User> optionalUser = userRepository.findById(user.getId());
        Assertions.assertThat(optionalUser).isPresent();
        User u = optionalUser.get();
        Assertions.assertThat(passwordEncoder.matches("password", u.getPassword())).isTrue();
    }

    @Test
    void should_not_match_when_type_wrong_password() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        User user = new User();
        user.setUsername("baranbuyuk");
        user.setPassword(passwordEncoder.encode("password"));
        userRepository.save(user);
        Assertions.assertThat(user.getId()).isNotNull();
        Optional<User> optionalUser = userRepository.findById(user.getId());
        Assertions.assertThat(optionalUser).isPresent();
        User u = optionalUser.get();
        Assertions.assertThat(passwordEncoder.matches("mypassword", u.getPassword())).isFalse();
    }

    //Araştırıp bulabilirsiniz.
    // Sorun transaction commit olmadan DB'ye yazmadığından dolayı, önce commitleyip, sonra tekrar yazmak gerekiyor.

   /* @Test
    void should_throw_uniqueConstraintException_when_create_duplicate_username() {
        User user = new User();
        user.setUsername("baranbuyuk");
        userRepository.save(user);

        User duplicateUser = new User();
        user.setUsername("baranbuyuk");
        userRepository.save(duplicateUser);

    }*/

}
