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
        int maxSumOfUnits = 0;
        int curSumOfUnits = 0;

        for (int num : nums) {
            if (num == 1) {
                curSumOfUnits++;
            } else {
                // максимизируем сумму
                maxSumOfUnits = Math.max(maxSumOfUnits, curSumOfUnits);
                curSumOfUnits = 0;
            }
        }

        // когда в конце массива находится наибольшая сумма
        return Math.max(maxSumOfUnits, curSumOfUnits);
    }
}
