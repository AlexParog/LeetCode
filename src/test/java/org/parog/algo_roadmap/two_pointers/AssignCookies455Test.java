package org.parog.algo_roadmap.two_pointers;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link AssignCookies455}
 */
public class AssignCookies455Test {
    @Test
    void AssignCookies455Test1() {
        assertThat(AssignCookies455.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}))
                .isEqualTo(1);
    }

    @Test
    void AssignCookies455Test2() {
        assertThat(AssignCookies455.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}))
                .isEqualTo(2);
    }

    @Test
    void AssignCookies455Test3() {
        assertThat(AssignCookies455.findContentChildren(new int[]{1, 2}, new int[]{}))
                .isEqualTo(0);
    }

    @Test
    void AssignCookies455Test4() {
        assertThat(AssignCookies455.findContentChildren(new int[]{10, 9, 8, 7}, new int[]{5, 6, 7, 8}))
                .isEqualTo(2);
    }
}
