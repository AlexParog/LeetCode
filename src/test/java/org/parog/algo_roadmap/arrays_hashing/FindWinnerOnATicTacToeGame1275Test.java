package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link FindWinnerOnATicTacToeGame1275}
 */
public class FindWinnerOnATicTacToeGame1275Test {
    @Test
    void tictactoeTest_PlayerAWins() {
        int[][] moves = {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};
        assertThat(FindWinnerOnATicTacToeGame1275.tictactoe(moves))
                .isEqualTo("A");
    }

    @Test
    void tictactoeTest_PlayerBWins() {
        int[][] moves = {{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}};
        assertThat(FindWinnerOnATicTacToeGame1275.tictactoe(moves))
                .isEqualTo("B");
    }

    @Test
    void tictactoeTest_Draw() {
        int[][] moves = {{0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}};
        assertThat(FindWinnerOnATicTacToeGame1275.tictactoe(moves))
                .isEqualTo("Draw");
    }

    @Test
    void tictactoeTest_Pending() {
        int[][] moves = {{0, 0}, {1, 1}};
        assertThat(FindWinnerOnATicTacToeGame1275.tictactoe(moves))
                .isEqualTo("Pending");
    }

    @Test
    void tictactoeTest_PlayerAWinsAntiDiagonal() {
        int[][] moves = {{0, 2}, {1, 0}, {1, 1}, {2, 1}, {2, 0}};
        assertThat(FindWinnerOnATicTacToeGame1275.tictactoe(moves))
                .isEqualTo("A");
    }
}
