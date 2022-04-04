package dev.patika.spring.abstraction.interfaces;

import java.math.BigDecimal;


/**
 * 1- What is interface? What is purpose of Interface and where should we use it?
 * 2- What are differences between abstract classes and interfaces
 * 3-W hat is default method in the interfaces? Where should we use it?
 */
public class Main {

    public static void main(String[] args) {
        Discount dailyDiscount = new DailyDiscount(BigDecimal.valueOf(100));
        System.out.println(dailyDiscount.calculate());

        Discount superDiscount = new SuperDiscount(100);
        System.out.println(superDiscount.calculate());

    }
}
