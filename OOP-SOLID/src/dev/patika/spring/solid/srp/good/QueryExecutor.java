package dev.patika.spring.solid.srp.good;

import java.util.List;

public interface QueryExecutor {

    <T> List<T> execute(Class<T> returnClass, String query);
}
