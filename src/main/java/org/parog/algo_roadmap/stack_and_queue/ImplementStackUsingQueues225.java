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

    // Перемещает элемент x на вершину стека
    public void push(int x) {
        // queue FIFO: first in - first out
        // а мы используем LIFO: last in - first out, поэтому у нас инвертированный порядок
        // 1. Добавляем новый элемент в очередь.
        queue.add(x);
        // 2. Затем перемещаем все элементы, которые были до него, в конец очереди

    }

    // Удаляет элемент, находящийся на вершине стека, и возвращает его.
    public int pop() {
        return queue.remove();
    }

    //Возвращает элемент, находящийся на вершине стека.
    public int top() {
        return queue.element();
    }

    // Возвращает true, если стек пуст, false - в противном случае.
    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueues225 myStack = new ImplementStackUsingQueues225();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top()); // return 2
        System.out.println(myStack.pop()); // return 2
        System.out.println(myStack.empty());
    }
}


