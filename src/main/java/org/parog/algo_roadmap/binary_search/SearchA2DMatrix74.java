package org.parog.algo_roadmap.binary_search;

/**
 * 1.
 * Количество столбцов (matrix.length) - m, длина строки (matrix[i].length) - n: 1 <= m, n <= 100
 * Диапазон для matrix[i][j], target:-10^4 <= matrix[i][j], target <= 10^4
 * 2.
 * Тестовый класс {@link SearchA2DMatrix74Test}
 * 3.
 * Ограничения по времени: O(log(m * n)), где m * n - матрица
 * Ограничения по памяти: O(1) - используем только входящие константы
 */
public class SearchA2DMatrix74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int firstLine = 0;
        int lastLine = matrix.length - 1;
        int lineIndex = -1;

        // определяем индекс строки матрицы, где должен присутствовать искомый элемент
        while (firstLine <= lastLine) {
            int midLine = (firstLine + lastLine) / 2;
            // находим target в диапазоне
            if (target <= matrix[midLine][matrix[midLine].length - 1] &&
                    target >= matrix[midLine][0]) {
                lineIndex = midLine;
                break;
            } else if (target < matrix[midLine][0]) {
                lastLine = midLine - 1;
            } else {
                firstLine = midLine + 1;
            }
        }

        if (lineIndex == -1) {
            return false;
        } else {
            return binarySearch(matrix, lineIndex, target);
        }
    }

    /**
     * Бинарная сортировка в нужно строке матрицы.
     *
     * @param matrix    матрица
     * @param lineIndex индекс строки матрицы
     * @param target    искомый элемент
     * @return true - элемент есть в строке, false - отсутствует
     */
    private static boolean binarySearch(int[][] matrix, int lineIndex, int target) {
        int[] nums = matrix[lineIndex];
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return true;
            else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
