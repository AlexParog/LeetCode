package org.parog.algo_roadmap.arrays_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.
 * Диапазон длины входящего массива: 2 <= nums.length <= 500
 * Диапазон значения для nums[i]: 0 <= nums[i] <= 100
 * 2.
 * Тестовый класс {@link HowManyNumbersAreSmallerThanTheCurrentNumber1365Test}
 * 3.
 * Временная сложность: O(NLogN), где N количество элементов в массиве. Применение быстрой сортировки
 * Пространственная сложность: O(N), где N количество элементов в массиве. Создаем копию массива.
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber1365 {

    /**
     * Отсортировав массив, мы получаем, что позиция первого вхождения числа равна количеству элементов, строго меньших
     * его. Сохраняем это в мапу и используем для восстановления ответа в исходном порядке.
     *
     * @param nums входящий массив
     * @return массив, хранящий для каждого nums[i] количество допустимых j, где j != i и nums[j] < nums[i]
     */
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] inOrder = Arrays.copyOf(nums, nums.length);
        Arrays.sort(inOrder);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inOrder.length; i++) {
            if (!map.containsKey(inOrder[i])) {
                map.put(inOrder[i], i);
            }
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }

        return result;
    }
}
