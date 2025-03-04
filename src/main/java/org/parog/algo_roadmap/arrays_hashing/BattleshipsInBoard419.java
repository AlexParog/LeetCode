package org.parog.algo_roadmap.arrays_hashing;

/**
 * 1.
 * Строки матрицы: m == board.length
 * Столбцы матрицы: n == board[i].length
 * Диапазон значений строк и столбцов: 1 <= m, n <= 200
 * Игровая доска содержит board[i][j]: '.' или 'X'.
 * 2.
 * Тестовый класс {@link BattleshipsInBoard419Test}
 * 3.
 * Временная сложность: O(N^2), так как проходимся по всей матрице ровно один раз
 * Пространственная сложность: O(1), так как не используем доп. структур для хранения значений
 */
public class BattleshipsInBoard419 {
    public static int countBattleships(char[][] board) {
        int count = 0;

        for (int row = 0; row < board.length; row++) {
            for (int clm = 0; clm < board[row].length; clm++) {
                // находим корабль
                if ('X' == board[row][clm]) {
                    if ((row == 0 || '.' == board[row - 1][clm]) && (clm == 0 || '.' == board[row][clm - 1])) {
                        // 1. если текущая клетка находится в первом ряду (row == 0), то она автоматически считается началом
                        //    корабля (так как выше нет клеток) или клетка сверху пустая ('.'),
                        //    то это начало вертикального корабля.
                        // 2. если текущая клетка находится в первом столбце (clm == 0), то она автоматически считается
                        //    началом корабля (так как слева нет клеток) или клетка слева пустая ('.'),
                        //    то это начало горизонтального корабля.
                        // Таким образом, мы учитываем только начальные клетки кораблей,
                        // чтобы избежать повторного подсчета.
                        count++;
                    }
                }
            }
        }

        return count;

    }
}
