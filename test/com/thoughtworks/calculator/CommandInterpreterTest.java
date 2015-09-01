package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandInterpreterTest {

    @Test
    public void shouldReturnTheNumberIssuedWithTheAddCommandInitially() {
        Calculator calculator = new Calculator(0.0);
        CommandInterpreter commandInterpreter = new CommandInterpreter(calculator);

        assertEquals(5.0, commandInterpreter.interpret("add 5.0"), 0.0);
    }

    @Test
    public void shouldReturnTheSumOfAccumulatorAndTheNumberPassedWithTheAddCommand() {
        Calculator calculator = new Calculator(10.0);
        CommandInterpreter commandInterpreter = new CommandInterpreter(calculator);

        assertEquals(25.0, commandInterpreter.interpret("add 15.0"), 0.0);
    }

    @Test
    public void shouldReturnTheNegativeOfTheNumberIssuedWithTheSubtractCommandInitially() {
        Calculator calculator = new Calculator(0.0);
        CommandInterpreter commandInterpreter = new CommandInterpreter(calculator);

        assertEquals(-5.0, commandInterpreter.interpret("subtract 5.0"), 0.0);
    }

    @Test
    public void shouldReturnTheDifferenceOfAccumulatorAndTheNumberPassedWithTheSubtractCommand() {
        Calculator calculator = new Calculator(10.0);
        CommandInterpreter commandInterpreter = new CommandInterpreter(calculator);

        assertEquals(5.0, commandInterpreter.interpret("subtract 5.0"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenMultiplyCommandIssuedInitially() {
        Calculator calculator = new Calculator(0.0);
        CommandInterpreter commandInterpreter = new CommandInterpreter(calculator);

        assertEquals(0.0, commandInterpreter.interpret("multiply 5.0"), 0.0);
    }

    @Test
    public void shouldReturnTheProductOfAccumulatorAndTheNumberPassedWithTheMultiplyCommand() {
        Calculator calculator = new Calculator(10.0);
        CommandInterpreter commandInterpreter = new CommandInterpreter(calculator);

        assertEquals(50.0, commandInterpreter.interpret("multiply 5.0"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenDivideCommandIssuedInitially() {
        Calculator calculator = new Calculator(0.0);
        CommandInterpreter commandInterpreter = new CommandInterpreter(calculator);

        assertEquals(0.0, commandInterpreter.interpret("divide 5.0"), 0.0);
    }

    @Test
    public void shouldReturnTheQuotientOfAccumulatorAndTheNumberPassedWithTheDivideCommand() {
        Calculator calculator = new Calculator(10.0);
        CommandInterpreter commandInterpreter = new CommandInterpreter(calculator);

        assertEquals(5.0, commandInterpreter.interpret("divide 2.0"), 0.0);
    }

    @Test
    public void shouldReturnTheSquareOfTheAccumulator() {
        Calculator calculator = new Calculator(2.0);
        CommandInterpreter commandInterpreter = new CommandInterpreter(calculator);

        assertEquals(4.0, commandInterpreter.interpret("sqr"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenSquareRootCommandIsIssuedInitially() {
        Calculator calculator = new Calculator(0.0);
        CommandInterpreter commandInterpreter = new CommandInterpreter(calculator);

        assertEquals(0.0, commandInterpreter.interpret("sqrt"), 0.0);
    }

    @Test
    public void shouldReturnTheSquareRootOfTheAccumulatorWhenTheSquareRootCommandIsCalled() {
        Calculator calculator = new Calculator(4.0);
        CommandInterpreter commandInterpreter = new CommandInterpreter(calculator);

        assertEquals(2.0, commandInterpreter.interpret("sqrt"), 0.0);
    }

    @Test
    public void shouldReturnTheNegativeOfTheAccumulatorWhenNegCommandIsIssued() {
        Calculator calculator = new Calculator(2.0);
        CommandInterpreter commandInterpreter = new CommandInterpreter(calculator);

        assertEquals(-2.0, commandInterpreter.interpret("neg"), 0.0);
    }

    @Test
    public void shouldReturnThePositiveValueWhenTheAccumulatorIsPositive() {
        Calculator calculator = new Calculator(-2.0);
        CommandInterpreter commandInterpreter = new CommandInterpreter(calculator);

        assertEquals(2.0, commandInterpreter.interpret("abs"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenACancelCommandIsIssued() {
        Calculator calculator = new Calculator(0.0);
        CommandInterpreter commandInterpreter = new CommandInterpreter(calculator);

        assertEquals(0.0, commandInterpreter.interpret("cancel"), 0.0);
    }
}