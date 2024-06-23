package org.sasha;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Test for parameterized JUnit method with assumptions.
 */
public class ParamJUnitTest {

    /**
     * Parameterized test to check if numbers are odd.
     *
     * @param num        the number to check
     * @param correctRes the result user expects
     */
    @ParameterizedTest
    @CsvSource({
            "2, false",
            "3, true",
            "4, false",
            "5, true",
            "6, false",
            "11, true",
            "12, false",
            "13, true",
            "17, true"
    })
    void isOddTest(int num, boolean correctRes) {
        assumeTrue(isOddSupported(), "Odd number check is not supported");
        assumeTrue(num <= 10 || num % 2 == 1, "Odd numbers greater than 10 are not valid in this program");
        assertEquals(correctRes, isOdd(num), "Number " + num + ": " + (correctRes ? "odd" : "even"));
    }

    /**
     * Defines if a number is odd
     *
     * @param num the number to check
     * @return true if the number is odd and false if not
     */
    boolean isOdd(int num) {
        return num % 2 != 0;
    }

    /**
     * Check if odd numbers are supported.
     *
     * @return true if odd numbers are supported
     */
    boolean isOddSupported() {
        return true;
    }
}
