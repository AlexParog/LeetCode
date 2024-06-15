package org.parog.algo_roadmap.two_pointers;

/**
 * 1.
 * 2.
 * Тестовый класс {@link ReversePrefixOfWord2000Test}
 */
public class ReversePrefixOfWord2000 {
    public static String reversePrefixWithIndexOf(String word, char ch) {
        if (word.indexOf(ch) == -1) {
            return word;
        }

        int firstIndex = word.indexOf(ch) + 1;
        StringBuilder segment = new StringBuilder(word.substring(0, firstIndex));
        return segment.reverse() + word.substring(firstIndex);
    }

    public static String reversePrefixInPlace(String word, char ch) {
        char[] chars = word.toCharArray();

        int right = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                right = i;
                break;
            }
        }

        int left = 0;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }

        return String.valueOf(chars);
    }
}
