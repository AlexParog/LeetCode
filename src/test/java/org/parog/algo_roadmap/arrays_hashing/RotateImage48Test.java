package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link RotateImage48}
 */
public class RotateImage48Test {
    @Test
    void RotateImage48Test1() {
        assertThat(RotateImage48.rotate(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}})).isEqualTo(new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}});
    }

    @Test
    void RotateImage48Test2() {
        assertThat(RotateImage48.rotate(new int[][]{
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}})).isEqualTo(new int[][]{
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}});
    }

    @Test
    void RotateImage48Test3() {
        assertThat(RotateImage48.rotate(new int[][]{
                {1}})).isEqualTo(new int[][]{{1}});
    }
}
