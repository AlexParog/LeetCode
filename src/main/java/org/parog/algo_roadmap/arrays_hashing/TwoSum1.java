package org.parog.algo_roadmap.arrays_hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.
 * Диапазон длины массива: 2 <= nums.length <= 10^4
 * Диапазон значений внутри массива: -10^9 <= nums[i] <= 10^9
 * Диапазон target: -10^9 <= target <= 10^9
 * Гарантировано только одно решение
 * 2.
 * Тестовый класс {@link TwoSum1Test}
 */
public class TwoSum1 {

    /**
     * Временная сложность: O(n), где n - количество элементов массива
     * Пространственная сложность: O(n), нужно столько же места в памяти, сколько элементов в исходном массиве nums.
     *
     * @param nums   массив
     * @param target цель
     * @return массив из индексов элементов, сумма которых равна target
     */
    public static int[] twoSumHashMap(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{};
        }

        // key - num, val - index
        Map<Integer, Integer> map = new HashMap<>();

        for (int cur = 0; cur < nums.length; cur++) {
            int diff = target - nums[cur];

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), cur};
            }
            map.put(nums[cur], cur);
        }

        return new int[]{};
    }

    /**
     * Временная сложность: O(n^2), где n - количество элементов массива
     * Пространственная сложность: O(1), так как не создаем никаких доп. объектов
     *
     * @param nums   массив
     * @param target цель
     * @return массив из индексов элементов, сумма которых равна target
     */
    public static int[] twoSumBruteForce(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
