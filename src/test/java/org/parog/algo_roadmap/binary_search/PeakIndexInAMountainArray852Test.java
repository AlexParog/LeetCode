package org.parog.algo_roadmap.binary_search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link PeakIndexInAMountainArray852}
 */
public class PeakIndexInAMountainArray852Test {
    @Test
    void PeakIndexInAMountainArray852Test1() {
        assertThat(PeakIndexInAMountainArray852.peakIndexInMountainArray(new int[]{0, 1, 0}))
                .isEqualTo(1);
    }

    @Test
    void PeakIndexInAMountainArray852Test2() {
        assertThat(PeakIndexInAMountainArray852.peakIndexInMountainArray(new int[]{0, 2, 1, 0}))
                .isEqualTo(1);
    }

    @Test
    void PeakIndexInAMountainArray852Test3() {
        assertThat(PeakIndexInAMountainArray852.peakIndexInMountainArray(new int[]{0, 10, 5, 2}))
                .isEqualTo(1);
    }

    @Test
    void PeakIndexInAMountainArray852Test4() {
        assertThat(PeakIndexInAMountainArray852.peakIndexInMountainArray(new int[]{0, 2, 3, 4, 5, 2, 1, 0}))
                .isEqualTo(4);
    }

    @Test
    void PeakIndexInAMountainArray852Test5() {
        assertThat(PeakIndexInAMountainArray852.peakIndexInMountainArray(new int[]{0, 1, 2, 3, 4, 5, 6, 7}))
                .isEqualTo(-1);
    }

    @Test
    void PeakIndexInAMountainArray852Test6() {
        assertThat(PeakIndexInAMountainArray852.peakIndexInMountainArray(new int[]{7, 6, 5, 4, 3, 2, 1, 0}))
                .isEqualTo(-1);
    }

    @Test
    void PeakIndexInAMountainArray852Test7() {
        assertThat(PeakIndexInAMountainArray852.peakIndexInMountainArray(new int[]{18, 29, 38, 59, 98, 100, 99, 98, 90}))
                .isEqualTo(5);
    }

    @Test
    void PeakIndexInAMountainArray852Test8() {
        assertThat(PeakIndexInAMountainArray852.peakIndexInMountainArray(new int[]{3, 5, 3, 2, 0}))
                .isEqualTo(1);
    }
}
