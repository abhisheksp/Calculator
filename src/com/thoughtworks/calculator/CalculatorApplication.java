package com.thoughtworks.calculator;

import java.util.Scanner;

public class CalculatorApplication {
    private CommandInterpreter commandInterpreter;

    public CalculatorApplication(CommandInterpreter commandInterpreter) {
        this.commandInterpreter = commandInterpreter;
    }

    public void runApplication() {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        while(true){
            userInput = scanner.nextLine();
            System.out.println(commandInterpreter.interpret(userInput.toLowerCase().trim()));
        }
    }
    public static void main(String [] args){
        final Calculator calculator = new Calculator(0.0);
        CommandInterpreter commandInterpreter = new CommandInterpreter(calculator);
        CalculatorApplication calculatorApplication = new CalculatorApplication(commandInterpreter);

        configure(calculator);

        calculatorApplication.runApplication();
    }

    private static void configure(final Calculator calculator) {
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
