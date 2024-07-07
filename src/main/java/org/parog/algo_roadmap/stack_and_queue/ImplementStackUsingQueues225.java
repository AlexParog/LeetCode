package org.parog.algo_roadmap.stack_and_queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1.
 * Реализовать с помощью одной Очереди
 * Диапазон значения, хранящегося в стеке: 1 <= x <= 9
 * Будет сделано не более 100 вызовов push, pop, top и empty.
 * Все вызовы pop и top являются допустимыми.
 */
public class ImplementStackUsingQueues225 {

    private Queue<Integer> queue;

    public ImplementStackUsingQueues225() {
        this.queue = new LinkedList<>();
    }

    /**
     * O(n), где n — количество элементов в очереди. Мы перемещаем элементы, чтобы новый элемент оказался в начале.
     *
     * @param x число
     */
    public void push(int x) {
        // queue FIFO: first in - first out
        // а мы используем LIFO: last in - first out, поэтому у нас инвертированный порядок
        // 1. Добавляем новый элемент в очередь.
        queue.add(x);
        // 2. Затем перемещаем все элементы, которые были до него, в конец очереди
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.remove());
        }
    }

    /**
     * O(1), так как просто удаляем первый элемент очереди.
     *
     * @return последний добавленный элемент LIFO
     */
    public int pop() {
        return queue.remove();
    }

    /**
     * O(1), так как просто возвращаем первый элемент очереди.
     *
     * @return возвращаем первый элемент из очереди без его удаления.
     */
    public int top() {
        return queue.element();
    }

    /**
     * Проверяем, пуст ли стек.
     *
     * @return {@code true} - пуста, {@code false} - существует хотя бы один элемент
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}


