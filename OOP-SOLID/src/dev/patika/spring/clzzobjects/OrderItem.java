package dev.patika.spring.clzzobjects;

import java.math.BigDecimal;

/**
 * Username = baranbuyuk
 * Date = 29.07.2021 21:16
 **/
public class OrderItem {

    private String name;
    private String amount;
    private BigDecimal quantity;
    private int lineOrder;

    public OrderItem() {
    }

    public OrderItem(String name, String amount, BigDecimal quantity, int lineOrder) {
        this.name = name;
        this.amount = amount;
        this.quantity = quantity;
        this.lineOrder = lineOrder;
    }

    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public int getLineOrder() {
        return lineOrder;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public void setLineOrder(int lineOrder) {
        this.lineOrder = lineOrder;
    }
}
