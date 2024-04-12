package org.parog.algo_roadmap.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanToInteger13Test {
    @Test
    void RomanToInteger13Test1() {
        assertThat(RomanToInteger13.romanToInt("III")).isEqualTo(3);
    }

    @Test
    void RomanToInteger13Test2() {
        assertThat(RomanToInteger13.romanToInt("LVIII")).isEqualTo(58);
    }

    @Test
    void RomanToInteger13Test3() {
        assertThat(RomanToInteger13.romanToInt("MCMXCIV")).isEqualTo(1994);
    }
}
