package org.parog.algo_roadmap.arrays_hashing;

import java.util.*;

/**
 * 1.
 * 2.
 * Тестовый класс {@link TopKFrequentElements347Test}
 * 3.
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
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
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
}
