package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link HowManyNumbersAreSmallerThanTheCurrentNumber1365}
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber1365Test {

    @Test
    void HowManyNumbersAreSmallerThanTheCurrentNumber1365Test1() {
        assertThat(HowManyNumbersAreSmallerThanTheCurrentNumber1365.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}))
                .isEqualTo(new int[]{4, 0, 1, 1, 3});
    }

    @Test
    void HowManyNumbersAreSmallerThanTheCurrentNumber1365Test2() {
        assertThat(HowManyNumbersAreSmallerThanTheCurrentNumber1365.smallerNumbersThanCurrent(new int[]{6, 5, 4, 8}))
                .isEqualTo(new int[]{2, 1, 0, 3});
    }

    @Test
    void HowManyNumbersAreSmallerThanTheCurrentNumber1365Test3() {
        assertThat(HowManyNumbersAreSmallerThanTheCurrentNumber1365.smallerNumbersThanCurrent(new int[]{7, 7, 7, 7}))
                .isEqualTo(new int[]{0, 0, 0, 0});
    }
}
