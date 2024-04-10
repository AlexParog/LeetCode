package org.parog.algo_roadmap.binary_search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link SearchA2DMatrixII240}
 */
public class SearchA2DMatrixII240Test {
    @Test
    void SearchA2DMatrixII240Test1() {
        assertThat(SearchA2DMatrixII240.searchMatrixV2(new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}}, 5)).isEqualTo(true);

    }

    @Test
    void SearchA2DMatrixII240Test2() {
        assertThat(SearchA2DMatrixII240.searchMatrix(new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}}, 20)).isEqualTo(false);

    }
}
