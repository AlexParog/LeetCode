package org.parog.algo_roadmap.arrays_hashing;

/**
 * 1.
 * Строка матрицы: m == matrix.length
 * Столбец матрицы: n == matrix[i].length
 * Диапазон длины строки и столбца: 1 <= m, n <= 200
 * Диапазон элемента матрицы: -10^4 <= матрица[i][j] <= 10^4
 * 0 <= row1 <= row2 < m
 * 0 <= col1 <= col2 < n
 * Будет сделано не более 10^4 вызовов sumRegion.
 * 2.
 * Тестовый класс {@link RangeSumQuery2DImmutable304Test}
 * 3.
 * Общая временная сложность:
 * Общая пространственная сложность:
 */
public class RangeSumQuery2DImmutable304 {

    private int[][] prefixMatrix;

    /**
     * Конструктор: преобразует входящую матрицу в префиксную матрицу.
     * Проходит по всей матрице и суммирует значения по строкам.
     * <p>
     * Временная сложность: O(M * N), где M - количество строк в матрице, а n - количество столбцов.
     * Пространственная сложность: O(M * N), используем дополнительную prefixMatrix = входящей matrix
     *
     * @param matrix изначальная матрица
     */
    public RangeSumQuery2DImmutable304(int[][] matrix) {
        // преобразуем входящую матрицу в префиксную матрицу
        if (matrix.length == 1 && matrix[0].length >= 2) {
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 1; col < matrix[0].length; col++) {
                    matrix[row][col] += matrix[row][col - 1];
                }
            }
        } else if (matrix.length >= 2 && matrix[0].length >= 2) {
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 1; col < matrix[row].length; col++) {
                    matrix[row][col] += matrix[row][col - 1];
                }
            }
        }
        this.prefixMatrix = matrix;
    }

    /**
     * Возвращает сумму элементов матрицы внутри прямоугольника, заданного ее левым верхним углом (row1, col1)
     * и правым нижним углом (row2, col2).
     * <p>
     * Временная сложность: O(M), где M - количество строк в матрице. Метод sumRegion проходит по строкам
     * от row1 до row2 и выполняет операцию сложения (и вычитания) элементов префиксной матрицы.
     * В худшем случае он выполняет row2 - row1 + 1 операций
     * Пространственная сложность: O(1), так как не используем дополнительной памяти
     *
     * @param row1 строка левого верхнего элемент
     * @param col1 столбец левого верхнего элемента
     * @param row2 строка правого нижнего элемента
     * @param col2 столбец правого нижнего элемента
     * @return сумма элементов матрицы внутри прямоугольника
     */
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int result = 0;

        if (col1 == 0) {
            // взять самый правый элемент в каждой строке в рамках заключенного прямоугольника
            for (int row = row1; row <= row2; row++) {
                result += prefixMatrix[row][col2];
            }
        } else {
            // 1. взять самый правый элемент в каждой строке в рамках заключенного прямоугольника
            // и вычесть из него самый первый элемент перед прямоугольником
            for (int row = row1; row <= row2; row++) {
                result += prefixMatrix[row][col2] - prefixMatrix[row][col1 - 1];
            }
        }

        return result;
    }
}
