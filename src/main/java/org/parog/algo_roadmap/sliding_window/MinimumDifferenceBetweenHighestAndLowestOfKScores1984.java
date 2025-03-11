package org.parog.algo_roadmap.sliding_window;

import java.util.Arrays;

/**
 * 1.
 * Диапазон значений k и длины массива: 1 <= k <= nums.length <= 1000
 * Диапазон значений оценок: 0 <= nums[i] <= 105
 * 2.
 * Тестовый класс {@link }
 * 3.
 * Временная сложность: O(N log N), где N — длина массива nums. Сортировка занимает O(N log N), а проход по массиву — O(N).
 * Пространственная сложность: O(1), если не учитывать память для сортировки (Arrays.sort использует O(log N) дополнительной памяти для рекурсии).
 */
public class MinimumDifferenceBetweenHighestAndLowestOfKScores1984 {
    public static int minimumDifference(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return 0;
        }

        // после сортировки легко находим разницу max(оценка) и min(оценка) в группе из k студентов
        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;
        // идем до nums.length - k
        for (int i = 0; i <= nums.length - k; i++) {
            // разница максимального балла и минимального балла в группе
            int currDiff = nums[i + k - 1] - nums[i];

            minDiff = Math.min(minDiff, currDiff);
        }

        return minDiff;
    }
}
