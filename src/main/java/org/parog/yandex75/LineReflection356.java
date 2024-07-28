package org.parog.yandex75;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href="https://github.com/doocs/leetcode/blob/main/solution/0300-0399/0356.Line%20Reflection/README_EN.md">Premium LeetCode</a>
 * <p>
 * 1.
 * Количество точек: n == points.length
 * 1 <= n <= 10^4
 * Каждая точка представлена парой координат  [x, y]  и ограничена диапазоном -10^8 <= points[i][j] <= 10^8
 * 2.
 * Тестовый класс {@link LineReflection356Test}
 * 3.
 * Временная сложность:  O(n)  - каждый элемент массива обрабатывается константное количество раз.
 * Пространственная сложность:  O(n)  - требуется хранить все точки в множестве.
 */
public class LineReflection356 {
    /**
     * Основная идея заключается в том, чтобы найти минимальное и максимальное значения x среди всех точек и вычислить
     * потенциальную ось отражения, которая будет находиться на линии (minX + maxX) / 2.
     *
     * @param points массив точек
     * @return существует ли для каждой точки ее отражение относительно этой оси
     */
    public static boolean isReflected(int[][] points) {
        final int inf = 1 << 30;  // Большое значение для начальной инициализации minX и maxX
        int minX = inf, maxX = -inf;
        Set<List<Integer>> pointSet = new HashSet<>();  // Множество для хранения точек

        // Найти minX и maxX, и добавить все точки в множество
        for (int[] p : points) {
            minX = Math.min(minX, p[0]);
            maxX = Math.max(maxX, p[0]);
            pointSet.add(List.of(p[0], p[1]));
        }

        // Вычислить сумму минимального и максимального значений x
        int s = minX + maxX;

        // Проверить, существует ли отраженная точка для каждой точки
        for (int[] p : points) {
            // Для любой точки [x, y], ее отражение относительно оси симметрии x = s / 2 будет точка [s - x, y]
            if (!pointSet.contains(List.of(s - p[0], p[1]))) {
                return false;
            }
        }

        return true;
    }
}
