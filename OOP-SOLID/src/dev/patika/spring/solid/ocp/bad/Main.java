package dev.patika.spring.solid.ocp.bad;

public class Main {

    public static void main(String[] args) {
        CalculatorOperation addition = new Addition(0, 2);
        CalculatorOperation subtract = new Subtraction(0, 2);
        Calculator calculator = new Calculator();
        calculator.calculate(addition);
        calculator.calculate(subtract);
        CalculatorOperation division = new Division(12, 2);
        calculator.calculate(division);
    }
}
