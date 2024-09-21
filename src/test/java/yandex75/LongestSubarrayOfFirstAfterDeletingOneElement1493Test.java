package yandex75;

import org.junit.jupiter.api.Test;
import org.parog.yandex75.LongestSubarrayOfFirstAfterDeletingOneElement1493;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link org.parog.yandex75.LongestSubarrayOfFirstAfterDeletingOneElement1493}
 */
public class LongestSubarrayOfFirstAfterDeletingOneElement1493Test {
    @Test
    void LongestSubarrayOfFirstAfterDeletingOneElement1493Test1() {
        assertThat(LongestSubarrayOfFirstAfterDeletingOneElement1493.longestSubarrayWithSlidingWindow(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}))
                .isEqualTo(5);
    }

    @Test
    void LongestSubarrayOfFirstAfterDeletingOneElement1493Test2() {
        assertThat(LongestSubarrayOfFirstAfterDeletingOneElement1493.longestSubarrayWithSlidingWindow(new int[]{1, 1, 0, 1}))
                .isEqualTo(3);
    }

    @Test
    void LongestSubarrayOfFirstAfterDeletingOneElement1493Test3() {
        assertThat(LongestSubarrayOfFirstAfterDeletingOneElement1493.longestSubarrayWithSlidingWindow(new int[]{1, 1, 1}))
                .isEqualTo(2);
    }
}
