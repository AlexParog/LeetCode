package org.parog.algo_roadmap.string;

/**
 * 1.
 * Реализация in-place алгоритма
 * обязательное условие: затраты по памяти O(1)
 * Диапазон длины массива s: 1 <= s.length <= 10^5
 * s[i] - это печатный символ ascii
 * 2.
 * Тестовый класс {@link ReverseString344Test}
 * 3.
 * Сложность по времени: O(N), где N изначальная длина массива
 * Сложность по памяти: O(1)
 */
public class ReverseString344 {
    public static char[] reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[j - i];
            s[j - i] = temp;
        }
        return s;
    }
}
