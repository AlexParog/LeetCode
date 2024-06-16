package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link MostCommonWord819}
 */
public class MostCommonWord819Test {
    @Test
    void MostCommonWord819Test1() {
        assertThat(MostCommonWord819.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",
                new String[]{"hit"})).isEqualTo("ball");
    }

    @Test
    void MostCommonWord819Test2() {
        assertThat(MostCommonWord819.mostCommonWord("a.",
                new String[]{""})).isEqualTo("a");
    }
}
