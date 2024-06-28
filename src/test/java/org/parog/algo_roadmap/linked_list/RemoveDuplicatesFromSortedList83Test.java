package org.parog.algo_roadmap.linked_list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link RemoveDuplicatesFromSortedList83}
 */
public class RemoveDuplicatesFromSortedList83Test {
    @Test
    void RemoveDuplicatesFromSortedList83Test1() {
        assertThat(RemoveDuplicatesFromSortedList83
                .deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, null)))))
                .isEqualTo(new ListNode(1, new ListNode(2, null)));
    }

    @Test
    void RemoveDuplicatesFromSortedList83Test2() {
        assertThat(RemoveDuplicatesFromSortedList83
                .deleteDuplicates(
                        new ListNode(1,
                                new ListNode(1,
                                        new ListNode(2,
                                                new ListNode(3,
                                                        new ListNode(3, null)))))))
                .isEqualTo(new ListNode(1, new ListNode(2, new ListNode(3, null))));
    }

    @Test
    void RemoveDuplicatesFromSortedList83Test3() {
        assertThat(RemoveDuplicatesFromSortedList83
                .deleteDuplicates(
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(3,
                                                        null))))))
                .isEqualTo(new ListNode(1, new ListNode(2, new ListNode(3, null))));
    }
}
