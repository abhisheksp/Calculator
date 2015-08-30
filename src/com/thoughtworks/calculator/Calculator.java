package com.thoughtworks.calculator;
//calculator has a set of operations that it can perform on a number in its memory
public class Calculator {
    private double memory;

    public Calculator() {
        this.memory = 0.0;
    }

    public double resultOf(String command) {
        if (command.contains("Add") && command.length() > 4) {
            memory = memory + Double.parseDouble(command.split(" ")[1]);
            return memory;
        }

        else if (command.contains("Subtract") && command.length() > 9) {
            memory = memory -(Double.parseDouble(command.split(" ")[1]));
            return memory;
        }
        return 0.0;
    }
}
