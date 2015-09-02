package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void shouldReturnTheNumberIssuedWithTheAddCommandInitially() {
        Calculator calculator = new Calculator(0.0);
        Parser parser = new Parser(calculator);

        assertEquals(5.0, parser.parse("add 5.0"), 0.0);
    }

    @Test
    public void shouldReturnTheSumOfAccumulatorAndTheNumberPassedWithTheAddCommand() {
        Calculator calculator = new Calculator(10.0);
        Parser parser = new Parser(calculator);

        assertEquals(25.0, parser.parse("add 15.0"), 0.0);
    }

    @Test
    public void shouldReturnTheNegativeOfTheNumberIssuedWithTheSubtractCommandInitially() {
        Calculator calculator = new Calculator(0.0);
        Parser parser = new Parser(calculator);

        assertEquals(-5.0, parser.parse("subtract 5.0"), 0.0);
    }

    @Test
    public void shouldReturnTheDifferenceOfAccumulatorAndTheNumberPassedWithTheSubtractCommand() {
        Calculator calculator = new Calculator(10.0);
        Parser parser = new Parser(calculator);

        assertEquals(5.0, parser.parse("subtract 5.0"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenMultiplyCommandIssuedInitially() {
        Calculator calculator = new Calculator(0.0);
        Parser parser = new Parser(calculator);

        assertEquals(0.0, parser.parse("multiply 5.0"), 0.0);
    }

    @Test
    public void shouldReturnTheProductOfAccumulatorAndTheNumberPassedWithTheMultiplyCommand() {
        Calculator calculator = new Calculator(10.0);
        Parser parser = new Parser(calculator);

        assertEquals(50.0, parser.parse("multiply 5.0"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenDivideCommandIssuedInitially() {
        Calculator calculator = new Calculator(0.0);
        Parser parser = new Parser(calculator);

        assertEquals(0.0, parser.parse("divide 5.0"), 0.0);
    }

    @Test
    public void shouldReturnTheQuotientOfAccumulatorAndTheNumberPassedWithTheDivideCommand() {
        Calculator calculator = new Calculator(10.0);
        Parser parser = new Parser(calculator);

        assertEquals(5.0, parser.parse("divide 2.0"), 0.0);
    }

    @Test
    public void shouldReturnTheSquareOfTheAccumulator() {
        Calculator calculator = new Calculator(2.0);
        Parser parser = new Parser(calculator);

        assertEquals(4.0, parser.parse("sqr"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenSquareRootCommandIsIssuedInitially() {
        Calculator calculator = new Calculator(0.0);
        Parser parser = new Parser(calculator);

        assertEquals(0.0, parser.parse("sqrt"), 0.0);
    }

    @Test
    public void shouldReturnTheSquareRootOfTheAccumulatorWhenTheSquareRootCommandIsCalled() {
        Calculator calculator = new Calculator(4.0);
        Parser parser = new Parser(calculator);

        assertEquals(2.0, parser.parse("sqrt"), 0.0);
    }

    @Test
    public void shouldReturnTheNegativeOfTheAccumulatorWhenNegCommandIsIssued() {
        Calculator calculator = new Calculator(2.0);
        Parser parser = new Parser(calculator);

        assertEquals(-2.0, parser.parse("neg"), 0.0);
    }

    @Test
    public void shouldReturnThePositiveValueWhenTheAccumulatorIsPositive() {
        Calculator calculator = new Calculator(-2.0);
        Parser parser = new Parser(calculator);

        assertEquals(2.0, parser.parse("abs"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenACancelCommandIsIssued() {
        Calculator calculator = new Calculator(0.0);
        Parser parser = new Parser(calculator);

        assertEquals(0.0, parser.parse("cancel"), 0.0);
    }

    @Test
    public void shouldReturnTheCubeOfTheAccumulator() {
        Calculator calculator = new Calculator(2.0);
        Parser parser = new Parser(calculator);

        assertEquals(8.0, parser.parse("cube"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenCubeRootCommandIsIssuedInitially() {
        Calculator calculator = new Calculator(0.0);
        Parser parser = new Parser(calculator);

        assertEquals(0.0, parser.parse("cubert"), 0.0);
    }

    @Test
    public void shouldReturnTheCubeRootOfTheAccumulatorWhenTheSquareRootCommandIsCalled() {
        Calculator calculator = new Calculator(8.0);
        Parser parser = new Parser(calculator);

        assertEquals(2.0, parser.parse("cubert"), 0.0);
    }
}