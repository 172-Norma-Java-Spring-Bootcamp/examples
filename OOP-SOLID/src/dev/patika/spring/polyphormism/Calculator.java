package dev.patika.spring.polyphormism;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 00:28
 **/

/**
 * 1- What is final keyword on class definition?
 * 2- How to JVM understand differences between two or tree method which are same name ?
 */
public final class Calculator {

    private Calculator() {
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum(int y, int x, int z) {
        return x + y + z;
    }

    public static int sum(int... numbers) {
        var sumOfNumbers = 0;
        for (var number : numbers) {
            sumOfNumbers += number;
        }
        return sumOfNumbers;
    }
}
