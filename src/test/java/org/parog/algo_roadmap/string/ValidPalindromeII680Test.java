package org.parog.algo_roadmap.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link ValidPalindromeII680}
 */
public class ValidPalindromeII680Test {
    @Test
    void ValidPalindromeII680Test1() {
        assertThat(ValidPalindromeII680.validPalindrome("aba"))
                .isEqualTo(true);
    }

    @Test
    void ValidPalindromeII680Test2() {
        assertThat(ValidPalindromeII680.validPalindrome("abca"))
                .isEqualTo(true);
    }

    @Test
    void ValidPalindromeII680Test3() {
        assertThat(ValidPalindromeII680.validPalindrome("abc"))
                .isEqualTo(false);
    }
}
