package org.parog.algo_roadmap.arrays_hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1.
 * Диапазон длины массива nums: 2 <= nums.length <= 104
 * Диапазон значений массива nums: 1 <= nums[i] <= 104
 * 2.
 * Тестовый класс {@link SetMismatch645Test}
 * 3.
 * Временная сложность:
 * Пространственная сложность:
 */
public class SetMismatch645 {
    /**
     * Сумма чисел от 1 до n: n * (n + 1) / 2. Чтобы найти число, которое было пропущено, нужно воспользоваться формулой:
     * miss = sum - actualSum + num, где num - это дубликат, который нашли в массиве.
     *
     * @param nums массив чисел
     * @return [повторяющееся число, отсутствующее число]
     */
    public static int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = nums.length * (nums.length + 1) / 2;
        int actualSum = Arrays.stream(nums).sum();

        for (int num : nums) {
            if (!set.add(num)) {
                return new int[]{num, sum - actualSum + num};
            }
        }
        return new int[]{-1, -1};
    }
}
