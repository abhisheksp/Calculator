package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandExecutorTest {

    @Test
    public void shouldReturnTheNumberIssuedWithTheAddCommandInitially() {
        CommandExecutor commandExecutor = new CommandExecutor("add", 5.0);

        assertEquals(5.0, commandExecutor.executes(new Calculator(0.0)), 0.0);
    }

    @Test
    public void shouldReturnTheSumeOfAccumulatorAndTheNumberPassedWithTheAddCommand() {
        CommandExecutor commandExecutor = new CommandExecutor("add", 5.0);

        assertEquals(10.0, commandExecutor.executes(new Calculator(5.0)), 0.0);
    }

    @Test
    public void shouldReturnTheNegativeOfTheNumberIssuedWiththeSubtractCommandInitially() {
        CommandExecutor commandExecutor = new CommandExecutor("subtract", 5.0);

        assertEquals(-5.0, commandExecutor.executes(new Calculator(0.0)), 0.0);
    }

    @Test
    public void shouldReturnTheDifferenceOfAccumulatorAndtheNumberPassedWithTheSubtractCommand() {
        CommandExecutor commandExecutor = new CommandExecutor("subtract", 5.0);

        assertEquals(0.0, commandExecutor.executes(new Calculator(5.0)), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenMultiplyCommandIsIssuedInitially() {
        CommandExecutor commandExecutor = new CommandExecutor("multiply", 5.0);

        assertEquals(0.0, commandExecutor.executes(new Calculator(0.0)), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenDivideCommandIsIssuedInitially() {
        CommandExecutor commandExecutor = new CommandExecutor("divide", 5.0);

        assertEquals(0.0, commandExecutor.executes(new Calculator(0.0)), 0.0);
    }

    @Test
    public void shouldReturnTheProductOfTheNumberPassedWithTheMultiplyCommandAndThePreviouslyComputedNumber() {
        CommandExecutor commandExecutor = new CommandExecutor("multiply", 5.0);

        assertEquals(25.0, commandExecutor.executes(new Calculator(5.0)), 0.0);
    }

    @Test
    public void shouldReturnTheQuotientOfTheNumberPassedWithTheDivideCommandAndThePreviouslyComputedNumber() {
        CommandExecutor commandExecutor = new CommandExecutor("divide", 5.0);

        assertEquals(1.0, commandExecutor.executes(new Calculator(5.0)), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenSquareCommandIssuedInitially() {
        CommandExecutor commandExecutor = new CommandExecutor("sqr");

        assertEquals(0.0, commandExecutor.executes(new Calculator(0.0)), 0.0);
    }

    @Test
    public void shouldReturnTheSquareOfTheAccumulator() {
        CommandExecutor commandExecutor = new CommandExecutor("sqr");

        assertEquals(4.0, commandExecutor.executes(new Calculator(2.0)), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenSquareRootCommandIsIssuedInitially() {
        CommandExecutor commandExecutor = new CommandExecutor("sqrt");

        assertEquals(0.0, commandExecutor.executes(new Calculator(0.0)), 0.0);
    }

    @Test
    public void shouldReturnTheSquareRootOfTheAccumulatorWhenTheSquareRootCommandIsCalled() {
        CommandExecutor commandExecutor = new CommandExecutor("sqrt");

        assertEquals(2.0, commandExecutor.executes(new Calculator(4.0)), 0.0);
    }

    @Test
    public void shouldReturnTheNegativeOfTheAccumulatorWhenNegCommandIsIssued() {
        CommandExecutor commandExecutor = new CommandExecutor("neg");

        assertEquals(-2.0, commandExecutor.executes(new Calculator(2.0)), 0.0);
    }

    @Test
    public void shouldReturnThePositiveValueWhenTheAccumulatorIsPositive() {
        CommandExecutor commandExecutor = new CommandExecutor("abs");

        assertEquals(2.0, commandExecutor.executes(new Calculator(-2.0)), 0.0);
    }
}