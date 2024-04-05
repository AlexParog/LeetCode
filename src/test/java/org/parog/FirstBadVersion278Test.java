package org.parog;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link FirstBadVersion278}.
 */
public class FirstBadVersion278Test {
    @Test
    void FirstBadVersion278Test1() {
        assertThat(FirstBadVersion278.firstBadVersion( 5)).isEqualTo(4);
    }
}
