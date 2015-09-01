package com.thoughtworks.calculator;
//Calculator to accept input
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
        calculatorApplication.runApplication();
    }
}