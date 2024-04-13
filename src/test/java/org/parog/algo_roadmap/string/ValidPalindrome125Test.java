package org.parog.algo_roadmap.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link ValidPalindrome125}
 */
public class ValidPalindrome125Test {
    @Test
    void ValidPalindrome125Test1() {
        assertThat(ValidPalindrome125.isPalindromeWithFuncStyle("A man, a plan, a canal: Panama"))
                .isEqualTo(true);
    }

    @Test
    void ValidPalindrome125Test2() {
        assertThat(ValidPalindrome125.isPalindromeWithRegex("race a car"))
                .isEqualTo(false);
    }

    @Test
    void ValidPalindrome125Test3() {
        assertThat(ValidPalindrome125.isPalindromeWithRegex(" "))
                .isEqualTo(true);
    }
}
