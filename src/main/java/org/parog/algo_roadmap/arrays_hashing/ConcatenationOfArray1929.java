package org.parog.algo_roadmap.arrays_hashing;

/**
 * 1.
 * n == nums.length
 * Диапазон значения n: 1 <= n <= 1000
 * Диапазон значений массива: 1 <= nums[i] <= 1000
 * 2.
 * Тестовый класс {@link ConcatenationOfArray1929Test}
 * 3.
 * Ограничение по времени: O(N), где N - количество элементов во входном массиве nums.
 * Ограничение по памяти: O(2N), где N - количество элементов во входном массиве nums.
 */
public class ConcatenationOfArray1929 {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[n * 2];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + n] = nums[i];
        }

        return result;
    }
}
