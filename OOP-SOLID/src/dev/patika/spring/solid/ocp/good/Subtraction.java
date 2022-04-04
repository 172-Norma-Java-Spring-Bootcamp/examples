package dev.patika.spring.solid.ocp.good;

public class Subtraction implements CalculatorOperation {

    private double left;
    private double right;
    private double result;

    public Subtraction(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void perform() {
        result = left + right;
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
