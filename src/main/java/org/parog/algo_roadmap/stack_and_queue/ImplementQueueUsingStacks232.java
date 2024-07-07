package org.parog.algo_roadmap.stack_and_queue;

import java.util.Stack;

/**
 * Реализация Очереди через Стек
 * Диапазон значения, хранящегося в стеке: 1 <= x <= 9
 * Будет сделано не более 100 вызовов push, pop, top и empty.
 * Все вызовы pop и top являются допустимыми.
 */
public class ImplementQueueUsingStacks232 {
    // порядок LIFO
    Stack<Integer> stackOne;
    // инвертированный порядок - FIFO
    Stack<Integer> stackSecond;

    public ImplementQueueUsingStacks232() {
        this.stackOne = new Stack<>();
        this.stackSecond = new Stack<>();
    }

    /**
     * O(1), добавляем новый элемент в конец очереди
     *
     * @param x новый элемент
     */
    public void push(int x) {
        stackOne.push(x);
    }

    /**
     * O(n), инвертируем очередь, удаляем и возвращаем первый элемент в очереди
     *
     * @return первый элемент в очереди
     */
    public int pop() {
        check();
        return stackSecond.pop();
    }

    /**
     * O(n), инвертируем очередь, возвращаем первый элемент в очереди
     *
     * @return первый элемент в очереди
     */
    public int peek() {
        check();
        return stackSecond.peek();
    }

    /**
     * * Проверяем, пуста ли очередь.
     *
     * @return {@code true} - пуста, {@code false} - существует хотя бы один элемент
     */
    public boolean empty() {
        return stackOne.isEmpty() && stackSecond.isEmpty();
    }

    /**
     * Инвертируем порядок стека, так как необходимо соблюсти правило FIFO
     */
    private void check() {
        if (stackSecond.isEmpty()) {
            while (!stackOne.isEmpty()) {
                stackSecond.push(stackOne.pop());
            }
        }
    }

    public static void main(String[] args) {
        ImplementQueueUsingStacks232 myQueue = new ImplementQueueUsingStacks232();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek()); // return 1
        System.out.println(myQueue.pop()); // return 1, queue is [2]
        myQueue.empty(); // return false
    }
}
