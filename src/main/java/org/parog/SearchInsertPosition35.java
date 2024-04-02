package org.parog;

/**
 * 1.
 * Диапазон размера массива 1 <= nums.length <= 10^4
 * Диапазон каждого элемента массива -10^4 <= nums[i] <= 10^4
 * Диапазон target -10^4 <= target <= 10^4
 * Все числа уникальные и не повторов
 * 2.
 * Тесты в классе {@link SearchInsertPosition35Test}
 * 3.
 * Ограничения по времени - O(logN)
 * Ограничения по памяти - O(1), так как используем только входящие данные
 */
public class SearchInsertPosition35 {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            // использую данную реализацию, потому что сonstraints позволяют (переполнения не будет)
            // иначе бы использовал left + (right - left) / 2
            int mid = (right + left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
