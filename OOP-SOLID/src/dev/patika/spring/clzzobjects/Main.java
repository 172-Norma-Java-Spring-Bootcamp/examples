package dev.patika.spring.clzzobjects;

/**
 * Username = baranbuyuk
 * Date = 29.07.2021 21:26
 **/

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

/**
 * below topics should be mention.
 * 1- How to create an instance from a class
 * 2- How to access to field in a class via instance.
 * 3- What is constructor, what is the purpose of it? What is with arg parameters constructor?
 * 4- What is private constructor?
 */
public class Main{

    // if the listeners want to know what is main method and how it works, mention about it.
    public static void main(String[] args) {


        //Create new instance from Order.
        // when we create an new instance from order, we've called a no-args constructor of this class.
        Order orderInstanceWithNoArgsConstructor = new Order();  // this parentheses show us that no-args parameter we've called
        // now we have an instance from Order class.. JVM allocate this instance in the Heap area.


        // now we can access to some fields on the class which is marked as public or protected
        BigDecimal amount = orderInstanceWithNoArgsConstructor.amount; // we should expect that amount is null;
        List<OrderItem> orderItems = orderInstanceWithNoArgsConstructor.items; // we should expect that orderItems is null;
        // we can not access the field which is marked as private modifier access.

        System.out.println(amount == null);
        System.out.println(orderItems == null);


        Order orderInstanceWithArgConstructor = new Order(Collections.emptyList(), new BigDecimal(100), new BigDecimal(18));
        //now we have a new instance from Order class..
        //each instance different from other

        System.out.printf("Order Instances different is -> %s \n", orderInstanceWithArgConstructor.equals(orderInstanceWithNoArgsConstructor));

        BigDecimal amountWithArgs = orderInstanceWithArgConstructor.amount; // we should expect amount is 100
        List<OrderItem> orderItemsWithArgs = orderInstanceWithArgConstructor.items; // we should amount is empty
        // we can not access the field which is marked as private modifier access.

        System.out.println(amountWithArgs == null);
        System.out.println(orderItemsWithArgs == null);

        // any question?

    }
}
