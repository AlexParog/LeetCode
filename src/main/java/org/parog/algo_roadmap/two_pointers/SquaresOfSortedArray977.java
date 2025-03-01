package org.parog.algo_roadmap.two_pointers;

/**
 * 1.
 * Диапазон длины входящего массива: 1 <= nums.length <= 10^4
 * Диапазон значений массива: -10^4 <= nums[i] <= 10^4
 * Числа сортируется в порядке неубывания.
 * 2.
 * Тестовый класс {@link SquaresOfSortedArray977Test}
 * 3.
 * Временная сложность: O(N), где N - длина массива nums.
 * Пространственная сложность: O(N), результирующий массив, который хранит столько же элементов, сколько во входящем массиве.
 */
public class SquaresOfSortedArray977 {
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                result[index] = nums[right] * nums[right];
                right--;
            } else {
                result[index] = nums[left] * nums[left];
                left++;
            }
            index--;
        }

        return result;
    }
}
