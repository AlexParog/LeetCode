package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link FormSmallestNumberFromTwoDigitArrays2605}
 */
public class FormSmallestNumberFromTwoDigitArrays2605Test {
    @Test
    void FormSmallestNumberFromTwoDigitArrays2605Test1() {
        assertThat(FormSmallestNumberFromTwoDigitArrays2605
                .optimizedMinNumber(new int[]{4, 1, 3}, new int[]{5, 7}))
                .isEqualTo(15);
    }

    @Test
    void FormSmallestNumberFromTwoDigitArrays2605Test2() {
        assertThat(FormSmallestNumberFromTwoDigitArrays2605
                .minNumber(new int[]{3, 5, 2, 6}, new int[]{3, 1, 7}))
                .isEqualTo(3);
    }

    @Test
    void FormSmallestNumberFromTwoDigitArrays2605Test3() {
        assertThat(FormSmallestNumberFromTwoDigitArrays2605
                .optimizedMinNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}))
                .isEqualTo(1);
    }
}
