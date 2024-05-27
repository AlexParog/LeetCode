package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link TopKFrequentElements347}
 */
public class TopKFrequentElements347Test {
    @Test
    void TopKFrequentElements347Test1() {
        assertThat(TopKFrequentElements347.topKFrequentWithMinHeap(new int[]{1, 1, 1, 1, 2, 3}, 1))
                .isEqualTo(new int[]{1});
    }

    @Test
    void TopKFrequentElements347Test2() {
        assertThat(TopKFrequentElements347.topKFrequentWithSort(new int[]{1, 1, 1, 2, 2, 3}, 2))
                .isEqualTo(new int[]{1, 2});
    }

    @Test
    void TopKFrequentElements347Test3() {
        assertThat(TopKFrequentElements347.topKFrequentWithMinHeap(new int[]{1}, 1))
                .isEqualTo(new int[]{1});
    }

    @Test
    void TopKFrequentElements347Test4() {
        assertThat(TopKFrequentElements347.topKFrequentWithSort(new int[]{-1, 0, 1, 2, 3}, 5))
                .isEqualTo(new int[]{-1, 0, 1, 2, 3});
    }
}
