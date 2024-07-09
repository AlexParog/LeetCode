package org.parog.algo_roadmap.binary_search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для решения задачи {@link BinarySearch704}
 */
public class BinarySearch704Test {
    @Test
    void BinarySearch704Test1() {
        assertThat(BinarySearch704.search(new int[]{-1, 0, 3, 5, 9, 12}, 9)).isEqualTo(4);
    }

    @Test
    void BinarySearch704Test2() {
        assertThat(BinarySearch704.search(new int[]{-1, 0, 3, 5, 9, 12}, 2)).isEqualTo(-1);
    }
}
