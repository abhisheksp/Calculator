package com.thoughtworks.calculator;

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
        if(operation.equals("add")) {
            return calculator.add(operand);
        }
        else if (operation.equals("subtract")){
            return calculator.subtract(operand);
        }
        else if(operation.equals("multiply")) {
            return calculator.multiply(operand);
        }
        else if (operation.equals("divide")) {
            return calculator.divide(operand);
        }
            return 0;
    }
}
