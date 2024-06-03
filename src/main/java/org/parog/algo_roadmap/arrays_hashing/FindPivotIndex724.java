package org.parog.algo_roadmap.arrays_hashing;

/**
 * 1.
 * Диапазон длины массива: 1 <= nums.length <= 104
 * Диапазон значений элемента массива: -1000 <= nums[i] <= 1000
 * 2.
 * Тестовый класс {@link FindPivotIndex724Test}
 * 3.
 * Временная сложность: O(n), где n - количество элементов во входном массиве
 * Пространственная сложность: O(1) - не используем дополнительных структур данных
 */
public class FindPivotIndex724 {
    public static int pivotIndex(int[] nums) {
        int currentSum = 0;
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int index = 0; index < nums.length; index++) {
            int rightSum = totalSum - nums[index] - currentSum;
            if (currentSum == rightSum) {
                return index;
            }
            currentSum += nums[index];
        }

        return -1;
    }
}