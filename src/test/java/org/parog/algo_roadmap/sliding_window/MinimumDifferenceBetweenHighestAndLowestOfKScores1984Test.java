package org.parog.algo_roadmap.sliding_window;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link MinimumDifferenceBetweenHighestAndLowestOfKScores1984}
 */
public class MinimumDifferenceBetweenHighestAndLowestOfKScores1984Test {
    @Test
    void MinimumDifferenceBetweenHighestAndLowestOfKScores1984Test1() {
        assertThat(MinimumDifferenceBetweenHighestAndLowestOfKScores1984.minimumDifference(new int[]{90}, 1))
                .isEqualTo(0);
    }

    @Test
    void MinimumDifferenceBetweenHighestAndLowestOfKScores1984Test2() {
        assertThat(MinimumDifferenceBetweenHighestAndLowestOfKScores1984.minimumDifference(new int[]{9, 4, 1, 7}, 2))
                .isEqualTo(2);
    }

    @Test
    void MinimumDifferenceBetweenHighestAndLowestOfKScores1984Test3() {
        assertThat(MinimumDifferenceBetweenHighestAndLowestOfKScores1984.minimumDifference(new int[]{9, 4, 1, 7}, 0))
                .isEqualTo(0);
    }

    @Test
    void MinimumDifferenceBetweenHighestAndLowestOfKScores1984Test4() {
        assertThat(MinimumDifferenceBetweenHighestAndLowestOfKScores1984.minimumDifference(new int[]{9, 4, 1, 7}, 4))
                .isEqualTo(8);
    }

    @Test
    void MinimumDifferenceBetweenHighestAndLowestOfKScores1984Test5() {
        assertThat(MinimumDifferenceBetweenHighestAndLowestOfKScores1984
                .minimumDifference(new int[]{9, 4, 3, 7, 100, 1, 80, 45}, 4))
                .isEqualTo(6);
    }
}