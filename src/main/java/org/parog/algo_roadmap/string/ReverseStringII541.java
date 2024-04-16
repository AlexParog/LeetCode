package org.parog.algo_roadmap.string;

/**
 * 1.
 * 1 <= s.length <= 10^4
 * s состоит только из строчных английских букв.
 * 1 <= k <= 10^4
 * 2.
 * Тестовый класс {@link ReverseStringII541Test}
 * 3.
 * Сложность по времени: O(n), так как количество операций линейно зависит от длины строки n. Даже при учете вложенной
 * функции reverseK, количество операций пропорционально n.
 * Сложность по памяти: O(n) из-за создания массива символов, размер которого линейно зависит от длины входной строки.
 */
public class ReverseStringII541 {
    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int lengthArr = chars.length;
        // идем по строке с шагом 2k
        for (int i = 0; i <= lengthArr - 1; i += 2 * k) {
            // если символов достаточно, то переворачиваем подстроку
            if (i + k - 1 <= lengthArr - 1) {
                reverseK(i, i + k - 1, chars);
            } else {
                //иначе всю строку
                reverseK(i, lengthArr - 1, chars);
            }
        }

        return new String(chars);
    }

    /**
     * In-place переворачиваем подстроку с помощью двух указателей.
     *
     * @param i   левый крайний указатель
     * @param j   правый крайний указатель
     * @param str подстрока
     */
    public static void reverseK(int i, int j, char[] str) {
        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}
