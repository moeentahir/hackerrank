package com.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedStringTest {
    @Test
    void test1() {
        assertTrue(BalancedString.isBalanced("()"));
    }

    @Test
    void test2() {
        assertFalse(BalancedString.isBalanced("(}"));
    }

    @Test
    void test3() {
        assertTrue(BalancedString.isBalanced(""));
    }

    @Test
    void test4() {
        assertTrue(BalancedString.isBalanced(null));
    }

    @Test
    void test5() {
        assertFalse(BalancedString.isBalanced("}}"));
    }

    @Test
    void test6() {
        assertTrue(BalancedString.isBalanced("[({{}})]"));
    }
}