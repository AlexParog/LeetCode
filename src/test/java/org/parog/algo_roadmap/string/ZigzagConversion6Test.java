package org.parog.algo_roadmap.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link ZigzagConversion6}
 */
public class ZigzagConversion6Test {
    @Test
    void ZigzagConversion6Test1() {
        assertThat(ZigzagConversion6.convertV2("PAYPALISHIRING", 3))
                .isEqualTo("PAHNAPLSIIGYIR");
    }

    @Test
    void ZigzagConversion6Test2() {
        assertThat(ZigzagConversion6.convert("PAYPALISHIRING", 4))
                .isEqualTo("PINALSIGYAHRPI");
    }

    @Test
    void ZigzagConversion6Test3() {
        assertThat(ZigzagConversion6.convert("PAYPALISHIRING", 20))
                .isEqualTo("PAYPALISHIRING");
    }
}
