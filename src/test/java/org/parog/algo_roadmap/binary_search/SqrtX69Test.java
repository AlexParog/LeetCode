package org.parog.algo_roadmap.binary_search;

import org.junit.jupiter.api.Test;
import org.parog.algo_roadmap.binary_search.SqrtX69;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link SqrtX69}
 */
public class SqrtX69Test {
    @Test
    void SqrtX69Test1() {
        assertThat(SqrtX69.mySqrt( 4)).isEqualTo(2);
    }

    @Test
    void SqrtX69Test2() {
        assertThat(SqrtX69.mySqrt( 8)).isEqualTo(2);
    }

    @Test
    void SqrtX69Test3() {
        assertThat(SqrtX69.mySqrt( 0)).isEqualTo(0);
    }
}
