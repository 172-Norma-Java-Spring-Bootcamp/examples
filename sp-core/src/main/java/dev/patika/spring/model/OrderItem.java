package dev.patika.spring.model;

import java.math.BigDecimal;

public class OrderItem {

    private Integer id;
    private Product product;
    private BigDecimal quantity;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        // 300.00 TL x 2 = 600
        return product.getPrice().multiply(quantity);
    }

}
