package org.parog.algo_roadmap.arrays_hashing;

/**
 * 1.
 * Диапазон длины массива: 1 <= nums.length <= 104
 * Диапазон значений элемента массива: -1000 <= nums[i] <= 1000
 * 2.
 * Тестовый класс {@link FindPivotIndex724Test}
 * 3.
 * Временная сложность: O(n), где n - количество элементов во входном массиве
 * Пространственная сложность: O(1) - не используем дополнительных структур данных
 */
public class FindPivotIndex724 {
    /**
     * Индекс опоры — это такой индекс index, что сумма элементов слева от него (leftSum) равна сумме элементов справа
     * от него (rightSum). В момент времени, когда мы находимся на индексе index, currentSum уже содержит сумму всех
     * элементов слева от этого индекса. Выражение totalSum - nums[index] вычисляет сумму всех элементов массива, кроме
     * текущего элемента на индексе index. Если из этой суммы вычесть currentSum, то мы получим сумму всех элементов
     * справа от текущего индекса.
     *
     * @param nums массив чисел
     * @return опорный индекс
     */
    public static int pivotIndex(int[] nums) {
        // сумма элементов массива слева от текущего индекса index
        int currentSum = 0;
        // сумма всех элементов в массиве nums
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int index = 0; index < nums.length; index++) {
            int rightSum = totalSum - nums[index] - currentSum;
            if (currentSum == rightSum) {
                return index;
            }
            currentSum += nums[index];
        }

        return -1;
    }

    /**
     * Более "прямое решение".
     * Пространственная сложность ухудшилась: O(N), так как используем доп. массивы для хранения сумм
     *
     * @param nums входящий массив
     * @return опорный элемент
     */
    public static int pivotIndexV2(int[] nums) {
        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];

        sumLeft[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sumLeft[i] = sumLeft[i - 1] + nums[i];
        }

        sumRight[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            sumRight[i] = sumRight[i + 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (sumLeft[i] == sumRight[i]) {
                return i;
            }
        }

        return -1;
    }
}