package org.parog.algo_roadmap.arrays_hashing;

/**
 * 1.
 * Диапазон длины массива: 0 <= nums.length <= 100
 * Диапазон элемента массива: 0 <= nums[i] <= 50
 * Диапазон искомого значения: 0 <= val <= 100
 * 2.
 * Тестовый класс {@link RemoveElement27Test}
 * 3.
 * Временная сложность: O(n), где n - это количество элементов в массиве
 * Пространственная сложность: O(1), так как не используется дополнительная память (алгоритм in-place)
 */
public class RemoveElement27 {
    public static int removeElement(int[] nums, int val) {
        // указатель на следующую свободную позицию для элемента, не равного val
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // Если элемент не равен val, копируем его в позицию index
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
