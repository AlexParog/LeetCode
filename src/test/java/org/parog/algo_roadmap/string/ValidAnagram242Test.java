package org.parog.algo_roadmap.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link ValidAnagram242}
 */
public class ValidAnagram242Test {
    @Test
    void ValidAnagram242Test1() {
        assertThat(ValidAnagram242.isAnagramV2("anagram", "nagaram"))
                .isEqualTo(true);
    }

    @Test
    void ValidAnagram242Test2() {
        assertThat(ValidAnagram242.isAnagramV2("rat", "car"))
                .isEqualTo(false);
    }

    @Test
    void ValidAnagram242Test3() {
        assertThat(ValidAnagram242.isAnagramV2("", ""))
                .isEqualTo(false);
    }
}
