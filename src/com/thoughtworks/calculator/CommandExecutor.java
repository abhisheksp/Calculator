package com.thoughtworks.calculator;
//CommandExecutor accepts an operand and an operator maps and calls the appropriate calculator method
public class CommandExecutor {

    private String operation;
    private double operand;

    public CommandExecutor(String operation, double operand) {
        this.operation = operation;
        this.operand = operand;
    }

    public CommandExecutor(String operation) {
        this.operation = operation;
    }

    public double executes(Calculator calculator) {
        if (operation.equals("add")) {
            return calculator.add(operand);
        } else if (operation.equals("subtract")) {
            return calculator.subtract(operand);
        } else if (operation.equals("multiply")) {
            return calculator.multiply(operand);
        } else if (operation.equals("divide")) {
            return calculator.divide(operand);
        } else if (operation.equals("sqr")) {
            return calculator.square();
        } else if (operation.equals("sqrt")) {
            return calculator.squareRoot();
        } else if (operation.equals("neg")) {
            return calculator.negativeOf();
        } else if (operation.equals("abs")) {
            return calculator.absoluteOf();
        } else
            return 0;
    }
}
