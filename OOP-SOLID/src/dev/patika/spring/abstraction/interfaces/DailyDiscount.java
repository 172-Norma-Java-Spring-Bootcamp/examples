package dev.patika.spring.abstraction.interfaces;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 00:12
 **/
public class DailyDiscount implements Discount {

    public static final BigDecimal RATE = new BigDecimal(15);

    private final BigDecimal amount;

    public DailyDiscount(BigDecimal amount) {
        this.amount = amount;
    }

    public DailyDiscount(double amount) {
        this.amount = BigDecimal.valueOf(amount);
    }

    @Override
    public BigDecimal calculate() {
        return amount.subtract(amount
                .multiply(RATE)
                .divide(new BigDecimal(100), RoundingMode.FLOOR));
    }
}
