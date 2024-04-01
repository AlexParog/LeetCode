package org.parog;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link ValidPerfectSquare367}
 */
public class ValidPerfectSquare367Test {

    @Test
    void ValidPerfectSquareTest1() {
        assertThat(ValidPerfectSquare367.isPerfectSquare(9)).isEqualTo(true);
    }

    @Test
    void ValidPerfectSquareTest2() {
        assertThat(ValidPerfectSquare367.isPerfectSquare(14)).isEqualTo(false);
    }

    @Test
    void ValidPerfectSquareTest3() {
        assertThat(ValidPerfectSquare367.isPerfectSquare(1)).isEqualTo(true);
    }
}
