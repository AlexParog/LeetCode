package yandex75;

import org.junit.jupiter.api.Test;
import org.parog.yandex75.LineReflection356;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link org.parog.yandex75.LineReflection356}
 */
public class LineReflection356Test {
    @Test
    void LineReflection356Test1() {
        assertThat(LineReflection356.isReflected(new int[][]{
                {1, 1},
                {-1, 1}})).isEqualTo(true);
    }

    @Test
    void LineReflection356Test2() {
        assertThat(LineReflection356.isReflected(new int[][]{
                {1, 1},
                {-1, -1}})).isEqualTo(false);
    }

    @Test
    void LineReflection356Test3() {
        assertThat(LineReflection356.isReflected(new int[][]{
                {2, 2},
                {-2, 2},
                {1, -4},
                {-1, -4}})).isEqualTo(true);
    }
}
