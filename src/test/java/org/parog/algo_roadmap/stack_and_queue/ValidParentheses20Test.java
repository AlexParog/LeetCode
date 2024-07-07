package org.parog.algo_roadmap.stack_and_queue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link ValidParentheses20}
 */
public class ValidParentheses20Test {
    @Test
    void ValidParentheses20Test1() {
        assertThat(ValidParentheses20.isValid("()[]{}")).isEqualTo(true);
    }

    @Test
    void ValidParentheses20Test2() {
        assertThat(ValidParentheses20.isValid("()")).isEqualTo(true);
    }

    @Test
    void ValidParentheses20Test3() {
        assertThat(ValidParentheses20.isValid("(]")).isEqualTo(false);
    }

    @Test
    void ValidParentheses20Test4() {
        assertThat(ValidParentheses20.isValid("(]")).isEqualTo(false);
    }

    @Test
    void ValidParentheses20Test5() {
        assertThat(ValidParentheses20.isValid("([([(])])])")).isEqualTo(false);
    }

    @Test
    void ValidParentheses20Test6() {
        assertThat(ValidParentheses20.isValid(")([([(])])])")).isEqualTo(false);
    }

    @Test
    void ValidParentheses20Test7() {
        assertThat(ValidParentheses20.isValid("(((((())))))")).isEqualTo(true);
    }
}
