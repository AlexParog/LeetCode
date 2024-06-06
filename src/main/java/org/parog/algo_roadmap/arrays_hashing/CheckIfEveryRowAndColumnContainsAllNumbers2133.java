package org.parog.algo_roadmap.arrays_hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * 1.
 * Матрица является квадратной: n == matrix.length == matrix[i].length
 * Диапазон матрицы n*n: 1 <= n <= 100
 * Диапазон элемента матрицы: 1 <= matrix[i][j] <= n
 * 2.
 * Тестовый класс {@link CheckIfEveryRowAndColumnContainsAllNumbers2133Test}
 * 3.
 * Временная сложность: O(n^2), так как у нас вложенные циклы, каждый из которых выполняется n раз
 * Пространственная сложность: O(n), для хранения двух множеств HashSet на каждую строку и столбец,
 * что суммарно дает O(n).
 */
public class CheckIfEveryRowAndColumnContainsAllNumbers2133 {
    public static boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for (int row = 0; row < n; row++) {
            Set<Integer> uniqRowNums = new HashSet<>();
            Set<Integer> uniqColNums = new HashSet<>();
            for (int column = 0; column < n; column++) {
                if (!uniqRowNums.add(matrix[row][column]) || !uniqColNums.add(matrix[column][row])) {
                    return false;
                }
            }
        }
        return true;
    }
}
