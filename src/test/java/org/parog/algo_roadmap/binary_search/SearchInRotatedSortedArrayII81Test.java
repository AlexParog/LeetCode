package org.parog.algo_roadmap.binary_search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link SearchInRotatedSortedArrayII81Test}
 */
public class SearchInRotatedSortedArrayII81Test {

    @Test
    void SearchInRotatedSortedArray33Test1() {
        assertThat(SearchInRotatedSortedArrayII81.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0)).isEqualTo(true);
    }

    @Test
    void SearchInRotatedSortedArray33Test2() {
        assertThat(SearchInRotatedSortedArrayII81.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3)).isEqualTo(false);
    }

    @Test
    void SearchInRotatedSortedArray33Test3() {
        assertThat(SearchInRotatedSortedArrayII81.search(new int[]{1, 0, 1, 1, 1}, 0)).isEqualTo(true);
    }
}
