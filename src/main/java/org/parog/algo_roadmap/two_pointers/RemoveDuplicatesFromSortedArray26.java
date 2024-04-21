package org.parog.algo_roadmap.two_pointers;

/**
 * 1.
 * 1 <= nums.length <= 3 * 10^4
 * -100 <= nums[i] <= 100
 * массив nums отсортирован в неубывающем порядке
 * 2.
 * Тестовый класс {@link RemoveDuplicatesFromSortedArray26Test}
 * 3.
 * Временная сложность: O(N), где N – длина массива nums
 * Пространственная сложность: O(1), алгоритм работает "in-place", модифицируя исходный массив.
 */
public class RemoveDuplicatesFromSortedArray26 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length < 1) {
            return -1;
        }

        int prev = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[prev] < nums[i]) {
                prev++;
                nums[prev] = nums[i];
            }
        }

        return prev + 1;
    }
}
