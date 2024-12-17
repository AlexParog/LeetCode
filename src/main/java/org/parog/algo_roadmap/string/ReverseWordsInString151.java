package org.parog.algo_roadmap.string;

/**
 * 1.
 * Диапазон длины строки: 1 <= s.length <= 10^4
 * s содержит английские буквы (прописные и строчные), цифры и пробелы.
 * В s есть как минимум одно слово.
 * 2.
 * Тестовый класс {@link ReverseWordsInString151Test}
 */
public class ReverseWordsInString151 {
    /**
     * Временная сложность: O(N), где N количество слов во входной строке. Более компактный вариант с регуляркой.
     * Пространственная сложность: O(N), где N количество слов во входной строке. Дополнительно создаем массив, чтобы
     * хранить результирующую строку.
     *
     * @param s входящая строка
     * @return инвертированнные слова в строке
     */
    public static String reverseWordsV2(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        // находит одно или несколько подряд идущих пробельных символов (удаляет)
        String[] words = s.split("\\s+");

        String[] result = new String[words.length];
        int index = 0;
        for (int i = words.length - 1; i >= 0; i--) {
            result[index++] = words[i];
        }

        return String.join(" ", result).trim();
    }

    /**
     * Временная сложность: O(N), где N количество слов во входной строке.
     * Пространственная сложность: O(N), где N количество слов во входной строке. Дополнительно создаем StringBuilder,
     * чтобы хранить результирующую строку.
     *
     * @param s входящая строка
     * @return инвертированнные слова в строке
     */
    public static String reverseWordsV1(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        String[] words = s.trim().split(" ");

        StringBuilder resultS = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!"".equals(words[i])) {
                if (i == 0) {
                    resultS.append(words[i]);
                } else {
                    resultS.append(words[i]).append(" ");
                }
            }
        }

        return resultS.toString();
    }
}
