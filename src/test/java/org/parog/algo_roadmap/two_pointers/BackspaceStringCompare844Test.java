package org.parog.algo_roadmap.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link BackspaceStringCompare844}
 */
public class BackspaceStringCompare844Test {
    @Test
    void BackspaceStringCompare844Test1() {
        assertThat(BackspaceStringCompare844.backspaceCompare("ab#c", "ad#c"))
                .isEqualTo(true);
    }

    @Test
    void BackspaceStringCompare844Test2() {
        assertThat(BackspaceStringCompare844.backspaceCompare("ab##", "c#d#"))
                .isEqualTo(true);
    }

    @Test
    void BackspaceStringCompare844Test3() {
        assertThat(BackspaceStringCompare844.backspaceCompare("a#c", "b"))
                .isEqualTo(false);
    }

    @Test
    void BackspaceStringCompare844Test4() {
        assertThat(BackspaceStringCompare844.backspaceCompare("s#", "#f"))
                .isEqualTo(false);
    }

    @Test
    void BackspaceStringCompare844Test5() {
        assertThat(BackspaceStringCompare844.backspaceCompare("#", "#"))
                .isEqualTo(true);
    }

    @Test
    void BackspaceStringCompare844Test6() {
        assertThat(BackspaceStringCompare844.backspaceCompare("y#fo##f", "y#f#o##f"))
                .isEqualTo(true);
    }
}
