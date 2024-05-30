package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EncodeAndDecodeStrings271Test {
    @Test
    void EncodeAndDecodeStrings271Test1() {
        assertThat(EncodeAndDecodeStrings271.encode(List.of("apple", "banana", "cherry")))
                .isEqualTo("5#apple6#banana6#cherry");
    }

    @Test
    void EncodeAndDecodeStrings271Test2() {
        assertThat(EncodeAndDecodeStrings271.decode("5#apple6#banana6#cherry"))
                .isEqualTo(List.of("apple", "banana", "cherry"));
    }

    @Test
    void EncodeAndDecodeStrings271Test3() {
        assertThat(EncodeAndDecodeStrings271.encode(List.of("", "a", "", "b")))
                .isEqualTo("0#1#a0#1#b");
    }

    @Test
    void EncodeAndDecodeStrings271Test4() {
        assertThat(EncodeAndDecodeStrings271.decode("0#1#a0#1#b"))
                .isEqualTo(List.of("", "a", "", "b"));
    }

    @Test
    void EncodeAndDecodeStrings271Test5() {
        assertThat(EncodeAndDecodeStrings271.encode(List.of("he#llo", "wor#ld")))
                .isEqualTo("6#he#llo6#wor#ld");
    }

    @Test
    void EncodeAndDecodeStrings271Test6() {
        assertThat(EncodeAndDecodeStrings271.decode("6#he#llo6#wor#ld"))
                .isEqualTo(List.of("he#llo", "wor#ld"));
    }

    @Test
    void EncodeAndDecodeStrings271Test7() {
        assertThat(EncodeAndDecodeStrings271.encode(List.of("single")))
                .isEqualTo("6#single");
    }

    @Test
    void EncodeAndDecodeStrings271Test8() {
        assertThat(EncodeAndDecodeStrings271.decode("6#single"))
                .isEqualTo(List.of("single"));
    }
}
