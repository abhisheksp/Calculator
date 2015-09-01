package com.thoughtworks.calculator;

import java.util.HashMap;
import java.util.Map;

//CommandExecutor accepts an operand and an operator maps and calls the appropriate calculator method
public class CommandExecutor {

    private String operation;
    private double operand;
    public static Map<String, ArithmeticOperation> configuration = new HashMap<String, ArithmeticOperation>();
    public CommandExecutor(String operation, double operand) {
        this.operation = operation;
        this.operand = operand;
    }

    public CommandExecutor(String operation) {
        this.operation = operation;
        this.operand = 0.0;
    }

    public double executes(Calculator calculator) {
        return configuration.get(operation).evaluate(operand);
    }
}
