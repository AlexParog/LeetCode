package org.parog.algo_roadmap.arrays_hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * 1.
 * Диапазон длины массивов: 1 <= nums1.length, nums2.length <= 9
 * Диапазон значений массивов: 1 <= num1[i], num2[i] <= 9
 * Все цифры в каждом массиве уникальны.
 * 2.
 * Тестовый класс {@link FormSmallestNumberFromTwoDigitArrays2605Test}
 */
public class FormSmallestNumberFromTwoDigitArrays2605 {
    /**
     * Временная сложность: O(N + M), где N - количество чисел в nums1, M - количество чисел в nums2.
     * Пространственная сложность: O(1), так как используется массив фиксированной длины.
     *
     * @param nums1 входящий массив nums1
     * @param nums2 входящий массив nums1
     * @return минимальное число (1 разряд или 2 разряда)
     */
    public static int optimizedMinNumber(int[] nums1, int[] nums2) {
        // частота повторения цифр в массиве nums1 и nums2
        int[] frequency = new int[10];
        int firstMin = 10;
        int secondMin = 10;

        // поиск минимума в nums1
        for (int num : nums1) {
            frequency[num]++;
            firstMin = Math.min(firstMin, num);
        }

        // поиск минимума в nums2
        for (int num : nums2) {
            frequency[num]++;
            secondMin = Math.min(secondMin, num);
        }

        // если число повторялось в nums1 и в nums2 - число из 1 разряда
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == 2) {
                return i;
            }
        }

        return Math.min(firstMin * 10 + secondMin, secondMin * 10 + firstMin);
    }

    /**
     * Временная сложность: O(N + M), где N - количество чисел в nums1, M - количество чисел в nums2.
     * Пространственная сложность: O(N), так как в худшем случае (если все элементы уникальны) множество set занимает O(N)
     * дополнительной памяти.
     *
     * @param nums1 входящий массив nums1
     * @param nums2 входящий массив nums1
     * @return минимальное число (1 разряд или 2 разряда)
     */
    public static int minNumber(int[] nums1, int[] nums2) {
        int firstMin = 10;
        for (int num : nums1) {
            if (num < firstMin) {
                firstMin = num;
            }
        }

        int secondMin = 10;
        for (int num : nums2) {
            if (num < secondMin) {
                secondMin = num;
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        int commonMin = Integer.MAX_VALUE;
        for (int num : nums2) {
            if (set.contains(num) && num < commonMin) {
                commonMin = num;
            }
        }

        if (commonMin != Integer.MAX_VALUE) {
            return commonMin;
        }

        return Math.min(firstMin * 10 + secondMin, secondMin * 10 + firstMin);
    }
}
