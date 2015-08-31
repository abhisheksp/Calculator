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
}