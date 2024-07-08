package org.parog.algo_roadmap.yandex75;

import org.junit.jupiter.api.Test;
import org.parog.yandex75.ReverseInteger7;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тесты для решения задачи {@link ReverseInteger7}
 */
public class ReverseInteger7Test {
    @Test
    void ReverseInteger7Test1() {
        assertThat(ReverseInteger7.reverse(123))
                .isEqualTo(321);
    }

    @Test
    void ReverseInteger7Test2() {
        assertThat(ReverseInteger7.reverse(-123))
                .isEqualTo(-321);
    }


    @Test
    void ReverseInteger7Test3() {
        assertThat(ReverseInteger7.reverse(120))
                .isEqualTo(21);
    }

    @Test
    void ReverseInteger7Test4() {
        assertThat(ReverseInteger7.reverse(2_147_483_647))
                .isEqualTo(0);
    }

    @Test
    void ReverseInteger7Test5() {
        assertThat(ReverseInteger7.reverse(-2_147_483_648))
                .isEqualTo(0);
    }
}
