package org.parog.algo_roadmap.arrays_hashing;

/**
 * 1.
 * 1 <= moves.length <= 9
 * moves[i].length == 2
 * 0 <= rowi, coli <= 2
 * There are no repeated elements on moves.
 * moves follow the rules of tic tac toe.
 * 2.
 * Тестовый класс {@link FindWinnerOnATicTacToeGame1275Test}
 * 3.
 * Сложность по времени: O(N), где N - количество ходов игроков в массиве moves (максимальное количество ходов N<=9, можно сказать O(1))
 * Сложность по памяти: O(1) нет дополнительных затрат по памяти
 */
public class FindWinnerOnATicTacToeGame1275 {
    public static String tictactoe(int[][] moves) {
        int[] rows = new int[3];
        int[] cols = new int[3];

        int diag = 0;
        int antiDiag = 0;

        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];

            int player = (i % 2 == 0) ? 1 : -1;

            rows[row] += player;
            cols[col] += player;

            if (row == col) {
                diag += player;
            }

            if (row + col == 2) {
                antiDiag += player;
            }

            if (Math.abs(rows[row]) == 3 || Math.abs(cols[col]) == 3 || Math.abs(diag) == 3
                    || Math.abs(antiDiag) == 3) {
                return player == 1 ? "A" : "B";
            }

        }

        return moves.length == 9 ? "Draw" : "Pending";
    }
}
