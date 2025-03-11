package org.parog.algo_roadmap.tree_graph_dfs_bfs;

/**
 * 1.
 * Строка: m == grid.length
 * Столбец: n == grid[i].length
 * Диапазон значений строк и столбцов: 1 <= m, n <= 300
 * Поле grid[i][j] состоит из '0' или '1', где 0 - вода, 1 - остров.
 * 2.
 * Тестовый класс {@link NumberOfIslands200Test}
 * 3.
 * Временная сложность: O(M * N), где M - количество строк в матрице, а N - количество столбцов в матрице. Каждая клетка
 * посещается один раз, и для каждой клетки выполняется константное количество операций
 * Пространственная сложность: O(M * N), так как в худшем случае, если сетка состоит из одного большого острова, то
 * и глубина рекурсии достигает M * N.
 */
public class NumberOfIslands200 {
    public static int numIslands(char[][] grid) {
        final int rowSize = grid.length;
        final int colSize = grid[0].length;

        int countIslands = 0;
        // проходимся по матрице и если находим участок земли, то запускаем dfs
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (grid[i][j] == '1') {
                    countIslands++;
                    dfs(grid, i, j);
                }
            }
        }

        return countIslands;
    }

    /**
     * Применяем алгоритм DFS, так как он "углубляется" в остров, пока не пройдет все его клетки.
     *
     * @param grid поле
     * @param row  строка поля
     * @param col  колонка матрицы
     */
    private static void dfs(char[][] grid, int row, int col) {
        final int rowSize = grid.length;
        final int colSize = grid[0].length;

        // Проверка выхода за границы сетки или посещения клетки
        if (row < 0 || row >= rowSize || col < 0 || col >= colSize || grid[row][col] != '1') {
            return;
        }

        // Помечаем клетку как посещенную
        grid[row][col] = '2';

        // Обход соседних клеток
        dfs(grid, row - 1, col); // Вверх
        dfs(grid, row + 1, col); // Вниз
        dfs(grid, row, col - 1); // Влево
        dfs(grid, row, col + 1); // Вправо
    }
}
