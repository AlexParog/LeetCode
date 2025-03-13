package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link SubarraySumEqualsK560}
 */
public class SubarraySumEqualsK560Test {
    @Test
    void SubarraySumEqualsK560Test1() {
        assertThat(SubarraySumEqualsK560.subarraySum(new int[]{1, 1, 1, 1, 2, 3}, 1))
                .isEqualTo(4);
    }

    @Test
    void SubarraySumEqualsK560Test2() {
        assertThat(SubarraySumEqualsK560.subarraySum(new int[]{3, 2, 2, 3}, 3))
                .isEqualTo(2);
    }

    // проверить тест, ответ 3 или 4
    @Test
    void SubarraySumEqualsK560Test3() {
        assertThat(SubarraySumEqualsK560.subarraySum(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 5))
                .isEqualTo(3);
    }

    @Test
    void SubarraySumEqualsK560Test4() {
        assertThat(SubarraySumEqualsK560.subarraySum(new int[]{1, 1, 1}, 2))
                .isEqualTo(2);
    }

    @Test
    void SubarraySumEqualsK560Test5() {
        assertThat(SubarraySumEqualsK560.subarraySum(new int[]{1}, 1))
                .isEqualTo(1);
    }

    @Test
    void SubarraySumEqualsK560Test6() {
        assertThat(SubarraySumEqualsK560.subarraySum(new int[]{1,2,3}, 3))
                .isEqualTo(2);
    }

    @Test
    void SubarraySumEqualsK560Test7() {
        assertThat(SubarraySumEqualsK560.subarraySum(new int[]{1,2,3}, 3))
                .isEqualTo(2);
    }
}
