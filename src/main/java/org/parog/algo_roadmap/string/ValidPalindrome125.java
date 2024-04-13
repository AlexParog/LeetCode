package org.parog.algo_roadmap.string;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 1.
 * Диапазон длины строки: 1 <= s.length <= 2 * 10^5
 * 2.
 * Тестовый класс {@link ValidPalindrome125Test}
 * 3.
 * Сложность по времени: O(N), где N - длина строки. Это связано с тем, что нам нужно пройтись по всей строке
 * один раз для очистки и еще раз по половине строки для сравнения символов.
 * Сложность по памяти: O(N) в худшем случае, когда очищенная строка имеет ту же длину, что и исходная.
 */
public class ValidPalindrome125 {
    /**
     * Проверяет, является ли строка палиндромом, используя регулярные выражения для очистки строки.
     * <p>
     * Алгоритм:
     * 1. Очищает строку, удаляя все символы, кроме букв и цифр, и приводит ее к нижнему регистру.
     * 2. Итерирует по половине очищенной строки, сравнивая символы с противоположных концов.
     * 3. Возвращает true, если все пары символов совпадают, иначе false.
     *
     * @param s входная строка
     * @return true, если строка является палиндромом, иначе false
     */
    public static boolean isPalindromeWithRegex(String s) {
        // оставляем только строчные буквы и цифры
        String cleanedString = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        for (int i = 0; i < cleanedString.length() / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(cleanedString.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Проверяет, является ли строка палиндромом, используя функциональный стиль и Java Streams.
     * <p>
     * Алгоритм:
     * 1. Очищает строку, удаляя все символы, кроме букв и цифр, и приводит ее к нижнему регистру.
     * 2. Создает поток индексов до половины очищенной строки.
     * 3. Сравнивает символы с противоположных концов строки для каждого индекса в потоке.
     * 4. Возвращает true, если все пары символов совпадают, иначе false.
     *
     * @param s входная строка
     * @return true, если строка является палиндромом, иначе false
     */
    public static boolean isPalindromeWithFuncStyle(String s) {
        String cleanedString = s.chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(c -> String.valueOf(c).toLowerCase())
                .collect(Collectors.joining());

        return IntStream.range(0, cleanedString.length() / 2)
                .allMatch(i -> cleanedString.charAt(i) == cleanedString.charAt(cleanedString.length() - i - 1));
    }
}
