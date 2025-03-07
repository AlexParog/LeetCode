package org.parog.algo_roadmap.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link MergeSortedArray88}
 */
public class MergeSortedArray88Test {
    @Test
    void MergeSortedArray88Test1() {
        assertThat(MergeSortedArray88.optimizedMerge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3))
                .isEqualTo(new int[]{1, 2, 2, 3, 5, 6});
    }

    @Test
    void MergeSortedArray88Test2() {
        assertThat(MergeSortedArray88.optimizedMerge(new int[]{1}, 1, new int[]{}, 0))
                .isEqualTo(new int[]{1});
    }

    @Test
    void MergeSortedArray88Test3() {
        assertThat(MergeSortedArray88.optimizedMerge(new int[]{0}, 0, new int[]{1}, 1))
                .isEqualTo(new int[]{1});
    }

    @Test
    void MergeSortedArray88Test4() {
        assertThat(MergeSortedArray88.optimizedMerge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{1, 4, 6}, 3))
                .isEqualTo(new int[]{1, 1, 2, 3, 4, 6});
    }

    @Test
    void MergeSortedArray88Test5() {
        assertThat(MergeSortedArray88.optimizedMerge(new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3))
                .isEqualTo(new int[]{1, 2, 3, 4, 5, 6});
    }
}
