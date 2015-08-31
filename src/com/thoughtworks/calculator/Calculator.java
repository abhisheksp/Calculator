package com.thoughtworks.calculator;
//calculator has a set of operations that it can perform on a number in its accumulator
public class Calculator {
    private double accumulator;

    public Calculator(double accumulator) {
        this.accumulator = accumulator;
    }

    public double add (double operand) {
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
        if(operand == 0)
            return Double.NaN;
        else {
            accumulator = accumulator / operand;
            return accumulator;
        }
    }
}
