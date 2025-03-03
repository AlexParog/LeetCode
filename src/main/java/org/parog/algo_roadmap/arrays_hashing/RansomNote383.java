package org.parog.algo_roadmap.arrays_hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.
 * Диапазон длины входящих строк: 1 <= ransomNote.length, magazine.length <= 10^5
 * ransomNote и magazine состоят только из маленьких английских символов.
 * 2.
 * Тестовый класс {@link RansomNote383Test}
 */
public class RansomNote383 {
    /**
     * Временная сложность: O(N + M), где N - количество символов в строке ransomNote,
     * M - количество символов в строке magazine.
     * Пространственная сложность: O(K), где K - количество уникальных символов в ransomNote.
     * В худшем случае, если все символы уникальны, это будет O(N).
     *
     * @param ransomNote целевая строка
     * @param magazine   конструктор строки
     * @return true, если ransomNote можно построить их символов magazine, иначе false.
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : ransomNote.toCharArray()) {
            map.merge(ch, 1, Integer::sum);
        }

        for (char ch : magazine.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
            }
        }

        return map.isEmpty();

    }

    /**
     * Временная сложность: O(N + M), где N - количество символов в строке ransomNote,
     * M - количество символов в строке magazine.
     * Пространственная сложность: O(1), так как используется только английский алфавит.
     *
     * @param ransomNote целевая строка
     * @param magazine   конструктор строки
     * @return true, если ransomNote можно построить их символов magazine, иначе false.
     */
    public static boolean optimizedCanConstruct(String ransomNote, String magazine) {
        // a = 0, b = 1... z = 25
        int[] frequency = new int[26];

        // заполняем частоту повторения символов в строке magazine
        for (char ch : magazine.toCharArray()) {
            frequency[ch - 'a']++;
        }

        // для строки ransomNote проверяем: если ли еще в наличии символ из строки magazine, чтобы использовать его в ransomNote
        for (char ch : ransomNote.toCharArray()) {
            if (frequency[ch - 'a'] == 0) {
                return false;
            }
            // уменьшаем частоту
            frequency[ch - 'a']--;
        }


        return true;

    }
}
