package com.thoughtworks.calculator;

import java.util.HashMap;
import java.util.Map;

//CommandExecutor accepts an operand and an operator maps and calls the appropriate calculator method
public class CommandExecutor {

    private String operation;
    private double operand;
    private static Map<String, ArithmeticOperation> configuration = new HashMap<String, ArithmeticOperation>();
    public CommandExecutor(String operation, double operand) {
        this.operation = operation;
        this.operand = operand;
    }

    public CommandExecutor(String operation) {
        this.operation = operation;
        this.operand = 0.0;
    }

    public double executes(Calculator calculator) {
        configure(calculator);
        return configuration.get(operation).evaluate(operand);
    }

    public void configure(final Calculator calculator) {
        CommandExecutor.configuration.put("add", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.add(operand);
            }
        });

        CommandExecutor.configuration.put("subtract", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.subtract(operand);
            }
        });

        CommandExecutor.configuration.put("multiply", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.multiply(operand);
            }
        });

        CommandExecutor.configuration.put("divide", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.divide(operand);
            }
        });

        CommandExecutor.configuration.put("sqr", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.square();
            }
        });

        CommandExecutor.configuration.put("sqrt", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.squareRoot();
            }
        });

        CommandExecutor.configuration.put("cube", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.cube();
            }
        });

        CommandExecutor.configuration.put("cubert", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.cubeRoot();
            }
        });

        CommandExecutor.configuration.put("neg", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.negativeOf();
            }
        });

        CommandExecutor.configuration.put("abs", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.absoluteOf();
            }
        });

        CommandExecutor.configuration.put("cancel", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.cancel();
            }
        });
    }
}
