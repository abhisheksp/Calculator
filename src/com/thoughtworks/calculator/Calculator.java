package com.thoughtworks.calculator;
//calculator has a set of operations that it can perform on a number in its memory
public class Calculator {
    private double memory;

    public double resultOf(String command) {
        if (command.contains("Add") && command.length() > 3) {
            memory = memory + Double.parseDouble(command.split(" ")[1]);
            return memory;
        }

        else if (command.contains("Subtract")) {
            return -(Double.parseDouble(command.split(" ")[1]));
        }
        return 0.0;
    }
}
