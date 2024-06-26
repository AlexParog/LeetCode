package org.parog.algo_roadmap.stack_and_queue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link NumberOfStudentsUnableToEatLunch1700}
 */
public class NumberOfStudentsUnableToEatLunch1700Test {
    @Test
    void NumberOfStudentsUnableToEatLunch1700Test1() {
        assertThat(NumberOfStudentsUnableToEatLunch1700
                .countStudentsWithQueue(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1}))
                .isEqualTo(0);
    }

    @Test
    void NumberOfStudentsUnableToEatLunch1700Test2() {
        assertThat(NumberOfStudentsUnableToEatLunch1700
                .countStudentsWithQueue(new int[]{1, 1, 1, 0, 0, 1}, new int[]{1, 0, 0, 0, 1, 1}))
                .isEqualTo(3);
    }

    @Test
    void NumberOfStudentsUnableToEatLunch1700Test3() {
        assertThat(NumberOfStudentsUnableToEatLunch1700
                .countStudentsWithQueue(new int[]{1, 1, 1, 1}, new int[]{0, 1, 1, 1}))
                .isEqualTo(4);
    }

    @Test
    void NumberOfStudentsUnableToEatLunch1700Test4() {
        assertThat(NumberOfStudentsUnableToEatLunch1700
                .countStudentsWithQueue(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 0}))
                .isEqualTo(1);
    }
}
