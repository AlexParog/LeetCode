package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link FindPivotIndex724}
 */
public class FindPivotIndex724Test {
    @Test
    void FindPivotIndex724Test1() {
        assertThat(FindPivotIndex724.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}))
                .isEqualTo(3);
    }

    @Test
    void FindPivotIndex724Test2() {
        assertThat(FindPivotIndex724.pivotIndex(new int[]{1, 2, 3}))
                .isEqualTo(-1);
    }

    @Test
    void FindPivotIndex724Test3() {
        assertThat(FindPivotIndex724.pivotIndex(new int[]{2, 1, -1}))
                .isEqualTo(0);
    }

    @Test
    void FindPivotIndex724Test4() {
        assertThat(FindPivotIndex724.pivotIndex(new int[]{-1, 1, 2}))
                .isEqualTo(2);
    }
}
