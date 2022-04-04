package dev.patika.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
@Slf4j
public class CustomRepositoryImpl implements CustomRepository {

    @PostConstruct
    public void init() {
        log.info("Custom Repository Implementation initialized.");
    }


    @PreDestroy
    public void onDestroy() {
        log.info("Custom Repository Implementation destroyed.");
    }

    @Override
    public void printMyName(String name) {
        log.info("My name is -> [{}]", name);
    }
}
