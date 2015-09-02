package com.thoughtworks.calculator;

import java.util.HashMap;
import java.util.Map;

//Command accepts an operand and an operator maps and calls the appropriate calculator method
public class Command {

    private String operation;
    private double operand;
    private static Map<String, ArithmeticOperation> configuration = new HashMap<String, ArithmeticOperation>();
    public Command(String operation, double operand) {
        this.operation = operation;
        this.operand = operand;
    }

    public Command(String operation) {
        this.operation = operation;
        this.operand = 0.0;
    }

    public double executes(Calculator calculator) {
        configure(calculator);
        return configuration.get(operation).evaluate(operand);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Command thatCommand = (Command) that;
        if (Double.compare(thatCommand.operand, this.operand) != 0) return false;
        return operation.equals(thatCommand.operation);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = operation.hashCode();
        temp = Double.doubleToLongBits(operand);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public void configure(final Calculator calculator) {
        Command.configuration.put("add", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.add(operand);
            }
        });

        Command.configuration.put("subtract", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.subtract(operand);
            }
        });

        Command.configuration.put("multiply", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.multiply(operand);
            }
        });

        Command.configuration.put("divide", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.divide(operand);
            }
        });

        Command.configuration.put("sqr", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.square();
            }
        });

        Command.configuration.put("sqrt", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.squareRoot();
            }
        });

        Command.configuration.put("cube", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.cube();
            }
        });

        Command.configuration.put("cubert", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.cubeRoot();
            }
        });

        Command.configuration.put("neg", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.negativeOf();
            }
        });

        Command.configuration.put("abs", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.absoluteOf();
            }
        });

        Command.configuration.put("cancel", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.cancel();
            }
        });

        Command.configuration.put("exit", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                System.exit(0);
                return  0.0;
            }
        });

        Command.configuration.put("invalid", new ArithmeticOperation() {
            @Override
            public double evaluate(double operand) {
                return calculator.accumulator();
            }
        });
    }
}
