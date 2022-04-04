package dev.patika.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomComponentImpl implements CustomComponent {

    @Override
    public void printMyName(String name) {
        log.info("My name is -> [{}]", name);
    }
}
