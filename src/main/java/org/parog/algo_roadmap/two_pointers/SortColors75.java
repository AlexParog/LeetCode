package org.parog.algo_roadmap.two_pointers;

/**
 * 1.
 * Количество n равно количеству элементов nums.length, диапазон: 1 <= n <= 300
 * Элементы массива nums[i]: 0, 1 или 2.
 * Пространственная сложность должна быть постоянной
 * 2.
 * Тестовый класс {@link SortColors75Test}
 * 3.
 * Временная сложность: O(n), где n количество элементов в массиве
 * Пространственная сложность: O(1) не используем дополнительной памяти
 */
public class SortColors75 {
    /**
     * Алгоритм "Dutch National Flag" Эдсгер Дейкстра
     *
     * @param nums массив
     * @return отсортированный массив
     */
    public static int[] sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while (mid <= right) {
            // меняем nums[mid] с nums[low]
            if (nums[mid] == 0) {
                swap(nums, left, mid);
                mid++;
                left++;
                // увеличиваем mid, так как 1 должно быть между 0 и 2
            } else if (nums[mid] == 1) {
                mid++;
                //  не увеличивая mid, так как нужно снова проверить элемент,
                //  который теперь находится на позиции mid
            } else {
                swap(nums, mid, right);
                right--;
            }
        }

        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
