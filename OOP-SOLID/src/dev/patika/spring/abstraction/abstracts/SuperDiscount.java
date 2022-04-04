package dev.patika.spring.abstraction.abstracts;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Username = baranbuyuk
 * Date = 29.07.2021 23:13
 **/
public class SuperDiscount extends Discount {

    private static final BigDecimal RATE = new BigDecimal(80);

    protected SuperDiscount(BigDecimal amount) {
        super(amount);
    }

    //there is better solution for this abstraction..
    @Override
    protected BigDecimal calculate() {
        return getAmount().subtract(getAmount()
                .multiply(RATE)
                .divide(new BigDecimal(100), RoundingMode.FLOOR));
    }
}
