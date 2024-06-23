package org.parog.algo_roadmap.sliding_window;

/**
 * 1.
 * Диапазон размера массива: 1 <= nums.length <= 50
 * Диапазон значений: 0 <= nums[i] <= 50
 * Диапазон значений k: 0 <= k < 64
 * 2.
 * Тестовый класс {@link ShortestSubarrayWithORLeastK_I3095Test}
 * 3.
 * Временная сложность: O(n), где n - количество элементов в массиве nums
 * Пространственная сложность: O(1), так как каждый элемент обрабатывается не более двух раз
 * (движение указателей left и right)
 * <p>
 */

// TODO: Wrong Answer 659 / 834 testcases passed
public class ShortestSubarrayWithORLeastK_I3095 {
    public static int minimumSubarrayLength(int[] nums, int k) {
        if (k == 0) return 1; // Если k = 0, любой ненулевой элемент удовлетворяет условию.
        /*
        если в массиве будет найден подмассив, длина которого равна nums.length,
        то мы не сможем отличить его от начальной инициализации
         */
        int minLength = nums.length + 1;
        // любое число OR с 0 даст само это число
        int currentOr = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            // Расширяем окно, добавляя текущий элемент к OR
            currentOr |= nums[right];

            // Сжимаем окно, пока значение OR удовлетворяет условию currentOr >= k
            while (currentOr >= k) {
                minLength = Math.min(minLength, right - left + 1);
                currentOr &= ~nums[left];
                left++;
            }
        }

        return minLength == nums.length + 1 ? -1 : minLength;
    }
}
