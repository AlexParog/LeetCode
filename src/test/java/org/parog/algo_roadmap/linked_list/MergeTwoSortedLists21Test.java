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

    @Test
    void MergeTwoSortedLists21Test2() {
        assertThat(MergeTwoSortedLists21.mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(4, null))),
                null))
                .isEqualTo(
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(4, null))));
    }

    @Test
    void MergeTwoSortedLists21Test3() {
        assertThat(MergeTwoSortedLists21.mergeTwoLists(
                null,
                new ListNode(1, new ListNode(2, new ListNode(4, null)))))
                .isEqualTo(
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(4, null))));
    }

    @Test
    void MergeTwoSortedLists21Test4() {
        assertThat(MergeTwoSortedLists21.mergeTwoLists(
                new ListNode(1, null),
                new ListNode(1, new ListNode(2, new ListNode(4, null)))))
                .isEqualTo(
                        new ListNode(1,
                                new ListNode(1,
                                        new ListNode(2,
                                                new ListNode(4, null)))));
    }

    @Test
    void MergeTwoSortedLists21Test5() {
        assertThat(MergeTwoSortedLists21.mergeTwoLists(
                new ListNode(1, new ListNode(1, new ListNode(4, new ListNode(10, null)))),
                new ListNode(1, new ListNode(2, new ListNode(6, null)))))
                .isEqualTo(
                        new ListNode(1,
                                new ListNode(1,
                                        new ListNode(1,
                                                new ListNode(2,
                                                        new ListNode(4,
                                                                new ListNode(6,
                                                                        new ListNode(10, null))))))));
    }
}
