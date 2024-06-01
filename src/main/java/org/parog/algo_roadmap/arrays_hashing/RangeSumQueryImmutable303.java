package org.parog.algo_roadmap.arrays_hashing;

/**
 * 1.
 * Диапазон длины nums: 1 <= nums.length <= 104
 * Диапазон значения: -10^5 <= nums[i] <= 10^5
 * Диапазон индексов left, right: 0 <= left <= right < nums.length
 * 2.
 * Временная сложность: O(n) - для инициализации в конструкторе массива префиксных сумм,
 * n - количество элементов в массиве nums. sumRange - доступ по индексу за O(1)
 * Пространственная сложность: O(n) - создаем такой же длины массив, как и nums
 */
public class RangeSumQueryImmutable303 {
    /**
     * Массив, хранящий префиксные суммы
     */
    private static int[] prefix;

    /**
     * Инициализация массива префиксных сумм
     *
     * @param nums входной массив
     */
    public RangeSumQueryImmutable303(int[] nums) {
        if (nums.length == 0) {
            return;
        }

        prefix = new int[nums.length];
        // Инициализация первого элемента префиксного массива
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }

    /**
     * Если left равен 0, возвращаем элемент prefix[right], так как это сумма всех элементов от 0 до right.
     * <p>
     * В противном случае, возвращаем разницу между prefix[right] и prefix[left - 1],
     * что дает сумму элементов от left до right.
     *
     * @param left  левый указатель
     * @param right правый указатель
     * @return сумма элементов в отрезке [left, right] массива nums
     */
    public static int sumRange(int left, int right) {
        if (left == 0) {
            return prefix[right];
        }

        return prefix[right] - prefix[left - 1];
    }
}

