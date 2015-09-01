package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void shouldReturnTheNumberSuppliedWithTheAddMethodInitially() {
        Calculator calculator = new Calculator(0.0);

        assertEquals(5.0, calculator.add(5.0), 0.0);
    }

    @Test
    public void shouldReturnTheSumOfTheNumberSuppliedWithTheAddMethodAndTheAccumulator() {
        Calculator calculator = new Calculator(5.0);

        assertEquals(10.0, calculator.add(5.0), 0.0);
    }

    @Test
    public void shouldReturnTheNegativeOfTheNumberSuppliedWithTheSubtractMethodInitially() {
        Calculator calculator = new Calculator(0.0);

        assertEquals(-5.0, calculator.subtract(5.0), 0.0);
    }

    @Test
    public void shouldReturnTheDifferenceOfTheNumberSuppliedWithTheSubtractMethodAndTheAccumulator() {
        Calculator calculator = new Calculator(10.0);

        assertEquals(5.0, calculator.subtract(5.0), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenMultiplyMethodIsIssuedInitially() {
        Calculator calculator = new Calculator(0.0);

        assertEquals(0.0, calculator.multiply(5.0), 0.0);
    }

    @Test
    public void shouldReturnTheProductOfTheNumberSuppliedWithTheMultiplyMethodAndTheAccumulator() {
        Calculator calculator = new Calculator(5.0);

        assertEquals(15.0, calculator.multiply(3.0), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenDivideMethodIsIssuedInitially() {
        Calculator calculator = new Calculator(0.0);

        assertEquals(0.0, calculator.divide(2.0), 0.0);
    }

    @Test
    public void shouldReturnTheQuotientOfTheNumberSuppliedWithTheDivideMethodAndTheAccumulator() {
        Calculator calculator = new Calculator(10.0);

        assertEquals(5.0, calculator.divide(2.0), 0.0);
    }

    @Test
    public void shouldReturnNaNWhenAccumulatorDividedByZero() {
        Calculator calculator = new Calculator(10.0);

        assertEquals(Double.NaN, calculator.divide(0.0), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenSquareMethodIsCalledInitially() {
        Calculator calculator = new Calculator(0.0);

        assertEquals(0.0, calculator.square(), 0.0);
    }

    @Test
    public void shouldReturnTheSquareOfTheAccumulatorWhenTheSquareMethodIsCalled() {
        Calculator calculator = new Calculator(10.0);

        assertEquals(100.0, calculator.square(), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenSquareRootMethodIsCalledInitially() {
        Calculator calculator = new Calculator(0.0);

        assertEquals(0.0, calculator.squareRoot(), 0.0);
    }

    @Test
    public void shouldReturnTheSquareRootOfTheAccumulatorWhenTheSquareRootMethodIsCalled() {
        Calculator calculator = new Calculator(100.0);

        assertEquals(10.0, calculator.squareRoot(), 0.0);
    }

    @Test
    public void shouldReturnTheNegativeOfTheAccumulator() {
        Calculator calculator = new Calculator(-10.0);

        assertEquals(10.0, calculator.negativeOf(), 0.0);
    }

    @Test
    public void shouldReturnThePositiveValueWhenTheAccumulatorIsNegative() {
        Calculator calculator = new Calculator(-10.0);

        assertEquals(10.0, calculator.absoluteOf(), 0.0);
    }

    @Test
    public void shouldReturnThePositiveValueWhenTheAccumulatorIsPostive() {
        Calculator calculator = new Calculator(10.0);

        assertEquals(10.0, calculator.absoluteOf(), 0.0);
    }

    @Test
    public void shouldReturnNaNWhenSquareRootCommandIsIssuedWhenAccumulatorIsNegative() {
        Calculator calculator = new Calculator(-2.0);

        assertEquals(Double.NaN, calculator.squareRoot(), 0.0);
    }

    @Test
    public void shouldReturnTheCurrentAccumulatorWhenTheAccumulatorIsCalled() {
        Calculator calculator = new Calculator(2.0);

        assertEquals(2.0, calculator.accumulator(), 0.0);
    }

    @Test
    public void shouldResetTheValueOfTheAccumulatorWhenTheCancelMethodIsCalled() {
        Calculator calculator = new Calculator(2.0);

        assertEquals(0.0, calculator.cancel(), 0.0);
    }
}