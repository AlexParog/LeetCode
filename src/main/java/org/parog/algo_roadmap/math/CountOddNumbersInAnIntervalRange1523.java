package org.parog.algo_roadmap.math;

/**
 * 1.
 * 0 <= low <= high <= 10^9
 * 2.
 * Тестовый класс {@link CountOddNumbersInAnIntervalRange1523Test}
 * 3.
 * Временная сложность: O(1), так как не используем никаких проходов по диапазону [high, low]
 * Пространственная сложность: O(1), так как не используем дополнительных структур
 */
public class CountOddNumbersInAnIntervalRange1523 {
    public static int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
