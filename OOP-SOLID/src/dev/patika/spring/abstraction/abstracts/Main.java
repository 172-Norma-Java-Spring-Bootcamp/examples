package dev.patika.spring.abstraction.abstracts;

import java.math.BigDecimal;

/**
 * Username = baranbuyuk
 * Date = 29.07.2021 23:15
 **/

/**
 * Below topics should be mention
 * 1-What is abstract method and non-abstract methods in the abstract classes
 * 2-What is final methods in abstract classes?
 */
public class Main {

    public static void main(String[] args) {

        Discount dailyDiscount = new DailyDiscount(new BigDecimal(100));
        System.out.println(dailyDiscount.calculate());
        dailyDiscount.nonAbstractCalculate();

        Discount superDiscount = new SuperDiscount(new BigDecimal(100));
        System.out.println(superDiscount.calculate());
        superDiscount.nonAbstractCalculate();

    }
}
