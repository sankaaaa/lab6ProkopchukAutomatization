package org.sasha;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for parameterized JUnit method.
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
}
