package com.malsr;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BitManipulationBasicsTest {

    private BitManipulationBasics underTest;

    @Before
    public void setup() {
        underTest = new BitManipulationBasics();
    }

    @Test
    public void determinesGivenFixedUnsignedNumberArePowerOfTwo() {
        assertTrue(underTest.isUnsignedIntegerPowerOfTwo(1));
        assertTrue(underTest.isUnsignedIntegerPowerOfTwo(2));
        assertTrue(underTest.isUnsignedIntegerPowerOfTwo(4));
        assertTrue(underTest.isUnsignedIntegerPowerOfTwo(16));
    }

    @Test
    public void determinesGivenFixedUnsignedNumbersAreNotPowerOfTwo() {
        assertFalse(underTest.isUnsignedIntegerPowerOfTwo(13));
        assertFalse(underTest.isUnsignedIntegerPowerOfTwo(6));
    }

    @Test
    public void zeroIsNotConsideredPowerOfTwo() {
        boolean result = underTest.isUnsignedIntegerPowerOfTwo(0);
        assertFalse(result);
    }

    @Test
    public void turnsOffRightMostBitOnUnsignedInteger() {
        assertEquals(0, underTest.turnOffRightMostOneBitOnUnsignedInt(8));
        assertEquals(80, underTest.turnOffRightMostOneBitOnUnsignedInt(88));
        assertEquals(0, underTest.turnOffRightMostOneBitOnUnsignedInt(0));
    }
}