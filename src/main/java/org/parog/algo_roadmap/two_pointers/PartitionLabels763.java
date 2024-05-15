package org.parog.algo_roadmap.two_pointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1.
 * Длина строки s: 1 <= s.length <= 500
 * s состоит из английских маленьких букв
 * 2.
 * Тестовый класс {@link PartitionLabels763Test}
 */
public class PartitionLabels763 {

    /**
     * Реализация через HashMap
     * <p>
     * Первая итерация по строке - находим последний индекс вхождения символа
     * Вторая итерация по строке - посчитываем количество элементов в отрезке и
     * сравниваем с последним индексом в HashMap.
     * <p>
     * Временная сложность: O(n), где n количество символов в строке
     * Пространственная сложность: O(1), так как всего 26 английских букв, следовательно, постоянная сложность
     *
     * @param s строка
     * @return список целых чисел, обозначающих размер сегментов
     */
    public static List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> latestIndices = new HashMap<>();
        int size = 0;
        int endPartition = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            latestIndices.put(ch, i);
        }

        for (int j = 0; j < s.length(); j++) {
            size++;
            endPartition = Math.max(endPartition, latestIndices.get(s.charAt(j)));

            if (j == endPartition) {
                result.add(size);
                size = 0;
            }
        }

        return result;
    }

    /**
     * Упрощение с использованием двух указателей на начало сегмента и конец
     * <p>
     * Временная сложность: O(n), где n — длина строки
     * Пространственная сложность: O(1), так как latestIndices содержит не более 26 ключей
     * (для каждого символа английского алфавита).
     *
     * @param s строка
     * @return список целых чисел, обозначающих размер сегментов
     */
    public static List<Integer> partitionLabelsWithTwoPointers(String s) {
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> latestIndices = new HashMap<>();

        // Первый проход: найти последний индекс каждого символа
        for (int i = 0; i < s.length(); i++) {
            latestIndices.put(s.charAt(i), i);
        }

        // Второй проход: разделить строку на сегменты
        int start = 0, endPartition = 0;
        for (int i = 0; i < s.length(); i++) {
            endPartition = Math.max(endPartition, latestIndices.get(s.charAt(i)));
            if (i == endPartition) {
                result.add(endPartition - start + 1);
                start = i + 1;
            }
        }

        return result;
    }
}
