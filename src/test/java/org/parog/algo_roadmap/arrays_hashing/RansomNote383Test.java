package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link RansomNote383}
 */
public class RansomNote383Test {
    @Test
    void RansomNote383Test1() {
        assertThat(RansomNote383.canConstruct("a", "b"))
                .isEqualTo(false);
    }

    @Test
    void RansomNote383Test2() {
        assertThat(RansomNote383.canConstruct("aa", "b"))
                .isEqualTo(false);
    }

    @Test
    void RansomNote383Test3() {
        assertThat(RansomNote383.canConstruct("aa", "aab"))
                .isEqualTo(true);
    }

    @Test
    void RansomNote383Test4() {
        assertThat(RansomNote383.canConstruct("a", "bbbbba"))
                .isEqualTo(true);
    }
}
