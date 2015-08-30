package com.thoughtworks.calculator;
//calculator has a set of operations that it can perform on a number in its memory
public class Calculator {
    private double memory;

    public Calculator() {
        this.memory = 0.0;
    }

    public double resultOf(String command) {
        if (command.matches("^Add\\s\\d+(\\.\\d+)?")) {
            memory = memory + Double.parseDouble(command.split(" ")[1]);
            return memory;
        }

        else if (command.matches("^Subtract\\s\\d+(\\.\\d+)?")) {
            memory = memory -(Double.parseDouble(command.split(" ")[1]));
            return memory;
        }

        else if (command.matches("^Multiply\\s\\d+(\\.\\d+)?")) {
            memory = memory * Double.parseDouble(command.split(" ")[1]);
            return memory;
        }

        else if (command.matches("^Divide\\s\\d+(\\.\\d+)?")) {
            if (Double.parseDouble(command.split(" ")[1]) != 0)
                memory = memory / Double.parseDouble(command.split(" ")[1]);
            return memory;
        }

        else
        return memory;
    }
}
