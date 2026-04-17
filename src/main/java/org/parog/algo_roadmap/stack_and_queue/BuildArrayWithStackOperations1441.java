package org.parog.algo_roadmap.stack_and_queue;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.
 * Длина массива target: 1 <= target.length <= 100
 * Диапазон параметра n: 1 <= n <= 100
 * Диапазон значений в массиве target: 1 <= target[i] <= n
 * Элементы target увеличиваются.
 * 2.
 * Тестовый класс {@link BuildArrayWithStackOperations1441Test}
 * 3.
 * Временная сложность: O(N), где N - входное значение n
 * Пространственная сложность: O(M), где M — размер target. В худшем случае result содержит 2 * M операций
 * (каждый элемент потока — Push+Pop, плюс Push для target) — но это всё равно O(M).
 */
public class BuildArrayWithStackOperations1441 {
    public static List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < n; i++) {
            int el = i + 1;

            if (el == target[count]) {
                result.add("Push");
                count++;
            } else {
                result.add("Push");
                result.add("Pop");
            }

            if (count == target.length) {
                break;
            }
        }

        return result;
    }
}
