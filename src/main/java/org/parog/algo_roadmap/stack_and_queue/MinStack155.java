package org.parog.algo_roadmap.stack_and_queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Реализация стека с поддержкой получения минимального элемента за O(1).
 * <p>
 * 1. Ограничения:
 * - Диапазон значений: -2^31 <= val <= 2^31 - 1.
 * - Количество вызовов методов: не более 3 * 10^4.
 * - Все операции (push, pop, top, getMin) должны выполняться за O(1).
 * <p>
 * 2. Реализация:
 * - Используются два стека: один для хранения элементов, другой для хранения минимумов.
 * - При добавлении элемента, если он меньше или равен текущему минимуму, он добавляется в стек минимумов.
 * - При удалении элемента, если он равен текущему минимуму, он удаляется и из стека минимумов.
 * <p>
 * 3. Альтернативное решение:
 * - Можно использовать один стек и числовую переменную для хранения минимума.
 * - При добавлении элемента, который меньше текущего минимума, сохраняется модифицированное значение (2 * value - minValue).
 * - При удалении элемента, если он меньше текущего минимума, восстанавливается предыдущий минимум previousMinValue = 2 * minValue - modifiedValue.
 * - Этот подход экономит память, но сложнее для понимания и отладки.
 * <p>
 * 4. Пример использования:
 * MinStack155 stack = new MinStack155();
 * stack.push(3);
 * stack.push(5);
 * stack.push(2);
 * stack.push(1);
 * stack.getMin(); // 1
 * stack.pop();
 * stack.getMin(); // 2
 * <p>
 * 5. Пространственная сложность: O(N), где N — количество элементов в стеке.
 */
public class MinStack155 {

    /**
     * Стека для хранения входных элементов.
     */
    private Deque<Integer> stack;
    /**
     * Стек для хранения минимумов. Каждый элемент соответствует текущему минимуму на момент его добавления.
     */
    private Deque<Integer> minStack;

    /**
     * Конструктор. Инициализирует стеки.
     * Пространственная сложность: O(1) (инициализация пустых стеков).
     */
    public MinStack155() {
        this.stack = new ArrayDeque<>();
        this.minStack = new ArrayDeque<>();
    }

    /**
     * Добавляет элемент в стек.
     * Временная сложность: O(1).
     *
     * @param val значение для добавления.
     */
    public void push(int val) {
        // Если стек минимумов пуст или новый элемент меньше или равен текущему минимуму
        if (minStack.isEmpty() || val <= minStack.getFirst()) {
            minStack.addFirst(val);
        }

        stack.addFirst(val);
    }

    /**
     * Удаляет элемент с вершины стека.
     * Временная сложность: O(1).
     *
     * @throws IllegalStateException если стек пуст.
     */
    public void pop() {
        if (minStack.isEmpty()) {
            return;
        }

        int popped = stack.removeFirst();
        // Если удаляемый элемент равен текущему минимуму, удаляем его и из стека минимумов
        if (popped == minStack.getFirst()) {
            minStack.removeFirst();
        }
    }

    /**
     * Возвращает элемент с вершины стека.
     * Временная сложность: O(1).
     *
     * @return элемент с вершины стека.
     * @throws IllegalStateException если стек пуст.
     */
    public int top() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.peekFirst();
    }

    /**
     * Возвращает минимальный элемент в стеке.
     * Временная сложность: O(1).
     *
     * @return минимальный элемент в стеке.
     * @throws IllegalStateException если стек пуст.
     */
    public int getMin() {
        if (minStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return minStack.peekFirst();
    }
}
