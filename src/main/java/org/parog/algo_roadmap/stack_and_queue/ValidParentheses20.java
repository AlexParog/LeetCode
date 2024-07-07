package org.parog.algo_roadmap.stack_and_queue;

import java.util.Map;
import java.util.Stack;

/**
 * 1.
 * Диапазон длины строки: 1 <= s.length <= 10^4
 * s состоит только из круглых скобок '()[]{}'
 * 2.
 * Тестовый класс {@link ValidParentheses20Test}
 * 3.
 * Временная сложность: O(N), так как проходимся по каждому символу строки
 * Пространственная сложность: O(N), так как используем дополнительную памяти в виде стека и в худшем случае размер стека
 * может соответствовать размеру входных данных
 */
public class ValidParentheses20 {
    public static boolean isValid(String s) {
        // скобки не сбалансированы
        if (s.length() % 2 == 1) return false;

        Stack<Character> stack = new Stack<>();
        final Map<Character, Character> closeToOpen = Map.of(')', '(', ']', '[', '}', '{');

        for (char ch : s.toCharArray()) {
            // если это закрывающаяся скобка
            if (closeToOpen.containsKey(ch)) {
                // исключаем вариант, когда строка начинается на закрывающуюся скобку
                // сравниваем по типу скобки
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(ch)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                // иначе добавляем в стек открывающуюся скобку
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }
}
