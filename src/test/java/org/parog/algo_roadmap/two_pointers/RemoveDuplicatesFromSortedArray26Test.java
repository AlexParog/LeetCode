package org.parog.algo_roadmap.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link RemoveDuplicatesFromSortedArray26}
 */
public class RemoveDuplicatesFromSortedArray26Test {
    @Test
    void RemoveDuplicatesFromSortedArray26Test1() {
        assertThat(RemoveDuplicatesFromSortedArray26.removeDuplicates(new int[]{1, 1, 2}))
                .isEqualTo(2);
    }

    @Test
    void RemoveDuplicatesFromSortedArray26Test2() {
        assertThat(RemoveDuplicatesFromSortedArray26.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}))
                .isEqualTo(5);
    }

    @Test
    void RemoveDuplicatesFromSortedArray26Test3() {
        assertThat(RemoveDuplicatesFromSortedArray26
                .removeDuplicates(new int[]{-100, -100, -1, -1, -1, 0, 0, 0, 1, 99, 99, 100, 100, 100}))
                .isEqualTo(6);
    }

    @Test
    void RemoveDuplicatesFromSortedArray26Test4() {
        assertThat(RemoveDuplicatesFromSortedArray26
                .removeDuplicates(new int[]{0}))
                .isEqualTo(1);
    }
}
