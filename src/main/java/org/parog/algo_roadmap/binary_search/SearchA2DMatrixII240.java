package org.parog.algo_roadmap.binary_search;

/**
 * 1.
 * Количество столбцов (matrix.length) - m, длина строки (matrix[i].length) - n: 1 <= m, n <= 300
 * Диапазон для matrix[i][j], target:-10^9 <= matrix[i][j], target <= 10^9
 * Все целые числа в каждой строке отсортированы по возрастанию.
 * Все целые числа в каждом столбце отсортированы по возрастанию
 * 2.
 * Тестовый класс {@link SearchA2DMatrixII240Test}
 */
public class SearchA2DMatrixII240 {
    /**
     * Поиск заданного элемента `target` в отсортированной по строкам и столбцам матрице `matrix`.
     * <p>
     * Временная сложность: O(m + n), где m - количество строк, n - количество столбцов. В худшем случае алгоритм проходит
     * по всем строкам и столбцам.
     * <p>
     * Сложность по памяти: O(1), так как используются только переменные для индексов строк и столбцов.
     *
     * @param matrix Отсортированная по строкам и столбцам матрица целых чисел.
     * @param target Целевой элемент для поиска.
     * @return true, если элемент найден в матрице, иначе false.
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int row = 0;
        int col = matrix[0].length - 1;  // Начинаем с правого верхнего угла

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;  // Нашли элемент
            } else if (matrix[row][col] > target) {
                col--;  // Перемещаемся влево, если текущий элемент больше искомого
            } else {
                row++;  // Перемещаемся вниз, если текущий элемент меньше искомого
            }
        }

        return false;
    }

    /**
     * Поиск заданного элемента `target` в отсортированной по строкам и столбцам матрице `matrix`
     * с использованием бинарного поиска по строкам и затем по элементам строки.
     * <p>
     * Временная сложность: O(log m + log n), где m - количество строк, n - количество столбцов. Линейный поиск по строкам
     * имеет сложность O(log m) (так как строки отсортированы), а бинарный поиск внутри строки имеет сложность O(log n).
     * <p>
     * Сложность по памяти: O(1), так как используется только фиксированное количество переменных.
     *
     * @param matrix Отсортированная по строкам и столбцам матрица целых чисел.
     * @param target Целевой элемент для поиска.
     * @return true, если элемент найден в матрице, иначе false.
     */
    public static boolean searchMatrixV2(int[][] matrix, int target) {
        int column = matrix[0].length;

        for (int[] rows : matrix) {
            if (rows[0] <= target && target <= rows[column - 1]) {
                boolean flag = binarySearch(rows, target);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Бинарный поиск заданного элемента `target` в отсортированном массиве `nums`.
     *
     * @param nums   Отсортированный массив целых чисел.
     * @param target Целевой элемент для поиска.
     * @return true, если элемент найден в массиве, иначе false.
     */
    public static boolean binarySearch(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
