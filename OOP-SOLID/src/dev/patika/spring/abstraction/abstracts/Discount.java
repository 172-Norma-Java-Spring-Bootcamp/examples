package dev.patika.spring.abstraction.abstracts;

import java.math.BigDecimal;

/**
 * Username = baranbuyuk
 * Date = 29.07.2021 23:06
 **/
public abstract class Discount {

    protected abstract BigDecimal calculate();

    protected void nonAbstractCalculate() {
        System.out.println(" There is no implementation of this method");
    }

    private final BigDecimal amount;


    protected Discount(BigDecimal amount) {
        this.amount = amount;
    }

    protected BigDecimal getAmount() {
        return amount;
    }

    public Long getDiscountDay() {
        return 9L;
    }

}
