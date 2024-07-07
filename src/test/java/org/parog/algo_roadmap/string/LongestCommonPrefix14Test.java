package org.parog.algo_roadmap.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link LongestCommonPrefix14}
 */
public class LongestCommonPrefix14Test {
    @Test
    void LongestCommonPrefix14Test1() {
        assertThat(LongestCommonPrefix14.longestCommonPrefix(new String[]{"flower", "flow", "flight"}))
                .isEqualTo("fl");
    }

    @Test
    void LongestCommonPrefix14Test2() {
        assertThat(LongestCommonPrefix14.longestCommonPrefix(new String[]{"dog", "racecar", "car"}))
                .isEqualTo("");
    }
}
