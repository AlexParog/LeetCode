package org.parog.algo_roadmap.two_pointers;

/**
 * 1.
 * Длина слова: 1 <= word.length <= 250
 * word состоит из маленьких английских букв
 * ch маленькая английская буква
 * 2.
 * Тестовый класс {@link ReversePrefixOfWord2000Test}
 */
public class ReversePrefixOfWord2000 {

    /**
     * Временная сложность: O(n) - поиск символа с помощью indexOf занимает O(n), reverse подстроки равен O(n) в худшем
     * случае, когда подстрока равна word
     * Пространственная сложность: так как храним в StringBuilder, равный количеству символов в подстроке, то O(n)
     *
     * @param word входное слово
     * @param ch   символ
     * @return переверните сегмент слова, начинающийся с индекса 0 и
     * заканчивающийся индексом первого вхождения символа ch (включительно)
     */
    public static String reversePrefixWithIndexOf(String word, char ch) {
        if (word.indexOf(ch) == -1) {
            return word;
        }

        int firstIndex = word.indexOf(ch) + 1;
        StringBuilder segment = new StringBuilder(word.substring(0, firstIndex));
        return segment.reverse() + word.substring(firstIndex);
    }


    /**
     * Первая подзадача - найти индекса первого вхождения символа ch
     * Вторая подзадача - in place reverse подстроки
     * <p>
     * Временная сложность: O(n), где n количество символов в слове
     * Пространственная сложность: так как храним массив chars, равный количеству символов в слове, то O(n)
     *
     * @param word входное слово
     * @param ch   символ
     * @return переверните сегмент слова, начинающийся с индекса 0 и
     * заканчивающийся индексом первого вхождения символа ch (включительно)
     */
    public static String reversePrefixInPlace(String word, char ch) {
        char[] chars = word.toCharArray();

        // Находим индекса первого символа равного ch
        int right = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                right = i;
                break;
            }
        }

        // проходимся с начала до индекса символа равного ch
        // одновременно делаем reverse подстроки
        int left = 0;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }

        return String.valueOf(chars);
    }
}
