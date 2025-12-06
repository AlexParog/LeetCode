package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link SetMismatch645}
 */
public class SetMismatch645Test {

    @Test
    void SetMismatch645Test1() {
        assertThat(SetMismatch645.findErrorNums(new int[]{1, 2, 2, 4}))
                .isEqualTo(new int[]{2, 3});
    }

    @Test
    void SetMismatch645Test2() {
        assertThat(SetMismatch645.findErrorNums(new int[]{1, 1}))
                .isEqualTo(new int[]{1, 2});
    }

    @Test
    void SetMismatch645Test3() {
        assertThat(SetMismatch645.findErrorNums(new int[]{1, 2, 3, 4, 1}))
                .isEqualTo(new int[]{1, 5});
    }

    @Test
    void SetMismatch645Test4() {
        assertThat(SetMismatch645.findErrorNums(new int[]{2, 2}))
                .isEqualTo(new int[]{2, 1});
    }
}
