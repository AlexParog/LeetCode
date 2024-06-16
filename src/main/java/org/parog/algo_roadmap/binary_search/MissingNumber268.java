package org.parog.algo_roadmap.binary_search;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 1.
 * Длина массива: n == nums.length
 * Диапазон n: 1 <= n <= 10^4
 * Диапазон значения числа: 0 <= nums[i] <= n
 * Все числа уникальные
 * 2.
 * Тестовый класс {@link MissingNumber268Test}
 */
public class MissingNumber268 {
    /**
     * Временная сложность: O(n log n), из-за необходимости сортировки массива, а затем O(log n) для бинарного поиска
     * Пространственная сложность: O(1), так как используется только несколько дополнительных переменных
     *
     * @param nums массив чисел
     * @return пропущенное число в последовательности
     */
    public static int missingNumberWithBinarySearch(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length;

        // так как мы идем по последовательности чисел, то наше искомое число всегда будет слева
        // пока left не станет равным right
        while (left < right) {
            int mid = (left + right) / 2;
            // все элементы до этого индекса правильны, и нужно искать правее
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                //значит недостающее число находится слева, либо текущий элемент и есть недостающее число
                right = mid;
            }
        }
        return left;
    }

    /**
     * Находит пропущенное число в последовательности с использованием суммирования.
     * <p>
     * Временная сложность: O(n)
     * Пространственная сложность: O(1)
     *
     * @param nums массив чисел
     * @return пропущенное число в последовательности
     */
    public static int missingNumberWithSum(int[] nums) {
        // Проход по всему массиву для вычисления суммы занимает O(n)
        int sumNums = Arrays.stream(nums).sum();
        // Проход по числам от 1 до n (включительно) также занимает O(n)
        int sumLengthN = IntStream.range(1, nums.length + 1).sum();

        return sumLengthN - sumNums;
    }
}
