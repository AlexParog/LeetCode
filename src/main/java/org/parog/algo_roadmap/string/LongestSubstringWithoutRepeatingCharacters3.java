package org.parog.algo_roadmap.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.
 * 0 <= s.length <= 5 * 10^4
 * s состоит из английских букв.
 * 2.
 * Тестовый класс {@link LongestSubstringWithoutRepeatingCharacters3Test}
 * 3.
 * Временная сложность: O(N), где n - количество символов в строке s. Проходимся по строке ровно один раз.
 * Пространственная сложность: O(n), где n - количество уникальный символ в строке s
 */
public class LongestSubstringWithoutRepeatingCharacters3 {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> charToLastIndex = new HashMap<>();
        int totalLength = -1;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // Если символ уже встречался в текущем окне:
                // 1. символ существует в charToLastIndex
                // 2. и его последний индекс находится внутри текущего окна (>= start)
            // сдвигаем начало окна на позицию после предыдущего вхождения этого символа.
            if (charToLastIndex.containsKey(currentChar) && charToLastIndex.get(currentChar) >= start) {
                start = charToLastIndex.get(currentChar) + 1;
            }

            charToLastIndex.put(currentChar, end);
            totalLength = Math.max(totalLength, end - start + 1);
        }

        return totalLength;
    }
}
