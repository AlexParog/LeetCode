package org.parog.algo_roadmap.stack_and_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;
import java.util.Stack;

/**
 * 1.
 * Диапазон длины входящей строки: 1 <= path.length <= 3000
 * Путь состоит из английских букв, цифр, символов '.', '/' или '_'.
 * Path - это допустимый абсолютный путь Unix
 * <p>
 * Основные правила:
 * Путь должен начинаться с одной косой черты "/".
 * Каталоги в пути должны быть разделены ровно одной косой чертой "/".
 * Путь не должен заканчиваться косой чертой "/", если только это не корневой каталог.
 * Путь не должен содержать одинарных или двойных точек ('.' и '..'), используемых для обозначения текущего или родительского каталогов.
 * <p>
 * 2.
 * Тестовый класс {@link SimplifyPath71Test}
 */
public class SimplifyPath71 {
    /**
     * Временная сложность: O(N), где N - длина входящего пути. Операции стека добавления и удаления за O(1).
     * Пространственная сложность: O(M), где M - количество валидных компонентов пути.
     *
     * @param path путь
     * @return канонический стиль абсолютного пути Unix
     */
    public static String optimizedSimplifyPath(String path) {
        String[] words = path.split("/");
        Deque<String> stack = new ArrayDeque<>();

        for (String word : words) {
            // удаляем родительскую директорию, которая лежит последней в стеке
            if (!stack.isEmpty() && "..".equals(word)) {
                stack.pollLast();
            } else if (!word.isEmpty() && !".".equals(word)) { // добавляем директория, если это не "" и не "."
                stack.addLast(word);
            }
        }

        StringBuilder builder = new StringBuilder();
        for (String dir : stack) {
            builder.append("/").append(dir);
        }

        return builder.isEmpty() ? "/" : builder.toString();
    }

    /**
     * Вместо использования Set для фильтрации, можно обрабатывать случаи ".", ".." и пустые строки напрямую в условии.
     * Это уменьшит использование памяти. Класс Stack устарел. Лучше использовать Deque (например, ArrayDeque),
     * так как он более современный и эффективный.
     * <p>
     * Временная сложность: O(N), где N - длина входящего пути. Операции стека добавления и удаления за O(1).
     * Пространственная сложность: O(N), где N - количество символов в пути. В худшем случае, если путь состоит только
     * из валидных директорий.
     *
     * @param path путь
     * @return канонический стиль абсолютного пути Unix
     */
    public String simplifyPath(String path) {
        String[] words = path.split("/");
        Set<String> redFlag = Set.of("", ".", "/", "..");
        Stack<String> stack = new Stack<>();

        for (String word : words) {
            if (!stack.isEmpty() && "..".equals(word)) {
                stack.pop();
            }

            if (!redFlag.contains(word)) {
                stack.add(word);
            }
        }

        String result = String.join("/", stack);
        return "/" + result;
    }
}
