package org.parog.algo_roadmap.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link LongestSubstringWithoutRepeatingCharacters3}
 */
public class LongestSubstringWithoutRepeatingCharacters3Test {

    @Test
    void LongestSubstringWithoutRepeatingCharacters3Test1() {
        assertThat(LongestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring("abcabcbb"))
                .isEqualTo(3);
    }

    @Test
    void LongestSubstringWithoutRepeatingCharacters3Test2() {
        assertThat(LongestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring("bbbbbb"))
                .isEqualTo(1);
    }

    @Test
    void LongestSubstringWithoutRepeatingCharacters3Test3() {
        assertThat(LongestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring("abcde"))
                .isEqualTo(5);
    }

    @Test
    void LongestSubstringWithoutRepeatingCharacters3Test4() {
        assertThat(LongestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring(""))
                .isEqualTo(0);
    }

    @Test
    void LongestSubstringWithoutRepeatingCharacters3Test5() {
        assertThat(LongestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring("a"))
                .isEqualTo(1);
    }
}
