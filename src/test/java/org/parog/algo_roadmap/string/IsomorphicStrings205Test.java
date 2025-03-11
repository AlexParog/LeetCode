package org.parog.algo_roadmap.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link IsomorphicStrings205}
 */
public class IsomorphicStrings205Test {
    @Test
    void IsomorphicStrings205Test1() {
        assertThat(IsomorphicStrings205.isIsomorphic("egg", "add")).isEqualTo(true);
    }

    @Test
    void IsomorphicStrings205Test2() {
        assertThat(IsomorphicStrings205.isIsomorphic("foo", "bar")).isEqualTo(false);
    }

    @Test
    void IsomorphicStrings205Test3() {
        assertThat(IsomorphicStrings205.optimizedIsIsomorphic("paper", "title")).isEqualTo(true);
    }

    @Test
    void IsomorphicStrings205Test4() {
        assertThat(IsomorphicStrings205.optimizedIsIsomorphic("badc", "baba")).isEqualTo(false);
    }
}
