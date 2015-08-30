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
}