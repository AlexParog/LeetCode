package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link PaintHouse256}
 */
public class PaintHouse256Test {
    @Test
    void PaintHouse256Test1() {
        assertThat(PaintHouse256.minCost(new int[][]{
                {17, 2, 17},
                {16, 16, 5},
                {14, 3, 19}})).isEqualTo(10);
    }

    @Test
    void PaintHouse256Test2() {
        assertThat(PaintHouse256.minCost(new int[][]{
                {7, 6, 2}})).isEqualTo(2);
    }

    @Test
    void PaintHouse256Test3() {
        assertThat(PaintHouse256.minCost(new int[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}})).isEqualTo(3);
    }

    @Test
    void PaintHouse256Test4() {
        assertThat(PaintHouse256.optimizedMinCost(new int[][]{
                {17, 2, 17},
                {16, 16, 5},
                {14, 3, 19}})).isEqualTo(10);
    }

    @Test
    void PaintHouse256Test5() {
        assertThat(PaintHouse256.optimizedMinCost(new int[][]{
                {7, 6, 2}})).isEqualTo(2);
    }

    @Test
    void PaintHouse256Test6() {
        assertThat(PaintHouse256.optimizedMinCost(new int[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}})).isEqualTo(3);
    }
}
