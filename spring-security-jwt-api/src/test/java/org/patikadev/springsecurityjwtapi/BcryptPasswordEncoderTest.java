package org.patikadev.springsecurityjwtapi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
public class BcryptPasswordEncoderTest {

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    @Test
    void should_match_password_with_bcryptPasswordEncoder() {
        String password = "password";
        String encodedPassword = passwordEncoder.encode(password);
        Assertions.assertThat(encodedPassword).isNotEmpty();
        Assertions.assertThat(passwordEncoder.matches(password, encodedPassword)).isTrue();
    }
}
