package org.parog.algo_roadmap.stack_and_queue;

import java.util.Map;
import java.util.Stack;
import java.util.function.BiFunction;

/**
 * 1.
 * Размер входящего массива tokens: 1 <= tokens.length <= 10^4
 * Элемент tokens[i] состоит из следующих операторов: "+", "-", "*", or "/", или из целого числа в диапазоне [-200, 200].
 * 2.
 * Тестовый класс {@link EvaluateReversePolishNotation150Test}
 * 3.
 * Временная сложность: O(N), где N - количество элементов в массиве tokens.
 * Пространственная сложность: O(N), где N - количество элементов в стеке в самом пике (худший случай - (1 1 1 1 + + +))
 */
public class EvaluateReversePolishNotation150 {
    public static int evalRPN(String[] tokens) {
        Map<String, BiFunction<Integer, Integer, Integer>> ops = Map.of(
                "+", Integer::sum,
                "-", (a, b) -> a - b,
                "*", (a, b) -> a * b,
                "/", (a, b) -> a / b
        );

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+", "-", "*", "/" -> {
                    int el2 = stack.pop();
                    int el1 = stack.pop();
                    stack.push(ops.get(token).apply(el1, el2));
                }
                default -> {
                    int num = Integer.parseInt(token);
                    stack.push(num);
                }
            }
        }

        return stack.peek();
    }

    /**
     * V2 чуть быстрее на практике из-за отсутствия Map и лямбд, но это незначительно. V1 предпочтительнее если важна
     * поддерживаемость — легко добавить новую операцию (%, ^ и т.д.) одной строкой в Map.
     * <p>
     * Временная сложность: такая же, что у V1
     * Пространственная сложность: такая же, что у V1
     *
     * @param tokens входящий массив
     * @return результат выражения
     */
    public static int evalRPN_V2(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" -> {
                    int el2 = stack.pop();
                    stack.push(stack.pop() - el2);
                }
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" -> {
                    int el2 = stack.pop();
                    stack.push(stack.pop() / el2);
                }
                default -> stack.push(Integer.parseInt(token));
            }
        }

        return stack.peek();
    }
}
