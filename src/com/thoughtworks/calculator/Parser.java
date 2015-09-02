package com.thoughtworks.calculator;
//Parser has a calculator and a command, accepts command tokenizes it and converts it into concrete types
public class Parser {
    private Calculator calculator;
    private Command command;

    public Parser(Calculator calculator) {
        this.calculator = calculator;

    }

    public double parse(String rawInput) {
        if (rawInput.matches("^(add|subtract|multiply|divide)\\s\\d+(\\.\\d+)?")) {
            command = new Command(rawInput.split(" ")[0], Double.parseDouble(rawInput.split(" ")[1]));
            return command.executes(calculator);
        } else if (rawInput.matches("^(sqr|sqrt|neg|abs|cube|cubert|cancel|exit)\\s*")) {
            command = new Command(rawInput.split(" ")[0]);
            return command.executes(calculator);
        } else
            return calculator.accumulator();
    }
}
