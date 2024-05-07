package org.parog.algo_roadmap.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link TwoSumII_InputArrayIsSorted167}
 */
public class TwoSumII_InputArrayIsSorted167Test {
    @Test
    void TwoSumII_InputArrayIsSorted167Test1() {
        assertThat(TwoSumII_InputArrayIsSorted167.twoSumTwoPointers(new int[]{2, 7, 11, 15}, 9))
                .isEqualTo(new int[]{1, 2});
    }

    @Test
    void TwoSumII_InputArrayIsSorted167Test2() {
        assertThat(TwoSumII_InputArrayIsSorted167.twoSumTwoPointers(new int[]{2, 3, 4}, 6))
                .isEqualTo(new int[]{1, 3});
    }

    @Test
    void TwoSumII_InputArrayIsSorted167Test3() {
        assertThat(TwoSumII_InputArrayIsSorted167.twoSumTwoPointers(new int[]{-1, 0}, -1))
                .isEqualTo(new int[]{1, 2});
    }

    @Test
    void TwoSumII_InputArrayIsSorted167Test4() {
        assertThat(TwoSumII_InputArrayIsSorted167.twoSumTwoPointers(new int[]{-6, -5, -3, -1, 0, 1, 2, 4, 10}, 0))
                .isEqualTo(new int[]{4, 6});
    }
}
