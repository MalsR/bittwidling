package com.malsr;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BitManipulationPowerOfTwoTest {

    private BitManipulationPowerOfTwo underTest;

    @Before
    public void setup() {
        underTest = new BitManipulationPowerOfTwo();
    }

    @Test
    public void determinesGivenNumberArePowerOfTwo() {
        assertTrue(underTest.isPowerOfTwo(1));
        assertTrue(underTest.isPowerOfTwo(2));
        assertTrue(underTest.isPowerOfTwo(4));
        assertTrue(underTest.isPowerOfTwo(16));
    }

    @Test
    public void determinesNumbersAreNotPowerOfTwo() {
        assertFalse(underTest.isPowerOfTwo(13));
        assertFalse(underTest.isPowerOfTwo(6));
    }

    @Test
    public void zeroIsNotConsideredPowerOfTwo() {
        boolean result = underTest.isPowerOfTwo(0);

        assertFalse(result);
    }
}