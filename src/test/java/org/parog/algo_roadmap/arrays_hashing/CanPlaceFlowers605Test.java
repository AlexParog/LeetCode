package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link CanPlaceFlowers605}
 */
public class CanPlaceFlowers605Test {

    @Test
    void CanPlaceFlowers605Test1() {
        assertThat(CanPlaceFlowers605.canPlaceFlowers(new int[] {1,0,0,0,1}, 1)).isEqualTo(true);
    }

    @Test
    void CanPlaceFlowers605Test2() {
        assertThat(CanPlaceFlowers605.canPlaceFlowers(new int[] {1,0,0,0,1}, 2)).isEqualTo(false);
    }

    @Test
    void CanPlaceFlowers605Test3() {
        assertThat(CanPlaceFlowers605.canPlaceFlowers(new int[] {1,1}, 1)).isEqualTo(false);
    }

    @Test
    void CanPlaceFlowers605Test4() {
        assertThat(CanPlaceFlowers605.canPlaceFlowers(new int[] {1,0}, 1)).isEqualTo(false);
    }

    @Test
    void CanPlaceFlowers605Test5() {
        assertThat(CanPlaceFlowers605.canPlaceFlowers(new int[] {0,0,0}, 1)).isEqualTo(true);
    }

    @Test
    void CanPlaceFlowers605Test6() {
        assertThat(CanPlaceFlowers605.canPlaceFlowers(new int[] {0,1}, 1)).isEqualTo(false);
    }

    @Test
    void CanPlaceFlowers605Test7() {
        assertThat(CanPlaceFlowers605.canPlaceFlowers(new int[] {0,0,1,0,0}, 2)).isEqualTo(true);
    }
}
