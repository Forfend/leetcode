package com.leetcode.problems.easy.reverseInteger;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

    @Test
    void testReversed(){
        ReverseInteger reverse = new ReverseInteger();
        int reversed = reverse.reverse(123);

        assertEquals(321, reversed);
    }

    @Test
    void testReversedNegativeNumbers(){
        ReverseInteger reverse = new ReverseInteger();
        int reversed = reverse.reverse(-123);

        assertEquals(-321, reversed);
    }

    @Test
    void testReversedNegative2(){
        ReverseInteger reverse = new ReverseInteger();
        int reversed = reverse.reverse(120);

        assertEquals(21, reversed);
    }

    @Test
    void testReversedNegative3(){
        ReverseInteger reverse = new ReverseInteger();
        int reversed = reverse.reverse(0);

        assertEquals(0, reversed);
    }

    @Test
    void testOutRangeNumber(){
        ReverseInteger reverse = new ReverseInteger();
        int reversed = reverse.reverse(1534236469);
        assertEquals(0, reversed);
    }
}