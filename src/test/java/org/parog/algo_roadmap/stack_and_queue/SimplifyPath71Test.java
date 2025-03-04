package org.parog.algo_roadmap.stack_and_queue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link SimplifyPath71}
 */
public class SimplifyPath71Test {

    @Test
    void SimplifyPath71Test1() {
        assertThat(SimplifyPath71.optimizedSimplifyPath("/home/")).isEqualTo("/home");
    }

    @Test
    void SimplifyPath71Test2() {
        assertThat(SimplifyPath71.optimizedSimplifyPath("/home//foo/")).isEqualTo("/home/foo");
    }

    @Test
    void SimplifyPath71Test3() {
        assertThat(SimplifyPath71.optimizedSimplifyPath("/home/user/Documents/../Pictures"))
                .isEqualTo("/home/user/Pictures");
    }

    @Test
    void SimplifyPath71Test4() {
        assertThat(SimplifyPath71.optimizedSimplifyPath("/.../a/../b/c/../d/./")).isEqualTo("/.../b/d");
    }

    @Test
    void SimplifyPath71Test5() {
        assertThat(SimplifyPath71.optimizedSimplifyPath("/../")).isEqualTo("/");
    }
}
