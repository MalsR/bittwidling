package com.malsr;

public class BitManipulationPowerOfTwo {

    /**
     * Simple function to determine if a number is a power of 2. If a number is simplified to the form of 2n then
     * its a power of two. TODO fractions
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
    public boolean isPowerOfTwo(int number) {
        int bitwiseAndNumber = number & (number - 1);
        System.out.println(number + " After bitwise AND " + bitwiseAndNumber);
        return (number != 0 && bitwiseAndNumber == 0);
    }
}
