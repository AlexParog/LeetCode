package org.parog.algo_roadmap.binary_search;

/**
 * 1.
 * Диапазон длины массива: 1 <= nums.length <= 10^4
 * Диапазон значений nums[i], target: -10^4 < nums[i], target < 10^4
 * Все целые числа в nums уникальны
 * nums отсортированы в порядке возрастания
 * 2.
 * Тестовый класс {@link BinarySearch704Test}
 * 3.
 * Временная сложность: O(log N), где N - количество элементов в массиве (бинарный поиск)
 * Пространственная сложность: O(1), не используем дополнительных структур данных
 */
public class BinarySearch704 {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
