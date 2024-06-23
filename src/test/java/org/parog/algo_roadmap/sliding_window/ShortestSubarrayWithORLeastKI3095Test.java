package org.parog.algo_roadmap.sliding_window;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link ShortestSubarrayWithORLeastK_I3095}
 */
public class ShortestSubarrayWithORLeastKI3095Test {
    @Test
    void ShortestSubarrayWithORLeastK_I3095Test1() {
        assertThat(ShortestSubarrayWithORLeastK_I3095.minimumSubarrayLength(new int[]{1, 2, 3}, 2))
                .isEqualTo(1);
    }

    @Test
    void ShortestSubarrayWithORLeastK_I3095Test2() {
        assertThat(ShortestSubarrayWithORLeastK_I3095.minimumSubarrayLength(new int[]{2, 1, 8}, 10))
                .isEqualTo(3);
    }

    @Test
    void ShortestSubarrayWithORLeastK_I3095Test3() {
        assertThat(ShortestSubarrayWithORLeastK_I3095.minimumSubarrayLength(new int[]{1, 2}, 0))
                .isEqualTo(1);
    }

    // TODO: Wrong Answer 659 / 834 testcases passed
    @Test
    void ShortestSubarrayWithORLeastK_I3095Test5() {
        assertThat(ShortestSubarrayWithORLeastK_I3095.minimumSubarrayLength(new int[]{16, 1, 2, 20, 32}, 45))
                .isEqualTo(2);
    }
}
