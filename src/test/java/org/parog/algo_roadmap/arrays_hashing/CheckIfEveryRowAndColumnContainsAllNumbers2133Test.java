package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link CheckIfEveryRowAndColumnContainsAllNumbers2133}
 */
public class CheckIfEveryRowAndColumnContainsAllNumbers2133Test {
    @Test
    void CheckIfEveryRowAndColumnContainsAllNumbers2133Test1() {
        assertThat(CheckIfEveryRowAndColumnContainsAllNumbers2133.checkValidWithMatrixRotation(new int[][]{
                {1, 2, 3},
                {3, 1, 2},
                {2, 3, 1}})).isEqualTo(true);
    }

    @Test
    void CheckIfEveryRowAndColumnContainsAllNumbers2133Test2() {
        assertThat(CheckIfEveryRowAndColumnContainsAllNumbers2133.checkValidWithMatrixRotation(new int[][]{
                {1, 1, 1},
                {1, 2, 3},
                {1, 2, 3}})).isEqualTo(false);
    }

    @Test
    void CheckIfEveryRowAndColumnContainsAllNumbers2133Test3() {
        assertThat(CheckIfEveryRowAndColumnContainsAllNumbers2133.checkValidWithMatrixRotation(new int[][]{
                {1, 2, 3},
                {1, 3, 2},
                {3, 2, 1}})).isEqualTo(false);
    }
}
