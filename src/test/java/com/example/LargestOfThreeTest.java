
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestOfThreeTest {

    @Test
    public void testLargestNumber() {
        assertEquals(25, LargestOfThree.findLargest(10, 25, 15));
    }

    @Test
    public void testLargestFirstNumber() {
        assertEquals(50, LargestOfThree.findLargest(50, 20, 30));
    }

    @Test
    public void testEqualNumbers() {
        assertEquals(10, LargestOfThree.findLargest(10, 10, 5));
    }
}
