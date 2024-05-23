package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link GroupAnagrams49}
 */
public class GroupAnagrams49Test {
    @Test
    void GroupAnagrams49Test1() {
        assertThat(GroupAnagrams49.groupAnagramsWithHashCode(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}))
                .isEqualTo(List.of(List.of("eat", "tea", "ate"),
                        List.of("bat"),
                        List.of("tan", "nat")));
    }

    @Test
    void GroupAnagrams49Test2() {
        assertThat(GroupAnagrams49.groupAnagramsWithMap(new String[]{}))
                .isEqualTo(List.of(List.of()));
    }
}
