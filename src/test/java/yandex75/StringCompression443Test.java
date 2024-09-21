package yandex75;

import org.junit.jupiter.api.Test;
import org.parog.yandex75.StringCompression443;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link org.parog.yandex75.StringCompression443}
 */
public class StringCompression443Test {
    @Test
    void StringCompression443Test1() {
        assertThat(StringCompression443.compressTwoPointers(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}))
                .isEqualTo(6);
    }

    @Test
    void StringCompression443Test2() {
        assertThat(StringCompression443.compressTwoPointers(new char[]{'a'}))
                .isEqualTo(1);
    }

    @Test
    void StringCompression443Test3() {
        assertThat(StringCompression443.compressTwoPointers(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}))
                .isEqualTo(4);
    }
}
