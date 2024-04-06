package org.parog.leetcode_programming_skills50;

import java.util.LinkedList;

/**
 * 1.
 * Сколько гарантированных операций содержится в массиве? как минимум одна
 * Каждый элемент этого массива может быть только: 1)С 2)D 3)+ 4)numbers
 * Гарантируется, что если текущий элемент +, то за ним есть две цифры?
 * Гарантируется, что есл текущий элемент С или D, то за ним есть хоть одна цифра?
 * <p>
 * 2.
 * 1) []
 * 2) ["1", "С]
 * 3) ["5", "2", "С", "D", "+"]
 * 4) ["5", "-2", "4", "C", "D", "9", "+", "+"]
 * <p>
 * 3.
 * Используем связный список. Перед этим обработаем два случая:
 * 1) если список операций пустой -> 0;
 * 2) если список состоит из любой цифры и знака C -> 0.
 * Далее используем switch expression, обрабатываем каждый эл. массива.
 * - С -> удаляем последний эл. из связного списка и вычитаем из result;
 * - D -> достаем последний эл. и умножаем на 2, суммируем result, кладем в связный список;
 * - + -> суммируем последний и предпоследний эл., кладем в связный список
 * - default -> парсим из массива строку в int, кладем в связный список и суммируем в result
 * <p>
 * 4.
 * Время O(n) - перебор всех операций из массива
 * Память O(n) - кол-во пришедших операций из массива. Добавление, удаление, получение в связном списке O(1)
 */
public class BaseballGame682 {
    public int calPoints(String[] operations) {
        if (operations.length == 0) {
            return 0;
        }
        if (operations.length == 2 && "C".equals(operations[1])) {
            return 0;
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        int result = 0;

        return performOperations(linkedList, operations, result);
    }

    private int performOperations(LinkedList<Integer> linkedList, String[] operations, int result) {
        for (String op : operations) {
            switch (op) {
                case "C" -> result -= linkedList.removeLast();
                case "D" -> {
                    int doubled = linkedList.getLast() * 2;
                    linkedList.add(doubled);
                    result += doubled;
                }
                case "+" -> {
                    int sumOfCurrentAndPrevious = linkedList.getLast() + linkedList.get(linkedList.size() - 2);
                    linkedList.add(sumOfCurrentAndPrevious);
                    result += sumOfCurrentAndPrevious;
                }
                default -> {
                    int toInt = Integer.parseInt(op);
                    linkedList.add(toInt);
                    result += toInt;
                }
            }
        }
        return result;
    }
}
