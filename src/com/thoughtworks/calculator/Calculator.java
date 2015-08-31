package com.thoughtworks.calculator;
//calculator has a set of operations that it can perform on a number in its accumulator
public class Calculator {
    private double accumulator;

    public Calculator(double accumulator) {
        this.accumulator = accumulator;
    }

    public double resultOf(String command) {
        if (command.matches("^Add\\s\\d+(\\.\\d+)?")) {
            accumulator = accumulator + Double.parseDouble(command.split(" ")[1]);
            return accumulator;
        }
        else if (command.matches("^Subtract\\s\\d+(\\.\\d+)?")) {
            accumulator = accumulator - (Double.parseDouble(command.split(" ")[1]));
            return accumulator;
        }
        else if (command.matches("^Multiply\\s\\d+(\\.\\d+)?")) {
            accumulator = accumulator * Double.parseDouble(command.split(" ")[1]);
            return accumulator;
        }
        else if (command.matches("^Divide\\s\\d+(\\.\\d+)?")) {
            if (Double.parseDouble(command.split(" ")[1]) != 0)
                accumulator = accumulator / Double.parseDouble(command.split(" ")[1]);
            else accumulator = Double.NaN;
            return accumulator;
        }
        else if (command.contains("Cancel")) {
            accumulator = 0.0;
            return accumulator;
        }
        else
        return accumulator;
    }
}
