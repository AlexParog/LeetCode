package org.parog.algo_roadmap.binary_search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link SearchInRotatedSortedArray33}
 */
public class SearchInRotatedSortedArray33Test {

    @Test
    void SearchInRotatedSortedArray33Test1() {
        assertThat(SearchInRotatedSortedArray33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0)).isEqualTo(4);
    }

    @Test
    void SearchInRotatedSortedArray33Test2() {
        assertThat(SearchInRotatedSortedArray33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3)).isEqualTo(-1);
    }

    @Test
    void SearchInRotatedSortedArray33Test3() {
        assertThat(SearchInRotatedSortedArray33.search(new int[]{1}, 0)).isEqualTo(-1);
    }
}
