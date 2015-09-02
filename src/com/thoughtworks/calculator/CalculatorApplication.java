package com.thoughtworks.calculator;
//Calculator to accept input
import java.util.Scanner;

public class CalculatorApplication {
    private Parser parser;

    public CalculatorApplication(Parser parser) {
        this.parser = parser;
    }

    public void runApplication() {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        while(true){
            userInput = scanner.nextLine();
            System.out.println(parser.parse(userInput.toLowerCase().trim()));
        }
    }
    public static void main(String [] args){
        final Calculator calculator = new Calculator(0.0);
        Parser parser = new Parser(calculator);
        CalculatorApplication calculatorApplication = new CalculatorApplication(parser);
        calculatorApplication.runApplication();
    }
}