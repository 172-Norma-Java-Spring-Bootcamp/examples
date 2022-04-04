package dev.patika.spring.polyphormism;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 00:36
 **/
public class Main {

    public static void main(String[] args) {

        Calculator.sum(1, 2);
        Calculator.sum(2, 5);
        Calculator.sum(1, 2, 3);

        Calculator.sum(Calculator.sum(1, 2), Calculator.sum(1, 2, 3));

        Calculator.sum(Calculator.sum(1, Calculator.sum(1, 2), Calculator.sum(1, 2)), 2);
    }
}
