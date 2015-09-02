package com.thoughtworks.calculator;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class InputReaderTest {

    @Test
    public void shouldReturnAStringWhenReadIsCalled(){
        Scanner scanner = new Scanner(System.in);
        InputReader inputReader = new InputReader(scanner);

        assertEquals("String".getClass(), inputReader.readFromUser().getClass());
    }
}