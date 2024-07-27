package org.parog.algo_roadmap.yandex75;

import org.junit.jupiter.api.Test;
import org.parog.yandex75.SummaryRanges228;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link org.parog.yandex75.SummaryRanges228}
 */
public class SummaryRanges228Test {
    @Test
    void SummaryRanges228Test1() {
        assertThat(SummaryRanges228.summaryRangesWithStringBuilder(new int[]{0, 1, 2, 4, 5, 7}))
                .isEqualTo(List.of("0->2", "4->5", "7"));
    }

    @Test
    void SummaryRanges228Test2() {
        assertThat(SummaryRanges228.summaryRangesWithStringBuilder(new int[]{0, 2, 3, 4, 6, 8, 9}))
                .isEqualTo(List.of("0", "2->4", "6", "8->9"));
    }

    @Test
    void SummaryRanges228Test3() {
        assertThat(SummaryRanges228.summaryRangesWithStringBuilder(new int[]{0, 9}))
                .isEqualTo(List.of("0", "9"));
    }

    @Test
    void SummaryRanges228Test4() {
        assertThat(SummaryRanges228.summaryRangesWithStringBuilder(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}))
                .isEqualTo(List.of("0->9"));
    }
}
