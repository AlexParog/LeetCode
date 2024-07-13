package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link RangeSumQuery2DImmutable304}
 */
public class RangeSumQuery2DImmutable304Test {

    @Test
    void FindPivotIndex724Test1() {
        final int[][] matrix = new int[][]{
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        RangeSumQuery2DImmutable304 numMatrix = new RangeSumQuery2DImmutable304(matrix);

        assertThat(numMatrix.sumRegion(2, 1, 4, 3)).isEqualTo(8);
        assertThat(numMatrix.sumRegion(1, 1, 2, 2)).isEqualTo(11);
        assertThat(numMatrix.sumRegion(1, 2, 2, 4)).isEqualTo(12);
    }

    @Test
    void FindPivotIndex724Test2() {
        final int[][] matrix = new int[][]{
                {-4,-5}
        };
        RangeSumQuery2DImmutable304 numMatrix = new RangeSumQuery2DImmutable304(matrix);

        assertThat(numMatrix.sumRegion(0,0,0,0)).isEqualTo(-4);
        assertThat(numMatrix.sumRegion(0,0,0,1)).isEqualTo(-9);
        assertThat(numMatrix.sumRegion(0,1,0,1)).isEqualTo(-5);
    }

    @Test
    void FindPivotIndex724Test3() {
        final int[][] matrix = new int[][]{
                {1},
                {-7}
        };
        RangeSumQuery2DImmutable304 numMatrix = new RangeSumQuery2DImmutable304(matrix);

        assertThat(numMatrix.sumRegion(0,0,0,0)).isEqualTo(1);
        assertThat(numMatrix.sumRegion(1,0,1,0)).isEqualTo(-7);
        assertThat(numMatrix.sumRegion(0,0,1,0)).isEqualTo(-6);
    }

    @Test
    void FindPivotIndex724Test4() {
        final int[][] matrix = new int[][]{
                {-4,-5}
        };
        RangeSumQuery2DImmutable304 numMatrix = new RangeSumQuery2DImmutable304(matrix);

        assertThat(numMatrix.sumRegion(0,0,0,0)).isEqualTo(-4);
        assertThat(numMatrix.sumRegion(0,0,0,1)).isEqualTo(-9);
        assertThat(numMatrix.sumRegion(0,1,0,1)).isEqualTo(-5);
    }

}
