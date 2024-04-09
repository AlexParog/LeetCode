package org.parog.algo_roadmap.binary_search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link SearchA2DMatrix74}
 */
public class SearchA2DMatrix74Test {
    @Test
    void SearchA2DMatrix74Test1() {
        assertThat(SearchA2DMatrix74.searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}}, 3)).isEqualTo(true);
    }

    @Test
    void SearchA2DMatrix74Test2() {
        assertThat(SearchA2DMatrix74.searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}}, 13)).isEqualTo(false);
    }

    @Test
    void SearchA2DMatrix74Test3() {
        assertThat(SearchA2DMatrix74.searchMatrix(new int[][]{
                {1}}, 0)).isEqualTo(false);
    }

    @Test
    void SearchA2DMatrix74Test4() {
        assertThat(SearchA2DMatrix74.searchMatrix(new int[][]{
                {1}, {2}, {3}}, 3)).isEqualTo(true);
    }
}
