package org.parog.algo_roadmap.sliding_window;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link MaximumAverageSubarrayI643}
 */
public class MaximumAverageSubarrayI643Test {

    @Test
    void MaximumAverageSubarrayI643Test1() {
        assertThat(MaximumAverageSubarrayI643.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4))
                .isEqualTo(12.75);
    }

    @Test
    void MaximumAverageSubarrayI643Test2() {
        assertThat(MaximumAverageSubarrayI643.findMaxAverage(new int[]{5}, 1))
                .isEqualTo(5);
    }

}
