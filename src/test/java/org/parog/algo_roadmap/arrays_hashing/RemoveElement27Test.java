package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link RemoveElement27}
 */
public class RemoveElement27Test {

    @Test
    void RemoveElement27Test1() {
        assertThat(RemoveElement27.removeElement(new int[]{1, 1, 1, 1, 2, 3}, 1))
                .isEqualTo(2);
    }

    @Test
    void RemoveElement27Test2() {
        assertThat(RemoveElement27.removeElement(new int[]{3, 2, 2, 3}, 3))
                .isEqualTo(2);
    }

    @Test
    void RemoveElement27Test3() {
        assertThat(RemoveElement27.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2))
                .isEqualTo(5);
    }
}
