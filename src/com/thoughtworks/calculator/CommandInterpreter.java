package com.thoughtworks.calculator;
//CommandInterpreter has a calculator and a commandExecutor, accepts command tokenizes it and converts it into concrete types
public class CommandInterpreter {
    private Calculator calculator;
    private CommandExecutor commandExecutor;

    public CommandInterpreter(Calculator calculator) {
        this.calculator = calculator;

    }

    public double interpret(String rawInput) {
        if (rawInput.matches("^(add|subtract|multiply|divide)\\s\\d+(\\.\\d+)?")) {
            commandExecutor = new CommandExecutor(rawInput.split(" ")[0], Double.parseDouble(rawInput.split(" ")[1]));
            return commandExecutor.executes(calculator);
        } else if (rawInput.matches("^(sqr|sqrt|neg|abs|cube|cubert|cancel)\\s*")) {
            commandExecutor = new CommandExecutor(rawInput.split(" ")[0]);
            return commandExecutor.executes(calculator);
        } else
            return calculator.accumulator();
    }
}
