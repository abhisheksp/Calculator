package com.thoughtworks.calculator;
//Parser has a calculator and a command, accepts command tokenizes it and converts it into concrete types
public class Parser {
    private Calculator calculator;
    private Command command;

    public Parser(Calculator calculator) {
        this.calculator = calculator;

    }

    public Command parse(String rawInput) {
        String tokens [] = rawInput.split(" ");
        if (rawInput.matches("^(add|subtract|multiply|divide)\\s\\d+(\\.\\d+)?")) {
            command = new Command(tokens[0], Double.parseDouble(tokens[1]));
            return command;
        } else if (rawInput.matches("^(sqr|sqrt|neg|abs|cube|cubert|cancel|exit)\\s*")) {
            command = new Command(tokens[0]);
            return command;
        } else {
            command = new Command("Invalid");
            return command;
        }
    }
}
