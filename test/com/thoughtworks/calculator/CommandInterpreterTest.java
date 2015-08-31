package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandInterpreterTest {

    @Test
    public void shouldReturnTheNumberIssuedWithTheAddCommandInitially() {
        CommandInterpreter commandInterpreter = new CommandInterpreter(0.0);

        assertEquals(5.0, commandInterpreter.interpret("add 5.0"), 0.0);
    }

    @Test
    public void shouldReturnTheSumOfAccumulatorAndTheNumberPassedWithTheAddCommand() {
        CommandInterpreter commandInterpreter = new CommandInterpreter(10.0);

        assertEquals(25.0, commandInterpreter.interpret("add 15.0"), 0.0);
    }

    @Test
    public void shouldReturnTheNegativeOfTheNumberIssuedWithTheSubtractCommandInitially() {
        CommandInterpreter commandInterpreter = new CommandInterpreter(0.0);

        assertEquals(-5.0, commandInterpreter.interpret("subtract 5.0"), 0.0);
    }

    @Test
    public void shouldReturnTheDifferenceOfAccumulatorAndTheNumberPassedWithTheSubtractCommand() {
        CommandInterpreter commandInterpreter = new CommandInterpreter(10.0);

        assertEquals(5.0, commandInterpreter.interpret("subtract 5.0"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenMultiplyCommandIssuedInitially() {
        CommandInterpreter commandInterpreter = new CommandInterpreter(0.0);

        assertEquals(0.0, commandInterpreter.interpret("multiply 5.0"), 0.0);
    }

    @Test
    public void shouldReturnTheProductOfAccumulatorAndTheNumberPassedWithTheMultiplyCommand() {
        CommandInterpreter commandInterpreter = new CommandInterpreter(10.0);

        assertEquals(50.0, commandInterpreter.interpret("multiply 5.0"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenDivideCommandIssuedInitially() {
        CommandInterpreter commandInterpreter = new CommandInterpreter(0.0);

        assertEquals(0.0, commandInterpreter.interpret("divide 5.0"), 0.0);
    }

    @Test
    public void shouldReturnTheQuotientOfAccumulatorAndTheNumberPassedWithTheDivideCommand() {
        CommandInterpreter commandInterpreter = new CommandInterpreter(10.0);

        assertEquals(5.0, commandInterpreter.interpret("divide 2.0"), 0.0);
    }

    @Test
    public void shouldReturnTheSquareOfTheAccumulator() {
        CommandInterpreter commandInterpreter = new CommandInterpreter(2.0);

        assertEquals(4.0, commandInterpreter.interpret("sqr"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenSquareRootCommandIsIssuedInitially() {
        CommandInterpreter commandInterpreter = new CommandInterpreter(0.0);

        assertEquals(0.0, commandInterpreter.interpret("sqrt"), 0.0);
    }

    @Test
    public void shouldReturnTheSquareRootOfTheAccumulatorWhenTheSquareRootCommandIsCalled() {
        CommandInterpreter commandInterpreter = new CommandInterpreter(4.0);

        assertEquals(2.0, commandInterpreter.interpret("sqrt"), 0.0);
    }

    @Test
    public void shouldReturnTheNegativeOfTheAccumulatorWhenNegCommandIsIssued() {
        CommandInterpreter commandInterpreter = new CommandInterpreter(2.0);

        assertEquals(-2.0, commandInterpreter.interpret("neg"), 0.0);
    }

    @Test
    public void shouldReturnThePositiveValueWhenTheAccumulatorIsPositive() {
        CommandInterpreter commandInterpreter = new CommandInterpreter(-2.0);

        assertEquals(2.0, commandInterpreter.interpret("abs"), 0.0);
    }
}