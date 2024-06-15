package org.parog.algo_roadmap.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link ReversePrefixOfWord2000}
 */
public class ReversePrefixOfWord2000Test {
    @Test
    void ReversePrefixOfWord2000Test1() {
        assertThat(ReversePrefixOfWord2000.reversePrefixInPlace("abcdefd", 'd'))
                .isEqualTo("dcbaefd");
    }

    @Test
    void ReversePrefixOfWord2000Test2() {
        assertThat(ReversePrefixOfWord2000.reversePrefixInPlace("xyxzxe", 'z'))
                .isEqualTo("zxyxxe");
    }

    @Test
    void ReversePrefixOfWord2000Test3() {
        assertThat(ReversePrefixOfWord2000.reversePrefixInPlace("abcd", 'z'))
                .isEqualTo("abcd");
    }
}
