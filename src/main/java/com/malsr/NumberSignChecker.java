package com.malsr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class NumberSignChecker {

    private static final Logger LOGGER = LoggerFactory.getLogger(NumberSignChecker.class);

    /**
     * Determines if two integers have opposite signs, eg. -1 and 8
     * -1 => 1111 1111
     *  8 => 0000 1000
     * XOR=> 1111 0111 which is < 0
     */
    public boolean determinesTwoIntegersHaveOppositeSigns(int numberOne, int numberTwo) {
        LOGGER.info("binary representation of numberOne {}", Integer.toBinaryString(numberOne));
        LOGGER.info("binary representation of numberTwo {}", Integer.toBinaryString(numberTwo));

        int exclusiveORNumber = numberOne ^ numberTwo;
        LOGGER.info("binary representation of exclusive OR {}, which is {} in decimal", Integer.toBinaryString(exclusiveORNumber), exclusiveORNumber);
        return (exclusiveORNumber < 0);
    }
}
