package org.parog.algo_roadmap.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link IntersectionOfTwoArraysII350}
 */
public class IntersectionOfTwoArraysII350Test {

    @Test
    void IntersectionOfTwoArraysII350Test1() {
        assertThat(IntersectionOfTwoArraysII350.intersectWithHashMap(new int[]{1, 2, 2, 1}, new int[]{2, 2}))
                .isEqualTo(new int[]{2, 2});
    }

    @Test
    void IntersectionOfTwoArraysII350Test2() {
        assertThat(IntersectionOfTwoArraysII350.intersectWithHashMap(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}))
                .isEqualTo(new int[]{9, 4});
    }

    @Test
    void IntersectionOfTwoArraysII350Test5() {
        assertThat(IntersectionOfTwoArraysII350
                .intersectWithHashMap(new int[]{4, 9, 5, 10, 10, 12, 13, 1000}, new int[]{9, 8, 4, 1000, 10, 10}))
                .isEqualTo(new int[]{4, 9, 10, 10, 1000});
    }

}
