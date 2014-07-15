package com.malsr;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberSignCheckerTest {

    private final NumberSignChecker underTest = new NumberSignChecker();

    @Before
    public void setup() {
    }

    @Test
    public void returnsTrueWhenTwoIntegersHaveOppositeSigns() {
        int numberOne = -1;
        int numberTwo = 25;
        boolean hasOppositeSigns = underTest.determinesTwoIntegersHaveOppositeSigns(numberOne, numberTwo);

        assertTrue("Expected result to be true as both numbers have opposite signs but got false", hasOppositeSigns);
    }

    @Test
    public void returnsFalseWhenBothIntegersHavePositiveSigns() {
        int numberOne = 1;
        int numberTwo = 25;
        boolean hasOppositeSigns = underTest.determinesTwoIntegersHaveOppositeSigns(numberOne, numberTwo);

        assertFalse("Expected result to be false as both numbers have positive signs", hasOppositeSigns);
    }

    @Test
    public void returnsFalseWhenBothIntegersHaveNegativeSigns() {
        int numberOne = -1;
        int numberTwo = -25;
        boolean hasOppositeSigns = underTest.determinesTwoIntegersHaveOppositeSigns(numberOne, numberTwo);

        assertFalse("Expected result to be false as both numbers have negative signs", hasOppositeSigns);
    }
}