package org.parog.algo_roadmap.stack_and_queue;

/**
 * Реализация Очереди через Стек
 * Диапазон значения, хранящегося в стеке: 1 <= x <= 9
 * Будет сделано не более 100 вызовов push, pop, top и empty.
 * Все вызовы pop и top являются допустимыми.
 */
public class ImplementQueueUsingStacks232 {
    public ImplementQueueUsingStacks232() {

    }

    public void push(int x) {

    }

    public int pop() {

    }

    public int peek() {

    }

    public boolean empty() {

    }

    public static void main(String[] args) {
        ImplementQueueUsingStacks232 myQueue = new ImplementQueueUsingStacks232();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        myQueue.peek(); // return 1
        myQueue.pop(); // return 1, queue is [2]
        myQueue.empty(); // return false
    }
}
