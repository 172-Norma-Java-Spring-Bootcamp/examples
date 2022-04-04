package dev.patika.spring.solid.ocp.bad;

import java.security.InvalidParameterException;

public class Calculator {

    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }
        if (operation instanceof Addition addition) {
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if (operation instanceof Subtraction subtraction) {
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        } else if (operation instanceof Division division) {
            division.setResult(division.getLeft() / division.getRight());
        }
        //let's think about we will add a new feature that divide operation.
        //If we want to add new divide feature to this operation, we have to change this code block.
        //The new might cause a some bugs after add operation. This is not good OCP!
    }
}