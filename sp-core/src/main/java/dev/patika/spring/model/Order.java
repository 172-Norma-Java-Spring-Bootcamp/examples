package dev.patika.spring.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Integer id;
    private Date orderedDate;
    private Date deliveryDate;
    private List<OrderItem> items = new ArrayList<>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(Date orderedDate) {
        this.orderedDate = orderedDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public BigDecimal getTotalPrice() {
        return items.stream()
                .map(OrderItem::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void addItem(OrderItem orderItem) {
        this.items.add(orderItem);
    }

    public void addItems(List<OrderItem> items) {
        this.items.addAll(items);
    }
}
