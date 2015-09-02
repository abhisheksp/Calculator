package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {
    @Test
    public void shouldReturnTheNumberIssuedWithTheAddCommandInitially() {
        Calculator calculator = new Calculator(0.0);
        Parser parser = new Parser(calculator);

        assertEquals(new Command("add", 5.0), parser.parse("add 5.0"));
    }


    @Test
    public void shouldReturnTheSumOfAccumulatorAndTheNumberPassedWithTheAddCommand() {
        Calculator calculator = new Calculator(10.0);
        Parser parser = new Parser(calculator);

        assertEquals(new Command("add", 15.0), parser.parse("add 15.0"));
    }

    @Test
    public void shouldReturnTheNegativeOfTheNumberIssuedWithTheSubtractCommandInitially() {
        Calculator calculator = new Calculator(0.0);
        Parser parser = new Parser(calculator);

        assertEquals(new Command("subtract", 5.0), parser.parse("subtract 5.0"));
    }

    @Test
    public void shouldReturnTheDifferenceOfAccumulatorAndTheNumberPassedWithTheSubtractCommand() {
        Calculator calculator = new Calculator(10.0);
        Parser parser = new Parser(calculator);

        assertEquals(new Command("subtract", 5.0), parser.parse("subtract 5.0"));
    }

    @Test
    public void shouldReturnZeroWhenMultiplyCommandIssuedInitially() {
        Calculator calculator = new Calculator(0.0);
        Parser parser = new Parser(calculator);

        assertEquals(new Command("multiply", 5.0), parser.parse("multiply 5.0"));
    }

    @Test
    public void shouldReturnTheProductOfAccumulatorAndTheNumberPassedWithTheMultiplyCommand() {
        Calculator calculator = new Calculator(10.0);
        Parser parser = new Parser(calculator);

        assertEquals(new Command("multiply", 5.0), parser.parse("multiply 5.0"));
    }

    @Test
    public void shouldReturnZeroWhenDivideCommandIssuedInitially() {
        Calculator calculator = new Calculator(0.0);
        Parser parser = new Parser(calculator);

        assertEquals(new Command("divide", 5.0), parser.parse("divide 5.0"));
    }

    @Test
    public void shouldReturnTheQuotientOfAccumulatorAndTheNumberPassedWithTheDivideCommand() {
        Calculator calculator = new Calculator(10.0);
        Parser parser = new Parser(calculator);

        assertEquals(new Command("divide", 2.0), parser.parse("divide 2.0"));
    }

    @Test
    public void shouldReturnTheSquareOfTheAccumulator() {
        Calculator calculator = new Calculator(2.0);
        Parser parser = new Parser(calculator);

        assertEquals(new Command("sqr"), parser.parse("sqr"));
    }

    @Test
    public void shouldReturnZeroWhenSquareRootCommandIsIssuedInitially() {
        Calculator calculator = new Calculator(0.0);
        Parser parser = new Parser(calculator);

        assertEquals(new Command("sqrt"), parser.parse("sqrt"));
    }

    @Test
    public void shouldReturnTheSquareRootOfTheAccumulatorWhenTheSquareRootCommandIsCalled() {
        Calculator calculator = new Calculator(4.0);
        Parser parser = new Parser(calculator);

        assertEquals(new Command("sqrt"), parser.parse("sqrt"));
    }

    @Test
    public void shouldReturnTheNegativeOfTheAccumulatorWhenNegCommandIsIssued() {
        Calculator calculator = new Calculator(2.0);
        Parser parser = new Parser(calculator);

        assertEquals(new Command("neg"), parser.parse("neg"));
    }

    @Test
    public void shouldReturnThePositiveValueWhenTheAccumulatorIsPositive() {
        Calculator calculator = new Calculator(-2.0);
        Parser parser = new Parser(calculator);

        assertEquals(new Command("abs"), parser.parse("abs"));
    }

    @Test
    public void shouldReturnZeroWhenACancelCommandIsIssued() {
        Calculator calculator = new Calculator(0.0);
        Parser parser = new Parser(calculator);

        assertEquals(new Command("cancel"), parser.parse("cancel"));
    }

    @Test
    public void shouldReturnTheCubeOfTheAccumulator() {
        Calculator calculator = new Calculator(2.0);
        Parser parser = new Parser(calculator);

        assertEquals(new Command("cube"), parser.parse("cube"));
    }

    @Test
    public void shouldReturnZeroWhenCubeRootCommandIsIssuedInitially() {
        Calculator calculator = new Calculator(0.0);
        Parser parser = new Parser(calculator);

        assertEquals(new Command("cubert"), parser.parse("cubert"));
    }

    @Test
    public void shouldReturnTheCubeRootOfTheAccumulatorWhenTheSquareRootCommandIsCalled() {
        Calculator calculator = new Calculator(8.0);
        Parser parser = new Parser(calculator);

        assertEquals(new Command("cubert"), parser.parse("cubert"));
    }
}