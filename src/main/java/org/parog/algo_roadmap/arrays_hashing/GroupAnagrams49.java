package org.parog.algo_roadmap.arrays_hashing;

import java.util.*;

/**
 * 1.
 * Диапазон длины массива: 1 <= strs.length <= 10^4
 * Диапазон строки в массиве: 0 <= strs[i].length <= 100
 * strs[i] состоит из строчных английских букв
 * 2.
 * Тестовый класс {@link GroupAnagrams49Test}
 * 3.
 * Временная сложность: O(N * K log K), где N - количество строк в массиве strs, а K - длина строки,
 * для каждой строки выполняется сортировка длиной K.
 * Пространственная сложность: O(N * K), где N — количество строк, K — максимальная длина строки.
 * <p>
 * Хранение ключей в хеш-таблице: Мы храним до N ключей, каждый из которых занимает O(K) памяти
 * Хранение значений в хеш-таблице: Мы храним все исходные строки в хеш-таблице в виде списков,
 * и общий объем памяти для всех списков равен O(N * K)
 */
public class GroupAnagrams49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String s : strs) {
            // преобразуем строку в массив символов и сортируем его
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // если группа для отсортированной строки уже существует, то
            // добавляем в нее текущую строку
            if (!anagrams.containsKey(sorted)) {
                anagrams.put(sorted, new ArrayList<>());
            }
            anagrams.get(sorted).add(s);
        }

        return new ArrayList<>(anagrams.values());
    }
}
