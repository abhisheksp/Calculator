package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandTest {

    @Test
    public void shouldReturnTheNumberIssuedWithTheAddCommandInitially() {
        Command command = new Command("add", 5.0);

        assertEquals(5.0, command.executes(new Calculator(0.0)), 0.0);
    }

    @Test
    public void shouldReturnTheSumOfAccumulatorAndTheNumberPassedWithTheAddCommand() {
        Command command = new Command("add", 5.0);

        assertEquals(10.0, command.executes(new Calculator(5.0)), 0.0);
    }

    @Test
    public void shouldReturnTheNegativeOfTheNumberIssuedWiththeSubtractCommandInitially() {
        Command command = new Command("subtract", 5.0);

        assertEquals(-5.0, command.executes(new Calculator(0.0)), 0.0);
    }

    @Test
    public void shouldReturnTheDifferenceOfAccumulatorAndtheNumberPassedWithTheSubtractCommand() {
        Command command = new Command("subtract", 5.0);

        assertEquals(0.0, command.executes(new Calculator(5.0)), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenMultiplyCommandIsIssuedInitially() {
        Command command = new Command("multiply", 5.0);

        assertEquals(0.0, command.executes(new Calculator(0.0)), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenDivideCommandIsIssuedInitially() {
        Command command = new Command("divide", 5.0);

        assertEquals(0.0, command.executes(new Calculator(0.0)), 0.0);
    }

    @Test
    public void shouldReturnTheProductOfTheNumberPassedWithTheMultiplyCommandAndThePreviouslyComputedNumber() {
        Command command = new Command("multiply", 5.0);

        assertEquals(25.0, command.executes(new Calculator(5.0)), 0.0);
    }

    @Test
    public void shouldReturnTheQuotientOfTheNumberPassedWithTheDivideCommandAndThePreviouslyComputedNumber() {
        Command command = new Command("divide", 5.0);

        assertEquals(1.0, command.executes(new Calculator(5.0)), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenSquareCommandIssuedInitially() {
        Command command = new Command("sqr");

        assertEquals(0.0, command.executes(new Calculator(0.0)), 0.0);
    }

    @Test
    public void shouldReturnTheSquareOfTheAccumulator() {
        Command command = new Command("sqr");

        assertEquals(4.0, command.executes(new Calculator(2.0)), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenSquareRootCommandIsIssuedInitially() {
        Command command = new Command("sqrt");

        assertEquals(0.0, command.executes(new Calculator(0.0)), 0.0);
    }

    @Test
    public void shouldReturnTheSquareRootOfTheAccumulatorWhenTheSquareRootCommandIsCalled() {
        Command command = new Command("sqrt");

        assertEquals(2.0, command.executes(new Calculator(4.0)), 0.0);
    }

    @Test
    public void shouldReturnTheNegativeOfTheAccumulatorWhenNegCommandIsIssued() {
        Command command = new Command("neg");

        assertEquals(-2.0, command.executes(new Calculator(2.0)), 0.0);
    }

    @Test
    public void shouldReturnThePositiveValueWhenTheAccumulatorIsPositive() {
        Command command = new Command("abs");

        assertEquals(2.0, command.executes(new Calculator(-2.0)), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenCubeCommandIssuedInitially() {
        Command command = new Command("cube");

        assertEquals(0.0, command.executes(new Calculator(0.0)), 0.0);
    }

    @Test
    public void shouldReturnTheCubeOfTheAccumulator() {
        Command command = new Command("cube");

        assertEquals(8.0, command.executes(new Calculator(2.0)), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenCubeRootCommandIsIssuedInitially() {
        Command command = new Command("cubert");

        assertEquals(0.0, command.executes(new Calculator(0.0)), 0.0);
    }

    @Test
    public void shouldReturnTheCubeRootOfTheAccumulatorWhenTheSquareRootCommandIsCalled() {
        Command command = new Command("cubert");

        assertEquals(2.0, command.executes(new Calculator(8.0)), 0.0);
    }
}