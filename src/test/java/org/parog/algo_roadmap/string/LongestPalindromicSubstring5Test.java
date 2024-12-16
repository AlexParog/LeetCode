package org.parog.algo_roadmap.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link LongestPalindromicSubstring5}
 */
public class LongestPalindromicSubstring5Test {

    @Test
    void LongestPalindromicSubstring5Test1() {
        assertThat(LongestPalindromicSubstring5.longestPalindromeV1("babad")).isEqualTo("aba");
    }

    @Test
    void LongestPalindromicSubstring5Test2() {
        assertThat(LongestPalindromicSubstring5.longestPalindromeV1("cbbd")).isEqualTo("bb");
    }

    @Test
    void LongestPalindromicSubstring5Test3() {
        assertThat(LongestPalindromicSubstring5.longestPalindromeV1("b")).isEqualTo("b");
    }

    @Test
    void LongestPalindromicSubstring5Test4() {
        assertThat(LongestPalindromicSubstring5.longestPalindromeV1("")).isEqualTo("");
    }

    @Test
    void LongestPalindromicSubstring5Test5() {
        assertThat(LongestPalindromicSubstring5.longestPalindromeV1("bbbbbbbbbbbb"))
                .isEqualTo("bbbbbbbbbbbb");
    }

    @Test
    void LongestPalindromicSubstring5Test6() {
        assertThat(LongestPalindromicSubstring5.longestPalindromeV1("aasssbbbbddddd"))
                .isEqualTo("ddddd");
    }
}
