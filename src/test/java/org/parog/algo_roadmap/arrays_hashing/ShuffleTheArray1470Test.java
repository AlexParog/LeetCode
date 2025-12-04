package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link ShuffleTheArray1470}
 */
public class ShuffleTheArray1470Test {
    @Test
    void ShuffleTheArray1470Test1() {
        assertThat(ShuffleTheArray1470.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3))
                .isEqualTo(new int[]{2, 3, 5, 4, 1, 7});
    }

    @Test
    void ShuffleTheArray1470Test2() {
        assertThat(ShuffleTheArray1470.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4))
                .isEqualTo(new int[]{1, 4, 2, 3, 3, 2, 4, 1});
    }

    @Test
    void ShuffleTheArray1470Test3() {
        assertThat(ShuffleTheArray1470.shuffle(new int[]{1, 1, 2, 2}, 2))
                .isEqualTo(new int[]{1, 2, 1, 2});
    }
}
