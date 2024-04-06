package org.parog.algo_roadmap.binary_search;

/**
 * 1.
 * Диапазон nums.length: 1 <= nums.length <= 5000
 * Диапазон nums[i]: -10^4 <= nums[i] <= 10^4
 * Все значения массива nums уникальны и массив nums отсортирован в возрастающем порядке
 * Диапазон target: -10^4 <= target <= 10^4
 * 2.
 * Тестовый класс {@link SearchInRotatedSortedArray33Test}
 * 3.
 * Ограничение по времени:
 * Ограничение по памяти:
 */
public class SearchInRotatedSortedArray33 {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            // гарантируем, что левый подмассив отсортирован
            if (nums[left] <= nums[mid]) {
                if (isTargetInLeftSortedArr(nums, target, mid, left)) {
                    // исключаем левую половину
                    right = mid - 1;
                } else {
                    // исключаем правую половину
                    left = mid + 1;
                }
                // гарантируем, что правый подмассив отсортирован
            } else {
                if (isTargetInRightSortedArr(nums, target, mid, right)) {
                    // исключаем левую половину
                    left = mid + 1;
                } else {
                    // исключаем правую половину
                    right = mid - 1;
                }
            }
        }

        return ans;
    }

    /**
     * Находится ли target в левой половине, сравнивая ее краем левой границы и средним элементами.
     *
     * @param nums   массив чисел
     * @param target искомый элемент
     * @param mid    текущая середина
     * @param left   левая граница
     * @return true - в отсортированной половине, false - в смещенной половине.
     */
    private static boolean isTargetInLeftSortedArr(int[] nums, int target, int mid, int left) {
        return target <= nums[mid] && target >= nums[left];
    }

    /**
     * Находится ли target в правой половине, сравнивая ее краем правой границы и средним элементами.
     *
     * @param nums   массив чисел
     * @param target искомый элемент
     * @param mid    текущая середина
     * @param right  левая граница
     * @return true - в отсортированной половине, false - в смещенной половине.
     */
    private static boolean isTargetInRightSortedArr(int[] nums, int target, int mid, int right) {
        return target >= nums[mid] && target <= nums[right];
    }
}
