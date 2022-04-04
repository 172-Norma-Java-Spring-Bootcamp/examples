package dev.patika.spring.service;

import dev.patika.spring.model.Product;

public interface ProductService {

    Product findByKey(String key);
}
