package org.parog.algo_roadmap.string;

/**
 * 1.
 * Диапазон длины входящей строки: 1 <= s.length <= 1000
 * Входящая строка состоит только из цифр и английских букв.
 * 2.
 * Тестовый класс {@link LongestPalindromicSubstring5Test}
 */
public class LongestPalindromicSubstring5 {
    /**
     * Временная сложность: O(N^2), где N - длина входящей строки. O(N) требуется на проход по всей строке. Также O(N)
     * требуется для нахождения палиндрома, так как для каждого символа так же проходимся по строке с помощью двух указателей,
     * пока удовлетворяется условие палиндрома. Итого: O(N) * O(N) = O(N^2).
     * Пространственная сложность: O(1), не используем дополнительных структур данных.
     *
     * @param s входящая строка
     * @return наибольшая строка в виде палиндрома
     */
    public static String longestPalindromeV1(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        // очищаем строку: только цифры и английские буквы
        String clear = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String result = "";


        for (int i = 0; i < clear.length(); i++) {
            // если длина строки нечетная
            String oddLength = getPalindrome(clear, i, i);
            // если длина строки четная
            String evenLength = getPalindrome(clear, i, i + 1);

            if (oddLength.length() >= result.length()) {
                result = oddLength;
            }
            if (evenLength.length() > result.length()) {
                result = evenLength;
            }

        }

        return result;
    }

    /**
     * Временная сложность: O(N^3), где N - длина входящей строки. Перебираем каждую подстроку в строке и проверяем на
     * палиндром. Brute force подстрок - O(N^2), проверка на палиндром - O(N). O(N^2) * O(N) = O(N^3).
     * Пространственная сложность: O(1), не используем дополнительных структур данных
     *
     * @param s входящая строка
     * @return наибольшая строка в виде палиндрома
     */
    public static String longestPalindromeV2(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        // очищаем строку: только цифры и английские буквы
        String clear = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int maxLen = 1;
        String result = "";
        // brute force
        for (int i = 0; i < clear.length(); i++) {
            for (int j = i + maxLen; j <= clear.length(); j++) {
                if (j - i > maxLen && isPalindrome(clear.substring(i, j))) {
                    maxLen = j - i;
                    result = clear.substring(i, j);
                }
            }
        }

        return result;
    }

    /**
     * Находим подстроку в виде палиндрома
     *
     * @param clear входящая очищенная строка
     * @param left  индекс левого указателя
     * @param right индекс правого указателя
     * @return палиндром
     */
    private static String getPalindrome(String clear, int left, int right) {
        while (left >= 0 && right < clear.length() && clear.charAt(left) == clear.charAt(right)) {
            left--;
            right++;
        }

        return clear.substring(left + 1, right);
    }

    /**
     * Убеждаемся, что строка является палиндромом.
     *
     * @param str строка
     * @return true - палиндром, иначе false
     */
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
