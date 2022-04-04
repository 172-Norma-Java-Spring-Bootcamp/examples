package dev.patika.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Controller
@Slf4j
public class CustomController {

    @PostConstruct
    public void init() {
        log.info("Custom Controller Implementation initialized.");
    }

    @PreDestroy
    public void onDestroy() {
        log.info("Custom Controller Implementation destroyed.");
    }

    public void printMyName(String name){
        log.info("My name is -> [{}]", name);
    }
}
