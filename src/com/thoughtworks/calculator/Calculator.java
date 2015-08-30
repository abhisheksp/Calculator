package com.thoughtworks.calculator;
//calculator has a set of operations that it can perform on a number in its memory
public class Calculator {

    public double resultOf(String command) {
        if (command.contains("Add") && command.length() > 3) {
            return Double.parseDouble(command.split(" ")[1]);
        }

        else if (command.contains("Subtract")) {
            return -(Double.parseDouble(command.split(" ")[1]));
        }
        return 0.0;
    }
}
