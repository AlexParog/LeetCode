package org.parog.algo_roadmap.binary_search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link MissingNumber268}
 */
public class MissingNumber268Test {
    @Test
    void MissingNumber268Test1() {
        assertThat(MissingNumber268.missingNumberWithBinarySearch(new int[]{3, 0, 1}))
                .isEqualTo(2);
    }

    @Test
    void MissingNumber268Test2() {
        assertThat(MissingNumber268.missingNumberWithBinarySearch(new int[]{0, 1}))
                .isEqualTo(2);
    }

    @Test
    void MissingNumber268Test3() {
        assertThat(MissingNumber268.missingNumberWithBinarySearch(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}))
                .isEqualTo(8);
    }
}
