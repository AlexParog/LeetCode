package org.parog.algo_roadmap.math;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link CountOddNumbersInAnIntervalRange1523}
 */
public class CountOddNumbersInAnIntervalRange1523Test {
    @Test
    void CountOddNumbersInAnIntervalRange1523Test1() {
        assertThat(CountOddNumbersInAnIntervalRange1523.countOdds(3, 7))
                .isEqualTo(3);
    }

    @Test
    void CountOddNumbersInAnIntervalRange1523Test2() {
        assertThat(CountOddNumbersInAnIntervalRange1523.countOdds(8, 10))
                .isEqualTo(1);
    }

    @Test
    void CountOddNumbersInAnIntervalRange1523Test3() {
        assertThat(CountOddNumbersInAnIntervalRange1523.countOdds(0, 0))
                .isEqualTo(0);
    }

    @Test
    void CountOddNumbersInAnIntervalRange1523Test4() {
        assertThat(CountOddNumbersInAnIntervalRange1523.countOdds(9, 9))
                .isEqualTo(1);
    }

    @Test
    void CountOddNumbersInAnIntervalRange1523Test5() {
        assertThat(CountOddNumbersInAnIntervalRange1523.countOdds(0, 10))
                .isEqualTo(5);
    }

    @Test
    void CountOddNumbersInAnIntervalRange1523Test6() {
        assertThat(CountOddNumbersInAnIntervalRange1523.countOdds(21, 22))
                .isEqualTo(1);
    }

    @Test
    void CountOddNumbersInAnIntervalRange1523Test7() {
        assertThat(CountOddNumbersInAnIntervalRange1523.countOdds(22, 23))
                .isEqualTo(1);
    }
}
