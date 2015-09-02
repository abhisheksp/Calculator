package com.thoughtworks.calculator;
//Calculator to accept input
import java.util.Scanner;

public class CalculatorApplication {
    private InputReader inputReader;
    private Parser parser;

    public CalculatorApplication(Parser parser, InputReader inputReader) {
        this.inputReader = inputReader;
        this.parser = parser;
    }

    public void runApplication(Calculator calculator) {
        String userInput;
        Command command;
        while(true){
            userInput = inputReader.readFromUser();
            command = parser.parse(userInput);
            System.out.println(command.executes(calculator));
        }
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        InputReader inputReader = new InputReader(scanner);
        final Calculator calculator = new Calculator(0.0);
        Parser parser = new Parser(calculator);
        CalculatorApplication calculatorApplication = new CalculatorApplication(parser, inputReader);
        calculatorApplication.runApplication(calculator);
    }
}