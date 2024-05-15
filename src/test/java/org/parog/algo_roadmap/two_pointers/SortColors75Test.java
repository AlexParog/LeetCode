package org.parog.algo_roadmap.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link SortColors75}
 */
public class SortColors75Test {
    @Test
    void SortColors75Test1() {
        assertThat(SortColors75.sortColors(new int[]{2, 0, 2, 1, 1, 0}))
                .isEqualTo(new int[]{0, 0, 1, 1, 2, 2});
    }

    @Test
    void SortColors75Test2() {
        assertThat(SortColors75.sortColors(new int[]{2, 0, 1}))
                .isEqualTo(new int[]{0, 1, 2});
    }

    @Test
    void SortColors75Test3() {
        assertThat(SortColors75.sortColors(new int[]{1, 0, 2}))
                .isEqualTo(new int[]{0, 1, 2});
    }
}
