package org.parog.algo_roadmap.stack_and_queue;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link BuildArrayWithStackOperations1441}
 */
public class BuildArrayWithStackOperations1441Test {
    @Test
    void buildArrayWithStackOperations1441Test1() {
        assertThat(BuildArrayWithStackOperations1441.buildArray(new int[]{1, 3}, 3))
                .isEqualTo(List.of("Push", "Push", "Pop", "Push"));
    }

    @Test
    void buildArrayWithStackOperations1441Test2() {
        assertThat(BuildArrayWithStackOperations1441.buildArray(new int[]{1, 2, 3}, 3))
                .isEqualTo(List.of("Push", "Push", "Push"));
    }

    @Test
    void buildArrayWithStackOperations1441Test3() {
        assertThat(BuildArrayWithStackOperations1441.buildArray(new int[]{1, 2}, 4))
                .isEqualTo(List.of("Push", "Push"));
    }

    @Test
    void buildArrayWithStackOperations1441Test4() {
        assertThat(BuildArrayWithStackOperations1441.buildArray(new int[]{1}, 1))
                .isEqualTo(List.of("Push"));
    }

    @Test
    void buildArrayWithStackOperations1441Test5() {
        assertThat(BuildArrayWithStackOperations1441.buildArray(new int[]{5}, 5))
                .isEqualTo(List.of("Push", "Pop", "Push", "Pop", "Push", "Pop", "Push", "Pop", "Push"));
    }

}
