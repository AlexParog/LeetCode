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
                if ('X' == board[row][clm]) {
                    if ((row == 0 || '.' == board[row - 1][clm]) && (clm == 0 || '.' == board[row][clm - 1])) {
                        count++;
                    }
                }
            }
        }

        return count;

    }
}
