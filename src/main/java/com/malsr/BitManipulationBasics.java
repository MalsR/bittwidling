package com.malsr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BitManipulationBasics {

    private final Logger LOG = LoggerFactory.getLogger(BitManipulationBasics.class);

    /**
     * Simple function to determine if an unsigned integer is a power of 2^n. Performing the following bit level
     * manipulation x & (x - 1) where it is resulting to zero makes it a power 2n.
     * E.g. number 4,
     * 4 & (4 - 1) => 0100
     *                0011
     *                ----
     *                0000
     *                ----
     *
     * E.g. number 6,
     * 6 & (6-1)  =>  0110
     *                0101
     *                ----
     *                0100
     */
    public boolean isUnsignedIntegerPowerOfTwo(int number) {
        int bitwiseAndNumber = number & (number - 1);
        LOG.info("{} after bitwise AND {} ", number, bitwiseAndNumber);
        return (number != 0 && bitwiseAndNumber == 0);
    }

    /**
     * Turn off the right most 1-bit of an unsigned number x & (x - 1). e.g.
     * 88 & (88 - 1) => 0101 1000 & 0101 0111 => 0101 0000
     */
    public int turnOffRightMostOneBitOnUnsignedInt(int number) {
        LOG.info("turn off right most 1-bit {} & {}", number,  number - 1);
        return (number & (number - 1));
    }
}
