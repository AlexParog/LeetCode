package org.parog;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link SearchInsertPosition35}
 */
public class SearchInsertPosition35Test {

    @Test
    void SearchInsertPositionTest1() {
        assertThat(SearchInsertPosition35.searchInsert(new int[]{1, 3, 5, 6, 7, 10, 20, 25}, 2)).isEqualTo(1);
    }

    @Test
    void SearchInsertPositionTest2() {
        assertThat(SearchInsertPosition35.searchInsert(new int[]{1,3,5,6}, 5)).isEqualTo(2);
    }

    @Test
    void SearchInsertPositionTest3() {
        assertThat(SearchInsertPosition35.searchInsert(new int[]{1,3,5,6}, 7)).isEqualTo(4);
    }

}
