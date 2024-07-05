package org.parog.algo_roadmap.linked_list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link RemoveLinkedListElements203}
 */
public class RemoveLinkedListElements203Test {
    @Test
    void RemoveLinkedListElements203Test1() {
        assertThat(RemoveLinkedListElements203
                .removeElements(
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(6,
                                                new ListNode(3,
                                                        new ListNode(4,
                                                                new ListNode(5,
                                                                        new ListNode(6, null))))))), 6))
                .isEqualTo(
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(4,
                                                        new ListNode(5, null))))));
    }

    @Test
    void RemoveLinkedListElements203Test2() {
        assertThat(RemoveLinkedListElements203
                .removeElements(
                        new ListNode(1,
                                new ListNode(1,
                                        new ListNode(1,
                                                new ListNode(1,
                                                        new ListNode(1,
                                                                new ListNode(1,
                                                                        new ListNode(1, null))))))), 1))
                .isEqualTo(null);
    }
}
