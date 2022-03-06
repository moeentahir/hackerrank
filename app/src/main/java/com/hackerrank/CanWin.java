package com.hackerrank;

public class CanWin {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        if (leap > game.length) {
            return true;
        }
        int i = -1;
        int numberOfTries = 0;
        do {
            int jumpIndex = i + leap;
            if (jumpIndex >= game.length) {
                return true;
            } else if (game[jumpIndex] == 0) {
                i = jumpIndex;
            } else if (game[i + 1] == 0) {
                i++;
            } else if (i > 0 && game[i - 1] == 0) {
                i--;
            } else {
                return false;
            }

            if (++numberOfTries > game.length) {
                return false;
            }
        } while (i < game.length);

        return false;
    }
}
