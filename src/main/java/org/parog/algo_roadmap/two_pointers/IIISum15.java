package org.parog.algo_roadmap.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1.
 * Диапазон длины массива: 3 <= nums.length <= 3000
 * Диапазон элемента: -10^5 <= nums[i] <= 10^5
 * 2.
 * Тестовый класс {@link IIISum15Test}
 * 3.
 * Временная сложность: O(n^2), где n - длина массива. Сортировка занимает O(n log n),
 * а цикл с Two Pointers - O(n^2) в худшем случае.
 * Пространственная сложность: в среднем случае для быстрой сортировки - O(log n)
 */
public class IIISum15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        // если i указывает на предпоследний или последний элемент, то
        // не останется достаточно элементов для поиска пары
        for (int i = 0; i < nums.length - 2; i++) {
            // Пропускаем повторяющиеся значения nums[i]
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int threeSum = nums[i] + nums[left] + nums[right];
                if (threeSum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // Пропускаем дубликаты left и right
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (threeSum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
