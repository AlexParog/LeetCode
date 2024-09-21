package yandex75;

import org.junit.jupiter.api.Test;
import org.parog.yandex75.MaxConsecutiveOnes485;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link MaxConsecutiveOnes485}
 */
public class MaxConsecutiveOnes485Test {
    @Test
    void MaxConsecutiveOnes485Test1() {
        assertThat(MaxConsecutiveOnes485.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}))
                .isEqualTo(3);
    }

    @Test
    void MaxConsecutiveOnes485Test2() {
        assertThat(MaxConsecutiveOnes485.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1, 1, 1}))
                .isEqualTo(3);
    }

    @Test
    void MaxConsecutiveOnes485Test3() {
        assertThat(MaxConsecutiveOnes485.findMaxConsecutiveOnes(new int[]{1}))
                .isEqualTo(1);
    }

    @Test
    void MaxConsecutiveOnes485Test4() {
        assertThat(MaxConsecutiveOnes485.findMaxConsecutiveOnes(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}))
                .isEqualTo(10);
    }
}
