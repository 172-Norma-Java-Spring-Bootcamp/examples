package dev.patika.spring.service;

import dev.patika.spring.model.Product;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private final Map<String, Product> products = new HashMap<>();

    //Method instance yaratildiktan sonra cagirilacak.
    public void onInit() {
        createProducts();
    }

    @Override
    public Product findByKey(String key) {
        return products.get(key);
    }

    private void createProducts() {
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Computer");
        p1.setPrice(BigDecimal.valueOf(10_000));

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Phone");
        p2.setPrice(BigDecimal.valueOf(1_000));

        products.put("C", p1);
        products.put("P", p2);
    }
}
