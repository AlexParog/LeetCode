package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для {@link ConcatenationOfArray1929}
 */
public class ConcatenationOfArray1929Test {

    @Test
    void ConcatenationOfArray1929Test1() {
        assertThat(ConcatenationOfArray1929.getConcatenation(new int[]{1, 2, 3}))
                .isEqualTo(new int[]{1, 2, 3, 1, 2, 3});
    }

    @Test
    void ConcatenationOfArray1929Test2() {
        assertThat(ConcatenationOfArray1929.getConcatenation(new int[]{1, 2, 3, 1}))
                .isEqualTo(new int[]{1, 2, 3, 1, 1, 2, 3, 1});
    }

    @Test
    void ConcatenationOfArray1929Test3() {
        assertThat(ConcatenationOfArray1929.getConcatenation(new int[]{1}))
                .isEqualTo(new int[]{1, 1});
    }
}
