package dev.patika.spring.solid.ocp.good;

public class Main {
    public static void main(String[] args) {
        CalculatorOperation divide = new Division(100, 2);
        CalculatorOperation add = new Addition(2, 2);
        Calculator calculator = new Calculator();
        calculator.calculate(divide);
        calculator.calculate(add);
        CalculatorOperation subtraction = new Subtraction(12, 22);
        calculator.calculate(subtraction);

    }
}
