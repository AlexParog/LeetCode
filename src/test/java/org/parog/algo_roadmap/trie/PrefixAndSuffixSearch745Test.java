package org.parog.algo_roadmap.trie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link PrefixAndSuffixSearch745}
 */
public class PrefixAndSuffixSearch745Test {

    private static final String[] WORDS = {"apple", "banana", "carrot", "bandana", "band"};
    private PrefixAndSuffixSearch745 search;

    @BeforeEach
    void init() {
        search = new PrefixAndSuffixSearch745(WORDS);
    }

    @Test
    void PrefixAndSuffixSearch745Test1() {
        // Тесты на префиксы и суффиксы
        assertThat(search.f("ap", "le")).isEqualTo(0);  // "apple" имеет префикс "ap" и суффикс "le"
        assertThat(search.f("ban", "na")).isEqualTo(3); // "bandana" имеет префикс "ban" и суффикс "na"
        assertThat(search.f("ba", "d")).isEqualTo(4);   // "band" имеет префикс "ba" и суффикс "d"
        assertThat(search.f("ca", "rot")).isEqualTo(2); // "carrot" имеет префикс "ca" и суффикс "rot"
        assertThat(search.f("ba", "nana")).isEqualTo(1);// "bandana" имеет префикс "ba" и суффикс "nana"
        assertThat(search.f("b", "e")).isEqualTo(-1);   // ни одно слово не имеет префикс "b" и суффикс "e"
        assertThat(search.f("ban", "d")).isEqualTo(4);  // "band" имеет префикс "ban" и суффикс "d"
    }

}
