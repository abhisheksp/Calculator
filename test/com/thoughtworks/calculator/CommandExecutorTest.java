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
}