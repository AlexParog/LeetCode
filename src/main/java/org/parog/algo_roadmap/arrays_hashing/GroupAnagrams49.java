package org.parog.algo_roadmap.arrays_hashing;

import java.util.*;

/**
 * 1.
 * Диапазон длины массива: 1 <= strs.length <= 10^4
 * Диапазон строки в массиве: 0 <= strs[i].length <= 100
 * strs[i] состоит из строчных английских букв
 * 2.
 * Тестовый класс {@link GroupAnagrams49Test}
 */
public class GroupAnagrams49 {

    /**
     * Временная сложность: O(N * K log K), где N - количество строк в массиве strs, а K - длина строки,
     * для каждой строки выполняется сортировка длиной K.
     * Пространственная сложность: O(N * K), где N — количество строк, K — максимальная длина строки.
     * <p>
     * Хранение ключей в хеш-таблице: Мы храним до N ключей, каждый из которых занимает O(K) памяти
     * Хранение значений в хеш-таблице: Мы храним все исходные строки в хеш-таблице в виде списков,
     * и общий объем памяти для всех списков равен O(N * K)
     *
     * @param strs массив строк
     * @return разбивка анаграмм по группам
     */
    public static List<List<String>> groupAnagramsWithMap(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String s : strs) {
            // преобразуем строку в массив символов и сортируем его
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // если группа для отсортированной строки уже существует, то добавляем в нее текущую строку
            // иначе создаем новую группу
            if (!anagrams.containsKey(sorted)) {
                anagrams.put(sorted, new ArrayList<>());
            }
            anagrams.get(sorted).add(s);
        }

        return new ArrayList<>(anagrams.values());
    }

    /**
     * Преимущества:
     * 1. Избегание сортировки: Мы не сортируем строки, что позволяет избежать временной сложности O(K log K)
     * для каждой строки.
     * 2. Постоянная пространственная сложность для ключа: Массив частоты символов имеет фиксированный размер 26,
     * независимо от длины строки.
     * <p>
     * Временная сложность: O(N * K), где N — количество строк, K — максимальная длина строки.
     * Заполнение массива частоты и преобразование его в строку требуют O(K) времени.
     * Пространственная сложность: O(N * K), так как хеш-таблица хранит все строки и ключи,
     * каждый из которых занимает O(K) памяти.
     *
     * @param strs массив строк
     * @return разбивка анаграмм по группам
     */
    public static List<List<String>> groupAnagramsWithHashCode(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String s : strs) {
            // каждый элемент представляет собой количество вхождений определенного символа
            // 'a' имеет ASCII значение 97, 'b' имеет 98, и так далее до 'z', который имеет 122
            char[] charCount = new char[26];
            for (char c : s.toCharArray()) {
                // индекс в массиве charCount, соответствующий позиции этого символа в алфавите
                charCount[c - 'a']++;
            }

            // создаем уникальный ключ на основе частоты символов
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : charCount) {
                keyBuilder.append(count).append(",");
            }

            String key = keyBuilder.toString();
            // если уникальный ключ группы уже существует, то добавляем в нее текущую строку
            // иначе создаем группу
            if (!anagrams.containsKey(key)) {
                anagrams.put(key, new ArrayList<>());
            }
            anagrams.get(key).add(s);
        }

        return new ArrayList<>(anagrams.values());
    }
}
