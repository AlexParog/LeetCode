package org.parog.algo_roadmap.arrays_hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1.
 * Диапазон массива: 1 <= nums.length <= 10^5
 * Диапазон элемента: -10^9 <= nums[i] <= 10^9
 * 2.
 * Тестовый класс {@link ContainsDuplicate217Test}
 * 3.
 * Временная сложность: O(n), где n - количество элементов nums
 * Пространственная сложность: O(n), где n - количество добавленных уникальных элементов множества
 */
public class ContainsDuplicate217 {
    public static boolean containsDuplicateWithSet(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num: nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);

        }

        return false;
    }

    public static boolean containsDuplicateWithMap(int[] nums) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1) {
                return true;
            }
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }

        return false;
    }
}
