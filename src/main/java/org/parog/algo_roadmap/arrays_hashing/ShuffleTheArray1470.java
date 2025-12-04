package org.parog.algo_roadmap.arrays_hashing;

/**
 * 1.
 * Диапазон значений для n: 1 <= n <= 500
 * Диапазон длины массива nums: nums.length == 2n
 * Диапазон значений массива nums: 1 <= nums[i] <= 10^3
 * 2.
 * Тестовый класс {@link ShuffleTheArray1470Test}
 * 3.
 * Временная сложность: O(N), где N = nums.length.
 * Пространственная сложность: O(N), где N размер результирующего массива
 */
public class ShuffleTheArray1470 {

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[n * 2];
        int index = 0;

        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }

        return result;
    }
}
