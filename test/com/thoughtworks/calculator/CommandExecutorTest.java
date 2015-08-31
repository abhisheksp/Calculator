package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandExecutorTest {

    @Test
    public void shouldReturnZeroWhenInvalidCommandIsGivenInitially() {
        CommandExecutor commandExecutor = new CommandExecutor("add", 5.0);

        assertEquals(5.0, commandExecutor.executes(new Calculator(0.0)), 0.0);
    }

}