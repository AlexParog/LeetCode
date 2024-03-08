package org.parog;

import java.util.LinkedList;

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
