package org.parog.yandex75;

/**
 * 1.
 * Диапазон длины массива: 1 <= nums.length <= 10^5
 * nums[i] является 0 или 1
 * 2.
 * Тестовый класс {@link MaxConsecutiveOnes485Test}
 * 3.
 * Временная сложность: O(N), где N количество элементов в массиве nums
 * Пространственная сложность: O(1) - не используем дополнительного пространства
 */
public class MaxConsecutiveOnes485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int globalMax = -1;
        int localMax = 0;

        for (int num : nums) {
            if (num == 0) {
                globalMax = Math.max(globalMax, localMax);
                localMax = 0;
                continue;
            }
            localMax++;
        }

        return Math.max(globalMax, localMax);
    }
}
