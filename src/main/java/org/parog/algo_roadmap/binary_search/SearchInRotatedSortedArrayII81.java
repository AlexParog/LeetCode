package org.parog.algo_roadmap.binary_search;

/**
 * 1.
 * Диапазон nums.length: 1 <= nums.length <= 5000
 * Диапазон nums[i]: -10^4 <= nums[i] <= 10^4
 * Целочисленный массив nums, отсортированный в неубывающем порядке (не обязательно с разными значениями)
 * Диапазон target: -10^4 <= target <= 10^4
 * 2.
 * Тестовый класс {@link SearchInRotatedSortedArrayII81Test}
 * 3.
 * Ограничение по времени:
 * в худшем случае, когда можно дубликатов - O(n), где n количество элементов массива
 * <p>
 * в среднем - O(logN), так как используется бинарный поиск
 * Ограничение по памяти: O(1) - константное время, так как алгоритм использует только фиксированное количество переменных,
 * независимо от размера входного массива nums
 */
public class SearchInRotatedSortedArrayII81 {
    public static boolean search(int[] nums, int target) {
        if (nums.length == 0) return false;

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return true;

            //if there are duplicates
            // если элементы являются дубликатами
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            } else if (nums[left] <= nums[mid]) { // левая половина отсортирована
                if (isTargetInLeftSortedArr(nums, target, mid, left)) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // правая половина отсортирована
                if (isTargetInRightSortedArr(nums, target, mid, right)) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
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
