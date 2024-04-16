package org.parog.algo_roadmap.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для решения задачи {@link ReverseStringII541}
 */
public class ReverseStringII541Test {
    @Test
    void ReverseStringII541Test1() {
        assertThat(ReverseStringII541.reverseStr("abcdefg", 2))
                .isEqualTo("bacdfeg");
    }

    @Test
    void ReverseStringII541Test2() {
        assertThat(ReverseStringII541.reverseStr("abcd", 2))
                .isEqualTo("bacd");
    }
}
