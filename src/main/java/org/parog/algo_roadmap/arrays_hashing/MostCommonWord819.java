package org.parog.algo_roadmap.arrays_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1.
 * Диапазон параграфа: 1 <= paragraph.length <= 1000
 * параграф состоит из английских букв, пробелов ' ', или одного из символа: "!?',;.".
 * Длина массива бан-вордов: 0 <= banned.length <= 100
 * Диапазон длины бан-ворда: 1 <= banned[i].length <= 10
 * ван-ворд состоит из маленьких английских букв
 * 2.
 * Тестовый класс {@link MostCommonWord819Test}
 * 3.
 * Временная сложность: O(m), где m количество слов в массиве words после очистки в строке paragraph
 * Пространственная сложность: O(n), где n длина строки paragraph
 */
public class MostCommonWord819 {
    public static String mostCommonWord(String paragraph, String[] banned) {
        // очищаем paragraph от ,.!?;' и сплитим по пробелам
        String[] words = paragraph.replaceAll("[,.!?;'\\s]+", " ").toLowerCase().split(" ");
        Map<String, Integer> banWords = Arrays.stream(banned)
                .collect(Collectors.toMap(banWord -> banWord, banWord -> 1));
        Map<String, Integer> frequency = new HashMap<>();

        // если текущего слова нет в бан-вордах, то добавляем в hashmap
        for (String word : words) {
            if (!banWords.containsKey(word)) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }

        // выбираем максимум по частоте
        String common = frequency.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse("");

        return common;
    }
}
