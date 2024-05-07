package org.parog.algo_roadmap.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link MoveZeroes283}
 */
public class MoveZeroes283Test {
    @Test
    void MoveZeroes283Test1() {
        assertThat(MoveZeroes283.moveZeroes_TwoStepZeroShift(new int[]{0, 1, 0, 3, 12}))
                .isEqualTo(new int[]{1, 3, 12, 0, 0});
    }

    @Test
    void MoveZeroes283Test2() {
        assertThat(MoveZeroes283.moveZeroes_TwoStepZeroShift(new int[]{0}))
                .isEqualTo(new int[]{0});
    }

    @Test
    void MoveZeroes283Test3() {
        assertThat(MoveZeroes283.moveZeroes_ParallelMovementOfZeros(new int[]{1, 0, 1, 0, 1}))
                .isEqualTo(new int[]{1, 1, 1, 0, 0});
    }

    @Test
    void MoveZeroes283Test4() {
        assertThat(MoveZeroes283.moveZeroes_TwoStepZeroShift(new int[]{1, 2, 3, 4, 5, 6, 7}))
                .isEqualTo(new int[]{1, 2, 3, 4, 5, 6, 7});
    }
}
