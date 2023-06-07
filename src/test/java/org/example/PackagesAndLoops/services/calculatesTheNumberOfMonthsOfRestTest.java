package org.example.PackagesAndLoops.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatesTheNumberOfMonthsOfRestTest {

    @Test
    public void threeMonthsAYear () {
        calculatesTheNumberOfMonthsOfRest calculatesTheNumberOfMonthsOfRest = new calculatesTheNumberOfMonthsOfRest();

        int actual = calculatesTheNumberOfMonthsOfRest.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void twoMonthsAYear () {
        calculatesTheNumberOfMonthsOfRest calculatesTheNumberOfMonthsOfRest = new calculatesTheNumberOfMonthsOfRest();

        int actual = calculatesTheNumberOfMonthsOfRest.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}