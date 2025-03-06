package org.parog.algo_roadmap.two_pointers;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1.
 * Диапазон значений длин входящих строк: 1 <= s.length, t.length <= 200.
 * s и t содержат только строчные буквы и символы "#".
 * 2.
 * Тестовый класс {@link BackspaceStringCompare844Test}
 */
public class BackspaceStringCompare844 {

    /**
     * Временная сложность: O(N + M + K). Поскольку K ≤ N и K ≤ M, доминирующими являются O(N + M). Сначала проходимся
     * по каждой строке соответственно N, M, а далее сравниваем их (еще один проход), где K - размер стеков.
     * Пространственная сложность: O(N+M), N и M - длины входящих строк, где в наихудшей ситуации строки содержат
     * одинаковые символы и без тегов #.
     *
     * @param s входящая строка s
     * @param t входящая строка t
     * @return true, если s.equals(t) при условии тегов #
     */
    public static boolean backspaceCompare(String s, String t) {
        Deque<Character> stackS = new ArrayDeque<>();
        Deque<Character> stackT = new ArrayDeque<>();

        // Обработка строки s
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!stackS.isEmpty()) {
                    stackS.removeFirst();
                }
            } else {
                stackS.addFirst(ch);
            }
        }

        // Обработка строки t
        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (!stackT.isEmpty()) {
                    stackT.removeFirst();
                }
            } else {
                stackT.addFirst(ch);
            }
        }

        // Сравнение содержимого стеков
        if (stackS.size() != stackT.size()) {
            return false;
        }
        while (!stackS.isEmpty()) {
            if (!stackS.removeFirst().equals(stackT.removeFirst())) {
                return false;
            }
        }
        return true;
    }
}
