package org.parog.algo_roadmap.string;

/**
 * 1.
 * Диапазон длины строки: 1 <= s.length <= 2 * 10^5
 * Строка s состоит из строчных английских букв
 * 2.
 * Тестовый класс {@link ValidPalindromeII680Test}
 * 3.
 * Сложность по времени: O(N), где N - длина строки.
 * Сложность по памяти: O(1), так как алгоритм использует только константное количество дополнительной памяти.
 */
public class ValidPalindromeII680 {
    /**
     * Проверяет, можно ли сделать строку палиндромом, удалив не более одного символа.
     * <p>
     * Алгоритм использует два указателя, которые проходят по строке с противоположных концов,
     * сравнивая символы. Если обнаружено несовпадение, алгоритм рекурсивно проверяет,
     * можно ли сделать оставшуюся часть строки палиндромом, удалив символ слева или справа.
     *
     * @param s входная строка
     * @return true, если строку можно сделать палиндромом, удалив не более одного символа, иначе false
     */
    public static boolean validPalindrome(String s) {
        for (int left = 0, right = s.length() - left; left < right; left++, right--) {
            if (s.charAt(left) != s.charAt(right - 1)) {
                return isPalindrome(left + 1, right, s) || isPalindrome(left, right - 1, s);
            }
        }
        return true;
    }

    /**
     * Вспомогательная функция для проверки, является ли подстрока палиндромом.
     * <p>
     * Алгоритм использует два указателя, которые проходят по подстроке с противоположных концов,
     * сравнивая символы.
     *
     * @param left  левый индекс подстроки
     * @param right правый индекс подстроки
     * @param s     входная строка
     * @return true, если подстрока является палиндромом, иначе false
     */
    public static boolean isPalindrome(int left, int right, String s) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right - 1)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
