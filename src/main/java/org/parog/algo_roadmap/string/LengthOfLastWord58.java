package org.parog.algo_roadmap.string;

/**
 * 1.
 * 1 <= s.length <= 104
 * s состоит только из английских букв и пробелов ' '.
 * в s должно быть хотя бы одно слово.
 * 2.
 * Тестовый класс {@link LengthOfLastWord58Test}
 * 3.
 * Время O(n) - длина строки (n)
 * Память O(1) - используем только счетчик
 */
public class LengthOfLastWord58 {
    public static int lengthOfLastWord(String s) {
        if (s.isEmpty()) return -1;

        int lengthOfLastWord = 0;
        // идем с конца строки до начала первого слова
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                lengthOfLastWord++;
            } else {
                if (lengthOfLastWord > 0) {
                    return lengthOfLastWord;
                }
            }
        }
        return lengthOfLastWord;
    }
}
