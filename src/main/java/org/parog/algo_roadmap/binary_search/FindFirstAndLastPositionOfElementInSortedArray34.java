package org.parog.algo_roadmap.binary_search;

/**
 * 1.
 * Диапазон для nums.length: 0 <= nums.length <= 10^5
 * Диапазон для nums[i]: -10^9 <= nums[i] <= 10^9
 * Диапазон для target: -10^9 <= target <= 10^9
 * nums, отсортирован в неубывающем порядке
 * искомая позиция target может повторяться
 * 2.
 * Тестовый класс {@link FindFirstAndLastPositionOfElementInSortedArray34Test}
 * 3.
 * Ограничения по времени: O(logN), где n - количество версий
 * Ограничения по памяти: O(1) - используем только входящие данные
 */
public class FindFirstAndLastPositionOfElementInSortedArray34 {
    public static int[] searchRange(int[] nums, int target) {
        if (nums.length < 1) return new int[]{-1, -1};

        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    /**
     * Находит индекс первого вхождения элемента в массиве.
     *
     * @param nums   массив чисел
     * @param target искомый элемент
     * @return индекс первого вхождения искомого элемента, если он существует; в противном случае -1
     */
    private static int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int first = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                first = mid;
                // ищем самое левое вхождение target в nums
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    /**
     * Находит индекс последнего вхождения элемента в массиве.
     *
     * @param nums   массив чисел
     * @param target искомый элемент
     * @return индекс последнего вхождения искомого элемента, если он существует; в противном случае -1
     */
    private static int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int last = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                last = mid;
                // ищем самое правое вхождение target в nums
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }
}
