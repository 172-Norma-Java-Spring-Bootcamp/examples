package dev.patika.spring.controller;

import dev.patika.spring.service.OrderService;

public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public void createOrder() {
        System.out.println(orderService.createOrder());
    }
}
