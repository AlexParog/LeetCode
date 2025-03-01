package org.parog.algo_roadmap.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link SquaresOfSortedArray977}
 */
public class SquaresOfSortedArray977Test {
    @Test
    void SquaresOfSortedArray977Test1() {
        assertThat(SquaresOfSortedArray977.sortedSquares(new int[]{-4, -1, 0, 3, 10}))
                .isEqualTo(new int[]{0, 1, 9, 16, 100});
    }

    @Test
    void SquaresOfSortedArray977Test2() {
        assertThat(SquaresOfSortedArray977.sortedSquares(new int[]{-7, -3, 2, 3, 11}))
                .isEqualTo(new int[]{4, 9, 9, 49, 121});
    }
}
