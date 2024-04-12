package org.parog.algo_roadmap.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegerToRoman12Test {
    @Test
    void RomanToInteger13Test1() {
        assertThat(IntegerToRoman12.intToRoman(3)).isEqualTo("III");
    }

    @Test
    void RomanToInteger13Test2() {
        assertThat(IntegerToRoman12.intToRoman(58)).isEqualTo("LVIII");
    }

    @Test
    void RomanToInteger13Test3() {
        assertThat(IntegerToRoman12.intToRoman(1994)).isEqualTo("MCMXCIV");
    }

    @Test
    void RomanToInteger13Test4() {
        assertThat(IntegerToRoman12.intToRoman(3549)).isEqualTo("MMMDXLIX");
    }
}
