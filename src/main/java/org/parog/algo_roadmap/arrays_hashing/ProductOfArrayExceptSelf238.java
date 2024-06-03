package org.parog.algo_roadmap.arrays_hashing;

/**
 * 1.
 * Диапазон длины: 2 <= nums.length <= 10^5
 * Диапазон значений элементов массива: -30 <= nums[i] <= 30
 * Произведение любого prefix или suffix nums гарантированно поместится в 32-битное целое число
 * 2.
 * Тестовый класс {@link ProductOfArrayExceptSelf238Test}
 */
public class ProductOfArrayExceptSelf238 {

    /**
     * Временная сложность: O(n), где n количество элементов в массиве nums
     * Пространственная сложность: O(n), так как созданы два дополнительных массива для префиксов и постфиксов размера
     * nums.length
     *
     * @param nums входной массив
     * @return массив, где nums[i] равен произведению всех элементов nums, кроме nums[i]
     */
    public static int[] productExceptSelfWithExtraSpace(int[] nums) {
        int[] result = new int[nums.length];

        int[] prefix = new int[nums.length];
        int left = 1;
        // префиксные значения
        for (int i = 0; i < nums.length; i++) {
            prefix[i] = left;
            left *= nums[i];

        }

        int[] postfix = new int[nums.length];
        int right = 1;
        // постфиксные значения
        for (int j = nums.length - 1; j >= 0; j--) {
            postfix[j] = right;
            right *= nums[j];
        }

        for (int index = 0; index < nums.length; index++) {
            result[index] = prefix[index] * postfix[index];
        }

        return result;
    }

    /**
     * Временная сложность: O(n), где n количество элементов в массиве nums
     * Пространственная сложность: O(1), так как используем алгоритм in place (выходной result не считается при оценке
     * сложности алгоритма)
     *
     * @param nums входной массив
     * @return массив, где nums[i] равен произведению всех элементов nums, кроме nums[i]
     */
    public static int[] productExceptSelfWithInPlace(int[] nums) {
        int[] result = new int[nums.length];
        int left = 1, right = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = left;
            left *= nums[i];
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            result[j] *= right;
            right *= nums[j];
        }

        return result;
    }
}
