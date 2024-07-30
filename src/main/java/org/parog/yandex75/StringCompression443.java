package org.parog.yandex75;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.
 * Длина массива с символами: 1 <= chars.length <= 2000
 * chars[i] - это строчная английская буква, заглавная английская буква, цифра или символ
 * 2.
 * Тестовый класс {@link StringCompression443Test}
 * 3.
 * Временная сложность: O(N), где N - количество символов в массиве chars
 * Пространственная сложность: O(N), где N - количество символов в builder (наихудший случай: все символы встречаются ровно один раз)
 */
public class StringCompression443 {

    /**
     * Реализация через два указателя.
     * Временная сложность: O(N), где N - длина входного массива
     * Пространственная сложность: O(1) - алгоритм in-place
     *
     * @param chars входной массив символов
     * @return новую длину массива
     */
    public static int compressTwoPointers(char[] chars) {
        int reader = 0;
        int writer = 0;

        while (reader < chars.length) {
            // первый символ группы
            char currentChar = chars[reader];
            int count = 0;

            // подсчитываем количество одинаковых символов в группе
            while (reader < chars.length && chars[reader] == currentChar) {
                count++;
                reader++;
            }

            // записываем в массив chars, чтобы привести к формату: уникальный символ + их количество
            chars[writer++] = currentChar;

            // если в группе больше одного символа, записываем длину группы
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[writer++] = c;
                }
            }
        }

        return writer;
    }

    /**
     * Реализация алгоритма, как на тренировках Яндекса.
     * Временная сложность: O(N), где N - количество символов в массиве chars
     * Пространственная сложность: O(N), где N - количество символов в builder (наихудший случай: все символы встречаются
     * ровно один раз)
     *
     * @param chars входной массив символов
     * @return новую длину массива
     */
    public static int compressRLE(char[] chars) {
        List<String> groups = new ArrayList<>();
        int start = 0;
        char lastChar = chars[0];

        for (int end = 1; end < chars.length; end++) {
            if (lastChar != chars[end]) {
                groups.add(group(lastChar, start, end));
                start = end;
                lastChar = chars[end];
            }
        }

        // обрабатываем конец строки, когда цикл завершился
        // chars[start] - остается на первой встрече последнего символа, start - его индекс,
        // chars.length - его последний индекс (до конца массива)
        groups.add(group(chars[start], start, chars.length));
        return groups.size();
    }

    /**
     * Функция подсчета количества одинаковых символов в группе.
     *
     * @param lastChar самый первый символ группы
     * @param start    индекс самого первого символа группы
     * @param end      индекса последнего символа группы
     * @return символ + количество встреч
     */
    private static String group(char lastChar, int start, int end) {
        int diff = end - start;

        if (diff > 1) {
            return lastChar + Integer.toString(diff);
        }
        return Character.toString(lastChar);
    }
}
