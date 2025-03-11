package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link FindAllNumbersDisappearedInArray448}
 */
public class FindAllNumbersDisappearedInArray448Test {
    @Test
    void FindAllNumbersDisappearedInArray448Test1() {
        assertThat(FindAllNumbersDisappearedInArray448.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}))
                .isEqualTo(List.of(5, 6));
    }

    @Test
    void FindAllNumbersDisappearedInArray448Test2() {
        assertThat(FindAllNumbersDisappearedInArray448.findDisappearedNumbers(new int[]{1, 1}))
                .isEqualTo(List.of(2));
    }

    @Test
    void FindAllNumbersDisappearedInArray448Test3() {
        assertThat(FindAllNumbersDisappearedInArray448.findDisappearedNumbers(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}))
                .isEqualTo(List.of(2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
