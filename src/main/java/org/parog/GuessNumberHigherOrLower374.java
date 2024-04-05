package org.parog;

/**
 * 1.
 * Диапазон для числа n: 1 <= n <= 2^31 - 1
 * Отгадать загадываемое число -> compare, который возвращает -1, 0, 1
 * 2.
 * Тестовый класс {@link GuessNumberHigherOrLower374Test}
 * 3.
 * Ограничения по времени: O(logN)
 * Ограничение по памяти: O(1)
 */
public class GuessNumberHigherOrLower374 {
    private static final int PEEK = 1;

    public static int guessNumber(int n) {
        int left = 0;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    private static int guess(int num) {
        return Integer.compare(PEEK, num);
    }
}
