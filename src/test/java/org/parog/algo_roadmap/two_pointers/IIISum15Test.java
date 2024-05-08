package org.parog.algo_roadmap.two_pointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link IIISum15}
 */
public class IIISum15Test {
    @Test
    void IIISum15Test1() {
        assertThat(IIISum15.threeSum(new int[]{1, 2, 3}))
                .isEqualTo(List.of());
    }

    @Test
    void IIISum15Test2() {
        assertThat(IIISum15.threeSum(new int[]{-1, 0, 1}))
                .isEqualTo(List.of(Arrays.asList(-1, 0, 1)));
    }

    @Test
    void IIISum15Test3() {
        assertThat(IIISum15.threeSum(new int[]{0, 0, 0}))
                .isEqualTo(List.of(Arrays.asList(0, 0, 0)));
    }

    @Test
    void IIISum15Test4() {
        assertThat(IIISum15.threeSum(new int[]{-1, 0, 1, 1}))
                .isEqualTo(List.of(Arrays.asList(-1, 0, 1)));
    }

    @Test
    void IIISum15Test5() {
        assertThat(IIISum15.threeSum(new int[]{-2, 0, 1, 1, 2}))
                .isEqualTo(List.of(Arrays.asList(-2, 0, 2), Arrays.asList(-2, 1, 1)));
    }

    @Test
    void IIISum15Test6() {
        assertThat(IIISum15.threeSum(new int[]{-100000, -100000, 0, 100000, 100000}))
                .isEqualTo(List.of(Arrays.asList(-100000, 0, 100000)));
    }
}
