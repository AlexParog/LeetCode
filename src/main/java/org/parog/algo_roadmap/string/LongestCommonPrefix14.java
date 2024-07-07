package org.parog.algo_roadmap.string;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1.
 * Диапазон массива: 1 <= strs.length <= 200
 * Диапазон длины слова в массиве: 0 <= strs[i].length <= 200
 * strs[i] состоит только из строчных английских букв
 * 2.
 * Тестовый класс {@link LongestCommonPrefix14Test}
 */
public class LongestCommonPrefix14 {
    /**
     * Находим наименьшее слово. Итерируемся по массиву слов, сокращая слово с конца при каждой итерации,
     * если не находится общий префикс. Иначе возвращаем наибольший общий префикс
     * <p>
     * Временная сложность: O(N * M), где N - размер массива, а M - количество букв в наименьшем слове
     * Пространственная сложность: O(1), используем фиксированный размер памяти равный наименьшему слову
     *
     * @param strs массив строк
     * @return наименьший общий префикс
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        // найти самое маленькое слово в массиве
        String prefix = Arrays.stream(strs).min(Comparator.comparing(String::length)).get();

        while (!prefix.isEmpty()) {
            boolean forAllWords = true;
            for (String word : strs) {
                // идем до первого не совпадения и прерываем цикл, чтобы не проходить по каждому слову
                if (!word.startsWith(prefix)) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    forAllWords = false;
                    break;
                }
            }

            if (forAllWords) {
                return prefix;
            }
        }
        return "";
    }
}
