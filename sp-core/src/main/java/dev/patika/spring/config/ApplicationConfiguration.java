package dev.patika.spring.config;

import dev.patika.spring.service.CustomerService;
import dev.patika.spring.service.CustomerServiceImpl;
import dev.patika.spring.service.OrderService;
import dev.patika.spring.service.ProductService;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration  {


    private ProductService productService;
    private OrderService orderService;


    @Bean
    public CustomerService customerService() {
        return new CustomerServiceImpl(orderService, productService);
    }


    public void setProductService(@Autowired ProductService productService) {
        this.productService = productService;
    }


    public void setOrderService(@Autowired OrderService orderService) {
        this.orderService = orderService;
    }
}
