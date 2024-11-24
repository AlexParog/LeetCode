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
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;

        for (int num : nums) {
            if (num == 1) {
                currentConsecutiveOnes++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
            } else {
                currentConsecutiveOnes = 0;
            }
        }

        return maxConsecutiveOnes;
    }
}
