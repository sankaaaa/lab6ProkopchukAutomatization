package org.sasha;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for simple JUnit library utility methods.
 */
public class SimpleJUnitTest {

    /**
     * Test to check if numIsOdd method identifies even/odd numbers.
     */
    @Test
    void numIsOddTest() {
        assertFalse(numIsOdd(12), "Number 12 must be even!");
        assertTrue(numIsOdd(13), "Number 13 must be odd!");
    }

    /**
     * Define if the number is odd one.
     *
     * @param num the number to check
     * @return true if the number is odd and false if not
     */
    boolean numIsOdd(int num) {
        return num % 2 != 0;
    }
}
