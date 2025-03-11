package org.parog.algo_roadmap.string;

/**
 * 1.
 * Длина строки s: 0 <= s.length <= 100
 * Длина строки t: 0 <= t.length <= 10^4
 * s и t состоят из букв английского алфавита в нижнем регистре.
 * 2.
 * Тестовый класс {@link IsSubsequence392Test}
 * 3.
 * Временная сложность: O(N), где N - количество символов в строке t (в худшем случае проходим по всей строке t).
 * Пространственная сложность: O(1), так как не используем дополнительных структур данных.
 */
public class IsSubsequence392 {
    public static boolean isSubsequence(String s, String t) {
        // Если s пустая, она всегда является подпоследовательностью
        if (s.isEmpty()) {
            return true;
        }

        int i = 0;
        int j = 0;

        // Если символы совпадают, двигаем указатель i
        while (i < s.length() && j < t.length()) {
            char symbolS = s.charAt(i);
            char symbolT = t.charAt(j);

            if (symbolS == symbolT) {
                i++;
            }
            j++;
        }

        // Если i достиг конца строки s, значит, все символы найдены
        return i == s.length();
    }
}
