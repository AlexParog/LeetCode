package org.parog.algo_roadmap.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link LengthOfLastWord58}
 */
public class LengthOfLastWord58Test {
    @Test
    void LengthOfLastWord58Test1() {
        assertThat(LengthOfLastWord58.lengthOfLastWord("Hello World")).isEqualTo(5);
    }

    @Test
    void LengthOfLastWord58Test2() {
        assertThat(LengthOfLastWord58.lengthOfLastWord("   fly   me   to  the moon")).isEqualTo(4);
    }

    @Test
    void LengthOfLastWord58Test3() {
        assertThat(LengthOfLastWord58.lengthOfLastWord("luffy is still joyboy")).isEqualTo(6);
    }

    @Test
    void LengthOfLastWord58Test4() {
        assertThat(LengthOfLastWord58.lengthOfLastWord("h")).isEqualTo(1);
    }

    @Test
    void LengthOfLastWord58Test5() {
        assertThat(LengthOfLastWord58.lengthOfLastWord("      h       ")).isEqualTo(1);
    }
}
