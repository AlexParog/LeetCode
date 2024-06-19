package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link MaximumPopulationYear1854}
 */
public class MaximumPopulationYear1854Test {
    @Test
    void MaximumPopulationYear1854Test1() {
        assertThat(MaximumPopulationYear1854.maximumPopulation(new int[][]{
                {1993, 1999},
                {2000, 2010}
        })).isEqualTo(1993);
    }

    @Test
    void MaximumPopulationYear1854Test2() {
        assertThat(MaximumPopulationYear1854.maximumPopulation(new int[][]{
                {1950, 1961},
                {1960, 1971},
                {1970, 1981}
        })).isEqualTo(1960);
    }

    @Test
    void MaximumPopulationYear1854Test3() {
        assertThat(MaximumPopulationYear1854.maximumPopulation(new int[][]{
                {1950, 2000},
                {2000, 2050}
        })).isEqualTo(1950);
    }

}
