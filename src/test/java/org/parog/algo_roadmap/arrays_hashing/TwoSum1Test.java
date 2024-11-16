package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link TwoSum1}
 */
public class TwoSum1Test {
    @Test
    void TwoSum1Test1() {
        assertThat(TwoSum1.twoSumHashMap(new int[]{2, 7, 15, 19}, 9))
                .isEqualTo(new int[]{0, 1});
    }

    @Test
    void TwoSum1Test2() {
        assertThat(TwoSum1.twoSumHashMap(new int[]{2, 15, 19, 7}, 9))
                .isEqualTo(new int[]{0, 3});
    }

    @Test
    void TwoSum1Test3() {
        assertThat(TwoSum1.twoSumHashMap(new int[]{1, 15, 2, 7}, 9))
                .isEqualTo(new int[]{2, 3});
    }

    @Test
    void TwoSum1Test4() {
        assertThat(TwoSum1.twoSumHashMap(null, 9))
                .isEqualTo(new int[]{});
    }

    @Test
    void TwoSum1Test5() {
        assertThat(TwoSum1.twoSumHashMap(new int[]{9}, 9))
                .isEqualTo(new int[]{});
    }

    @Test
    void TwoSum1Test6() {
        assertThat(TwoSum1.twoSumHashMap(new int[]{2, 7}, 9))
                .isEqualTo(new int[]{0, 1});
    }
}
