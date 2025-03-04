package org.parog.algo_roadmap.arrays_hashing;

/**
 * 1.
 * Размер матрицы: n == matrix.length == matrix[i].length
 * Диапазон размера матрицы: 1 <= n <= 20
 * Диапазон значений элементов матрицы: -1000 <= matrix[i][j] <= 1000
 * 2.
 * Тестовый класс {@link RotateImage48Test}
 * 3.
 * Временная сложность: O(N^2), где N - количество элементов в матрице.
 * Транспонирование (O(N^2)) - проходим по всем элементам выше главной диагонали,
 * Отражение (O(N^2)) - проходим по всем строкам и меняем местами элементы.
 * <p>
 * Пространственная сложность: O(1), так как не используем дополнительных структур данных (in-place алгоритм).
 */
public class RotateImage48 {
    public static int[][] rotate(int[][] matrix) {
        int rowLength = matrix.length;

        // Шаг 1 - транспонирование матрицы (диагональ возрастающая)
        for (int row = 0; row < rowLength; row++) {
            for (int clm = row; clm < rowLength; clm++) {
                // Меняем местами matrix[row][clm] и matrix[clm][row]
                int temp = matrix[row][clm];
                matrix[row][clm] = matrix[clm][row];
                matrix[clm][row] = temp;
            }
        }

        // Шаг 2 - отражение матрицы относительно вертикали
        // Если количество элементов в строке нечетное, то 1 столбец останется неизменным (наша вертикаль относительно которой отражаем)
        // Если четное, то вертикаль невидимая. Меняем местами в строке: первый и последний, первый - 1 и предпоследний и т.д)
        for (int row = 0; row < rowLength; row++) {
            for (int clm = 0; clm < rowLength / 2; clm++) {
                // Меняем местами matrix[row][clm] и matrix[row][rowLength - clm - 1]
                int temp = matrix[row][clm];
                matrix[row][clm] = matrix[row][rowLength - clm - 1];
                matrix[row][rowLength - clm - 1] = temp;
            }
        }
        return matrix;
    }

    /**
     * Временная сложность: O(N^2), проходим по каждому элементу матрицы ровно один раз
     * Пространственная сложность: O(1), так как не используем дополнительных структур данных (in-place алгоритм).
     *
     * @param matrix входящая матрица
     * @return матрица, повернутая на 90 градусов по часовой стрелке
     */
    public static int[][] optimizedRotate(int[][] matrix) {
        // границы внешнего квадрата(вертикальная и горизонтальная ось)
        int left = 0;
        int right = matrix.length - 1;

        // пока границы не пересекутся
        while (left < right) {
            // смещение по стороне квадрата относительного его начала стороны
            for (int i = 0; i < right - left; i++) {
                // для удобства: верхняя и нижняя точка
                int top = left;
                int bottom = right;

                // используем одну доп. переменную для сохранения
                int topLeft = matrix[top][left + i];

                // перемещаем нижнюю левую точку в верхнюю правую
                matrix[top][left + i] = matrix[bottom - i][left];

                // перемещаем нижнюю правую точку в левую нижнюю точку
                matrix[bottom - i][left] = matrix[bottom][right - i];

                // перемещаем правую верхнюю точку в правую нижнюю точку
                matrix[bottom][right - i] = matrix[top + i][right];

                // перемещаем верхнюю левую точку в правую верхнюю точку
                matrix[top + i][right] = topLeft;
            }
            left++;
            right--;
        }

        return matrix;
    }
}
