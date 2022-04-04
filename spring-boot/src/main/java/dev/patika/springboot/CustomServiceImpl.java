package dev.patika.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Slf4j
public class CustomServiceImpl implements CustomService {

    @PostConstruct
    public void init() {
        log.info("Custom Service Implementation initialized.");
    }


    @PreDestroy
    public void onDestroy() {
        log.info("Custom Service Implementation destroyed.");
    }

    @Override
    public void printMyName(String name) {
        log.info("My name is -> [{}]", name);
    }
}
