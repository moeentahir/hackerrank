package com.hackerrank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.jupiter.api.Assertions.*;

class CanWinTest {
    @Test
    void name() {
        assertTrue(CanWin.canWin(4, new int[]{0, 1, 1, 0, 0, 1, 1, 0, 1}));
    }

    @Test
    @Timeout(value = 2, unit = SECONDS)
    void name2() {
        assertFalse(CanWin.canWin(3, new int[]{0, 0, 1, 1, 1, 0}));
    }

    @Test
    @Timeout(value = 2, unit = SECONDS)
    void name3() {
        assertFalse(CanWin.canWin(1, new int[]{0, 1, 0}));
    }

    @Test
    @Timeout(value = 2, unit = SECONDS)
    void name4() {
        assertTrue(CanWin.canWin(41, new int[]{0, 0, 0, 0, 0, 1, 0, 1, 0}));
    }
    @Test
    @Timeout(value = 2, unit = SECONDS)
    void name5() {
        assertFalse(CanWin.canWin(6, new int[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 0}));
    }
}