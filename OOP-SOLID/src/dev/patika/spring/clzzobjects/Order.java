package dev.patika.spring.clzzobjects;

/**
 * Username = baranbuyuk
 * Date = 29.07.2021 21:11
 **/

import java.math.BigDecimal;
import java.util.List;

/**
 * below topics should be mention for class structure
 * 1- access modifiers for class, variables and methods.
 * 2- variables
 * 3- methods
 * 4- constructors, constructors with parameters
 */
public class Order {

    /**
     * default protected
     * it can accessible from same package and in this class
     * should i mention about the package structure?
     */
    List<OrderItem> items;

    /**
     * it can accessible from everywhere via instance of this class
     */
    public BigDecimal amount;

    /**
     * this field  can not accessible from anywhere expect in this class
     */
    private BigDecimal vatIncludedAmount;

    public Order() {
    }

    public Order(List<OrderItem> items, BigDecimal amount, BigDecimal vatIncludedAmount) {
        this.items = items;
        this.amount = amount;
        this.vatIncludedAmount = vatIncludedAmount;
    }

}
