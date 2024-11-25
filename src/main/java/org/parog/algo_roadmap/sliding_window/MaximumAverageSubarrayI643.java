package org.parog.algo_roadmap.sliding_window;

import java.util.Arrays;

/**
 * 1.
 * Диапазон длины отрезок для вычисления среднего значения: 1 <= k <= nums.length <= 10^5
 * Диапазон значений для элемента массива: -10^4 <= nums[i] <= 10^4
 * 2.
 * Тестовый класс {@link MaximumAverageSubarrayI643Test}
 * 3.
 * Временная сложность: O(N), где N - длина массива nums. Так как проходимся по массиву ровно один раз, не выполняя
 * вложенных циклов и без пересчета максимальной суммы каждый раз.
 * Пространственная сложность: O(1), не используются дополнительные структуры данных
 */
public class MaximumAverageSubarrayI643 {
    public static double findMaxAverage(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return Double.NaN;
        }
        // вычисляем сумму первого подмассива размера k
        double currentSum = Arrays.stream(nums, 0, k).sum();
        double maxSum = currentSum;

        // так как первый подмассив уже вычислен, то начинаем вычислять сразу "второе окно"
        // (вычитаем 0 элемент, добавляем nums[i])
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum / k;
    }
}
