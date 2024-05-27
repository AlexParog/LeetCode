package org.parog.algo_roadmap.arrays_hashing;

import java.util.*;

/**
 * 1.
 * Диапазон длины массива: 1 <= nums.length <= 10^5
 * Диапазон значений: -10^4 <= nums[i] <= 10^4
 * k находится в диапазоне [1, количество уникальных элементов в массиве].
 * Гарантируется, что ответ будет уникальным
 * 2.
 * Тестовый класс {@link TopKFrequentElements347Test}
 */
public class TopKFrequentElements347 {
    /**
     * ПАТТЕРНЫ ДЛЯ ЗАДАЧ С ИСПОЛЬЗОВАНИЕМ КУЧИ
     * <p>
     * 1. Нужно найти k наибольших или k наименьших элементов:
     * Задачи, где требуется найти самые частые, самые большие или самые маленькие элементы, часто эффективно решаются
     * с помощью кучи.
     * <p>
     * 2. Динамическое поддержание k элементов:
     * Когда необходимо динамически поддерживать k наибольших или наименьших элементов при поступлении новых данных,
     * кучи становятся особенно полезными.
     * <p>
     * 3. Ограничение по памяти:
     * Минимальная куча помогает ограничить использование памяти, так как мы поддерживаем кучу размером k, а не весь
     * массив.
     * <p>
     * Временная сложность: O(n log k), где n - общее количество элементов и оно не может превышать количество
     * уникальных элементов, k - ограничение очереди. Это худший вариант, если каждый элемент будет уникальным.
     * <p>
     * Пространственная сложность: O(n), где n количество элементов nums. Это худший вариант, если каждый
     * элемент будет уникальным.
     *
     * @param nums массив повторяющихся чисел
     * @param k    ограничение
     * @return самые повторяющиеся числа
     */
    public static int[] topKFrequentWithMinHeap(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        // минимальная куча для отслеживания k самых частых элементов
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (int num : nums) {
            frequency.merge(num, 1, Integer::sum);
        }


        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            minHeap.offer(entry);

            // если размер кучи становится больше k, то удаляем из кучи наименее частый элемент
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] topElements = new int[k];
        for (int i = 0; i < k; i++) {
            topElements[i] = minHeap.poll().getKey();
        }

        return topElements;
    }

    /**
     * Временная сложность: O(n log n), где n - количество элементов в nums
     * Пространственная сложность: O(n), где n - количество элементов в nums
     *
     * @param nums массив повторяющихся чисел
     * @param k    ограничение
     * @return самые повторяющиеся числа
     */
    public static int[] topKFrequentWithSort(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            frequency.merge(num, 1, Integer::sum);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(frequency.entrySet());
        // не особо удачный способ написания компоратора
        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] topKElements = new int[k];
        for (int i = 0; i < k; i++) {
            topKElements[i] = list.get(i).getKey();
        }

        return topKElements;
    }

    /**
     * Временная сложность: O(n), где n - количество элементов в массиве nums
     * Пространственная сложность: O(n), где n - количество значений в массиве nums.
     * Так как buckets хранит ровно n корзин и hashmap в худшем случае хранит n уникальных элементов.
     *
     * @param nums массив повторяющихся чисел
     * @param k    ограничение
     * @return самые повторяющиеся числа
     */
    public static int[] topKFrequentWithBucketSort(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        List<List<Integer>> buckets = new ArrayList<>(nums.length + 1);

        for (int num : nums) {
            frequency.merge(num, 1, Integer::sum);
        }

        // инициализируем пустые корзины
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }

        // заполняем корзины уникальными элементами
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            int freq = entry.getValue();
            buckets.get(freq).add(entry.getKey());
        }

        // добавляем в результирующий список n-количество наиболее встречающихся элементов с конца,
        // соблюдая ограничение K
        List<Integer> result = new ArrayList<>();
        for (int i = nums.length; i >= 0 && result.size() < k; i--) {
            result.addAll(buckets.get(i));
        }

        // создаем массив из k значений и выводим ответ
        return result.subList(0, k).stream().mapToInt(Integer::intValue).toArray();
    }
}
