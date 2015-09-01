package com.thoughtworks.calculator;

//calculator has a set of operations that it can perform on a number in its accumulator
public class Calculator {
    private double accumulator;

    public Calculator(double accumulator) {
        this.accumulator = accumulator;
    }

    public double add(double operand) {
        accumulator = accumulator + operand;
        return accumulator;
    }

    public double subtract(double operand) {
        accumulator = accumulator - operand;
        return accumulator;
    }

    public double multiply(double operand) {
        accumulator = accumulator * operand;
        return accumulator;
    }

    public double divide(double operand) {
        if (operand == 0)
            return Double.NaN;
        else {
            accumulator = accumulator / operand;
            return accumulator;
        }
    }

    public double square() {
        accumulator = accumulator * accumulator;
        return accumulator;
    }

    public double squareRoot() {
        if (accumulator < 0)
            return Double.NaN;
        else {
            accumulator = Math.sqrt(accumulator);
            return accumulator;
        }
    }

    public double negativeOf() {
        accumulator = -(accumulator);
        return accumulator;
    }

    public double absoluteOf() {
        accumulator =  Math.abs(accumulator);
        return accumulator;
    }

    public double cube() {
        accumulator = Math.pow(accumulator, 3);
        return accumulator;
    }

    public double accumulator() {
        return accumulator;
    }

    public double cancel() {
        accumulator = 0.0;
        return accumulator;
    }

    public double cubeRoot() {
        accumulator = Math.cbrt(accumulator);
        return accumulator;
    }
}
