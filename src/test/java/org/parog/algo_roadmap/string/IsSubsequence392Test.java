package org.parog.algo_roadmap.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link IsSubsequence392}
 */
public class IsSubsequence392Test {
    @Test
    void IsSubsequence392Test1() {
        assertThat(IsSubsequence392.isSubsequence("abc", "ahbgdc")).isEqualTo(true);
    }

    @Test
    void IsSubsequence392Test2() {
        assertThat(IsSubsequence392.isSubsequence("axc", "ahbgdc")).isEqualTo(false);
    }

    @Test
    void IsSubsequence392Test3() {
        assertThat(IsSubsequence392.isSubsequence("", "title")).isEqualTo(true);
    }

    @Test
    void IsSubsequence392Test4() {
        assertThat(IsSubsequence392.isSubsequence("badc", "")).isEqualTo(false);
    }

    @Test
    void IsSubsequence392Test5() {
        assertThat(IsSubsequence392.isSubsequence("", "")).isEqualTo(true);
    }


}
