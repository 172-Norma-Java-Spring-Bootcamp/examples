package dev.patika.springboot;

import org.springframework.boot.web.servlet.server.Encoding;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public Encoding encoding() {
        return new Encoding();
    }
}
