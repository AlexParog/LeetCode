package org.parog.algo_roadmap.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link ReverseWordsInString151}
 */
public class ReverseWordsInString151Test {

    @Test
    void ReverseWordsInString151Test1() {
        assertThat(ReverseWordsInString151.reverseWordsV2("the sky is blue")).isEqualTo("blue is sky the");
    }

    @Test
    void ReverseWordsInString151Test2() {
        assertThat(ReverseWordsInString151.reverseWordsV2("  hello world  ")).isEqualTo("world hello");
    }

    @Test
    void ReverseWordsInString151Test3() {
        assertThat(ReverseWordsInString151.reverseWordsV2("a good   example")).isEqualTo("example good a");
    }
}
