package dev.patika.spring.solid.ocp.good;

import java.security.InvalidParameterException;

public class Calculator {

    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        operation.perform();

        // we took calculation responsibility
        // from this code block and given to implementations of calculator operation
        // When new feature is added such as multiply, we will just create a new implementation of CalculatorOperation.
    }
}