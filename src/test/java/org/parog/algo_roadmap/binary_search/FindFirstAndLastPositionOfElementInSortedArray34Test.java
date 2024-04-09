package org.parog.algo_roadmap.binary_search;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link FindFirstAndLastPositionOfElementInSortedArray34}.
 */
public class FindFirstAndLastPositionOfElementInSortedArray34Test {

    @Test
    void FindFirstAndLastPositionOfElementInSortedArray34Test1() {
        assertThat(FindFirstAndLastPositionOfElementInSortedArray34.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8))
                .isEqualTo(new int[]{3, 4});
    }

    @Test
    void FindFirstAndLastPositionOfElementInSortedArray34Test2() {
        assertThat(FindFirstAndLastPositionOfElementInSortedArray34.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 7))
                .isEqualTo(new int[]{1, 2});
    }

    @Test
    void FindFirstAndLastPositionOfElementInSortedArray34Test3() {
        assertThat(FindFirstAndLastPositionOfElementInSortedArray34.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6))
                .isEqualTo(new int[]{-1, -1});
    }

    @Test
    void FindFirstAndLastPositionOfElementInSortedArray34Test4() {
        assertThat(FindFirstAndLastPositionOfElementInSortedArray34.searchRange(new int[]{}, 0))
                .isEqualTo(new int[]{-1, -1});
    }

    @Test
    void FindFirstAndLastPositionOfElementInSortedArray34Test5() {
        assertThat(FindFirstAndLastPositionOfElementInSortedArray34.searchRange(new int[]{5, 5, 7, 8, 9, 10}, 5))
                .isEqualTo(new int[]{0, 1});
    }

    @Test
    void FindFirstAndLastPositionOfElementInSortedArray34Test6() {
        assertThat(FindFirstAndLastPositionOfElementInSortedArray34.searchRange(new int[]{5, 7, 8, 9, 10, 10}, 10))
                .isEqualTo(new int[]{4, 5});
    }

    @Test
    void FindFirstAndLastPositionOfElementInSortedArray34Test7() {
        assertThat(FindFirstAndLastPositionOfElementInSortedArray34.searchRange(new int[]{1}, 1))
                .isEqualTo(new int[]{0, 0});
    }

    @Test
    void FindFirstAndLastPositionOfElementInSortedArray34Test8() {
        assertThat(FindFirstAndLastPositionOfElementInSortedArray34.searchRange(new int[]{1, 3}, 1))
                .isEqualTo(new int[]{0, 0});
    }
}
