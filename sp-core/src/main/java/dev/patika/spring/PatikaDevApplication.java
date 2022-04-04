package dev.patika.spring;


import dev.patika.spring.controller.OrderController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatikaDevApplication {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext();
        classPathXmlApplicationContext.setConfigLocation("configuration.xml");


        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("dev.patika.spring");
        annotationConfigApplicationContext.setParent(classPathXmlApplicationContext);

        OrderController orderController = classPathXmlApplicationContext.getBean("orderController", OrderController.class);
        orderController.createOrder();


    }
}
