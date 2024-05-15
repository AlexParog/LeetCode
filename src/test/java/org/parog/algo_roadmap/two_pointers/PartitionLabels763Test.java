package org.parog.algo_roadmap.two_pointers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link PartitionLabels763}
 */
public class PartitionLabels763Test {

    @Test
    void PartitionLabels763Test1() {
        assertThat(PartitionLabels763.partitionLabelsWithTwoPointers("ababcbacadefegdehijhklij"))
                .isEqualTo(List.of(9, 7, 8));
    }

    @Test
    void PartitionLabels763Test2() {
        assertThat(PartitionLabels763.partitionLabels("eccbbbbdec"))
                .isEqualTo(List.of(10));
    }

    @Test
    void PartitionLabels763Test3() {
        assertThat(PartitionLabels763.partitionLabels("qiejxqfnqceocmy"))
                .isEqualTo(List.of(13, 1, 1));
    }

    @Test
    void PartitionLabels763Test4() {
        assertThat(PartitionLabels763.partitionLabels("abcde"))
                .isEqualTo(List.of(1,1,1,1,1));
    }

    @Test
    void PartitionLabels763Test5() {
        assertThat(PartitionLabels763.partitionLabels("a"))
                .isEqualTo(List.of(1));
    }
}
