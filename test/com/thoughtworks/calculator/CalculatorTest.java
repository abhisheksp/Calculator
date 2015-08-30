package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void shouldReturnZeroGivenAnInvalidCommandInitially() {
        Calculator calculator = new Calculator();

        assertEquals(0.0, calculator.resultOf(" "), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenGivenAnIncompleteCommandInitially() {
        Calculator calculator = new Calculator();

        assertEquals(0.0, calculator.resultOf("Add"), 0.0);
    }

    @Test
    public void shouldReturnTheNumberPassedWithTheAddCommandIssuedInitially() {
        Calculator calculator = new Calculator();

        assertEquals(5.0, calculator.resultOf("Add 5"), 0.0);
    }

    @Test
    public void shouldReturnTheNegativeOfTheNumberPassedWithTheSubtractCommandIssuedInitially() {
        Calculator calculator = new Calculator();

        assertEquals(-5.0, calculator.resultOf("Subtract 5"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenMultiplyCommandIsIssuedInitially() {
        Calculator calculator = new Calculator();

        assertEquals(0.0, calculator.resultOf("Multiply 5"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenDivideCommandIsIssuedInitially() {
        Calculator calculator = new Calculator();

        assertEquals(0.0, calculator.resultOf("Divide 5 "), 0.0);
    }

    @Test
    public void shouldReturnTheNumberPassedWithTheAddCommandAfterAnInvalidCommandWasIssuedInitially() {
        Calculator calculator = new Calculator();

        calculator.resultOf("Add");

        assertEquals(5.0, calculator.resultOf("Add 5"), 0.0);
    }

    @Test
    public void shouldReturnTheNegativeOfTheNumberPassedWithTheSubtractCommandAfterAnInvalidCommandWasIssuedInitially() {
        Calculator calculator = new Calculator();

        calculator.resultOf(" ");

        assertEquals(-5.0, calculator.resultOf("Subtract 5"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenMultiplyCommandIsIssuedAfterAnInvalidCommandWasIssuedInitially() {
        Calculator calculator = new Calculator();

        calculator.resultOf(" ");

        assertEquals(0.0, calculator.resultOf("Multiply 5"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenDivideCommandIsIssuedAfterAnInvalidCommandWasIssuedInitially() {
        Calculator calculator = new Calculator();

        calculator.resultOf(" ");

        assertEquals(0.0, calculator.resultOf("Divide 5"), 0.0);
    }

    @Test
    public void shouldReturnTheSumOfTheNumberPassedWithTheAddCommandAndThePreviouslyComputedNumber() {
        Calculator calculator = new Calculator();

        calculator.resultOf("Add 5");

        assertEquals(10.0, calculator.resultOf("Add 5"), 0.0);
    }

    @Test
    public void shouldReturnTheDiffernceOfTheNumberPassedWithTheSubtractCommandAndThePreviouslyComputedNumber() {
        Calculator calculator = new Calculator();

        calculator.resultOf("Add 5");

        assertEquals(2.0, calculator.resultOf("Subtract 3"), 0.0);
    }

    @Test
    public void shouldReturnTheProductOfTheNumberPassedWithTheMultiplyCommandAndThePreviouslyComputedNumber() {
        Calculator calculator = new Calculator();

        calculator.resultOf("Add 5");

        assertEquals(15.0, calculator.resultOf("Multiply 3"), 0.0);
    }
}