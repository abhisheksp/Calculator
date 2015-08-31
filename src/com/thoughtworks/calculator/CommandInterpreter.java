package com.thoughtworks.calculator;

public class CommandInterpreter {
    private Calculator calculator;
    private CommandExecutor commandExecutor;

    public CommandInterpreter(double initialState) {
        this.calculator = new Calculator(initialState);
    }

    public double interpret(String rawInput) {
        if (rawInput.matches("^(add|subtract|multiply|divide)\\s\\d+(\\.\\d+)?")) {
            commandExecutor = new CommandExecutor(rawInput.split(" ")[0], Double.parseDouble(rawInput.split(" ")[1]));
            return commandExecutor.executes(calculator);
        } else if (rawInput.matches("^(sqr|sqrt|neg|abs)\\s*")) {
            commandExecutor = new CommandExecutor(rawInput.split(" ")[0]);
            return commandExecutor.executes(calculator);
        } else if (rawInput.matches("^cancel\\s*")) {
            calculator = new Calculator(0.0);
            return calculator.accumulator();
        } else
            return calculator.accumulator();
    }
}
