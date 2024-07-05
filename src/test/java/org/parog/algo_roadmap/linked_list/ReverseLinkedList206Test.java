package org.parog.algo_roadmap.linked_list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для решения задачи {@link ReverseLinkedList206}
 */
public class ReverseLinkedList206Test {
    @Test
    void ReverseLinkedList206Test1() {
        assertThat(ReverseLinkedList206
                .reverseList(
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(4,
                                                        new ListNode(5, null)))))))
                .isEqualTo(
                        new ListNode(5,
                                new ListNode(4,
                                        new ListNode(3,
                                                new ListNode(2,
                                                        new ListNode(1, null))))));
    }
}
