package org.parog.algo_roadmap.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link ReverseString344}
 */
public class ReverseString344Test {
    @Test
    void ReverseString344Test1() {
        assertThat(ReverseString344.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'}))
                .isEqualTo(new char[]{'o', 'l', 'l', 'e', 'h'});
    }
}
