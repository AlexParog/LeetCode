package org.parog.algo_roadmap.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 1.
 * Длина массивов: 1 <= nums1.length, nums2.length <= 1000
 * Диапазон элементов массива: 0 <= nums1[i], nums2[i] <= 1000
 * 2.
 * Тестовый класс {@link IntersectionOfTwoArrays349Test}
 */
public class IntersectionOfTwoArrays349 {
    /**
     * Временная сложность: O(m + n), где m и n - длины массивов nums1 и nums2 соответственно.
     * Создание Set из nums1: O(m) (в среднем случае для HashSet)
     * Проход по nums2 и проверка наличия элементов в Set: O(n) (в среднем случае для HashSet)
     * Преобразование результата в массив: O(k), где k - количество элементов в пересечении (не более min(m, n))
     * Пространственная сложность: O(m), так как мы храним все элементы nums1 в HashSet.
     *
     * @param nums1 массив 1
     * @param nums2 массив 2
     * @return пересечение массивов
     */
    public static int[] intersectionHashSet(int[] nums1, int[] nums2) {
        Set<Integer> uniqs = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.toSet());

        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (uniqs.contains(num)) {
                result.add(num);
                uniqs.remove(num);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    /**
     * В функциональном стиле.
     * <p>
     * Временная сложность: O(m + n), где m и n - длины массивов nums1 и nums2 соответственно.
     * Создание Set из nums1: O(m) (в среднем случае для HashSet)
     * Проход по nums2 и проверка наличия элементов в Set: O(n) (в среднем случае для HashSet)
     * Преобразование результата в массив: O(k), где k - количество элементов в пересечении (не более min(m, n))
     * Пространственная сложность: O(m), так как мы храним все элементы nums1 в HashSet.
     *
     * @param nums1 массив 1
     * @param nums2 массив 2
     * @return пересечение массивов
     */
    public static int[] intersectionHashSetFunctionalStyle(int[] nums1, int[] nums2) {
        Set<Integer> uniqs = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.toSet());

        return Arrays.stream(nums2)
                .filter(uniqs::contains)
                .distinct()
                .toArray();
    }

    /**
     * Реализация через два указателя.
     * <p>
     * Временная сложность: O(m log m + n log n + m + n)
     * Сортировка nums1: O(m log m)
     * Сортировка nums2: O(n log n)
     * Проход по отсортированным массивам с двумя указателями: O(m + n)
     * Пространственная сложность: O(log m + log n) (или O(1) в зависимости от реализации сортировки)
     * + O(k) для хранения результата.
     *
     * @param nums1 массив 1
     * @param nums2 массив 2
     * @return пересечение массивов
     */
    public static int[] intersectionTwoPointers(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int indexNums1 = 0;
        int indexNums2 = 0;
        List<Integer> result = new ArrayList<>();
        while (indexNums1 < nums1.length && indexNums2 < nums2.length) {
            if (nums1[indexNums1] == nums2[indexNums2]) {
                // Добавляем элемент, только если его еще нет в result или он не последний добавленный
                if (result.isEmpty() || result.get(result.size() - 1) != nums1[indexNums1]) {
                    result.add(nums1[indexNums1]);
                }
                indexNums1++;
                indexNums2++;
            } else if (nums1[indexNums1] > nums2[indexNums2]) {
                indexNums2++;
            } else {
                indexNums1++;
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
