package org.parog;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link GuessNumberHigherOrLower374}
 */
public class GuessNumberHigherOrLower374Test {

    @Test
    void GuessNumberHigherOrLower374Test1() {
        assertThat(GuessNumberHigherOrLower374.guessNumber( 10)).isEqualTo(6);
    }

    @Test
    void GuessNumberHigherOrLower374Test2() {
        assertThat(GuessNumberHigherOrLower374.guessNumber( 10)).isEqualTo(1);
    }
}
