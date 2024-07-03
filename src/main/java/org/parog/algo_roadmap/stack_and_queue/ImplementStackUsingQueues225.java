package org.parog.algo_roadmap.stack_and_queue;

/**
 * 1.
 * Реализовать с помощью одной Очереди
 * Диапазон значения, хранящегося в стеке: 1 <= x <= 9
 * Будет сделано не более 100 вызовов push, pop, top и empty.
 * Все вызовы pop и top являются допустимыми.
 */
public class ImplementStackUsingQueues225 {


    public ImplementStackUsingQueues225() {

    }

    // Перемещает элемент x на вершину стека
    public void push(int x) {

    }

    // Удаляет элемент, находящийся на вершине стека, и возвращает его.
    public int pop() {

    }

    //Возвращает элемент, находящийся на вершине стека.
    public int top() {

    }

    // Возвращает true, если стек пуст, false - в противном случае.
    public boolean empty() {

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


