package org.parog.algo_roadmap.two_pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link IntersectionOfTwoArrays349}
 */
public class IntersectionOfTwoArrays349Test {
    @Test
    void IntersectionOfTwoArrays349Test1() {
        assertThat(IntersectionOfTwoArrays349.intersectionHashSet(new int[]{1, 2, 2, 1}, new int[]{2, 2}))
                .isEqualTo(new int[]{2});
    }

    @Test
    void IntersectionOfTwoArrays349Test2() {
        assertThat(IntersectionOfTwoArrays349.intersectionHashSet(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}))
                .isEqualTo(new int[]{9, 4});
    }

    @Test
    void IntersectionOfTwoArrays349Test3() {
        assertThat(IntersectionOfTwoArrays349
                .intersectionHashSetFunctionalStyle(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}))
                .isEqualTo(new int[]{9, 4});
    }

    @Test
    void IntersectionOfTwoArrays349Test4() {
        assertThat(IntersectionOfTwoArrays349
                .intersectionTwoPointers(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}))
                .isEqualTo(new int[]{4, 9});
    }

    @Test
    void IntersectionOfTwoArrays349Test5() {
        assertThat(IntersectionOfTwoArrays349
                .intersectionTwoPointers(new int[]{4, 9, 5, 10, 10, 12, 13, 1000}, new int[]{9, 8, 4, 1000, 10, 10}))
                .isEqualTo(new int[]{4, 9, 10, 1000});
    }
}
