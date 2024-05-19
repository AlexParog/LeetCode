package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link ContainsDuplicate217}
 */
public class ContainsDuplicate217Test {

    @Test
    void ContainsDuplicate217Test1() {
        assertThat(ContainsDuplicate217.containsDuplicateWithSet(new int[]{1, 2, 3}))
                .isEqualTo(false);
    }

    @Test
    void ContainsDuplicate217Test2() {
        assertThat(ContainsDuplicate217.containsDuplicateWithMap(new int[]{1, 2, 3, 1}))
                .isEqualTo(true);
    }

    @Test
    void ContainsDuplicate217Test3() {
        assertThat(ContainsDuplicate217.containsDuplicateWithMap(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}))
                .isEqualTo(true);
    }
}
