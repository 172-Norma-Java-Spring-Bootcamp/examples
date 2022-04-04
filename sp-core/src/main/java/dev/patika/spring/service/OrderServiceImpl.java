package dev.patika.spring.service;

import dev.patika.spring.model.Order;
import dev.patika.spring.model.OrderItem;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class OrderServiceImpl implements OrderService {


    private ProductService productService;

    @Override
    public UUID createOrder() {

        Order order = new Order();
        order.setId(1);
        order.setOrderedDate(new Date());
        order.setDeliveryDate(null);

        OrderItem computer = new OrderItem();
        computer.setProduct(productService.findByKey("C"));
        computer.setQuantity(BigDecimal.valueOf(3));

        OrderItem phone = new OrderItem();
        phone.setProduct(productService.findByKey("P"));
        phone.setQuantity(BigDecimal.ONE);
        order.addItems(Arrays.asList(computer, phone));

        // save order
        return UUID.randomUUID();
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}
