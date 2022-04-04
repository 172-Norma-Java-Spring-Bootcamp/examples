package dev.patika.spring.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final OrderService orderService;
    private final ProductService productService;

    public CustomerServiceImpl(OrderService orderService, ProductService productService) {
        this.orderService = orderService;
        this.productService = productService;
    }

    @Override
    public void customOperation() {
    }


}
