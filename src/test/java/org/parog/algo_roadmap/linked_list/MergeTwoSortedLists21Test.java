package org.parog.algo_roadmap.linked_list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link MergeTwoSortedLists21}
 */
public class MergeTwoSortedLists21Test {
    @Test
    void MergeTwoSortedLists21Test1() {
        assertThat(MergeTwoSortedLists21.mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(4, null))),
                new ListNode(1, new ListNode(3, new ListNode(4, null)))))
                .isEqualTo(
                        new ListNode(1,
                                new ListNode(1,
                                        new ListNode(2,
                                                new ListNode(3,
                                                        new ListNode(4,
                                                                new ListNode(4, null)))))));
    }
}
