package org.parog.algo_roadmap.linked_list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link AddTwoNumbers2}
 */
public class AddTwoNumbers2Test {

    @Test
    void AddTwoNumbers2Test1() {
        ListNode l1 = new ListNode(9, null);
        ListNode l2 = new ListNode(1, null);
        ListNode expected = new ListNode(1, new ListNode(0, null));

        assertThat(AddTwoNumbers2.addTwoNumbers(l1, l2)).isEqualTo(expected);
    }

    @Test
    void AddTwoNumbers2Test2() {
        ListNode l2 = new ListNode(1, null);

        assertThat(AddTwoNumbers2.addTwoNumbers(null, l2)).isEqualTo(l2);
    }

    @Test
    void AddTwoNumbers2Test3() {
        ListNode l1 = new ListNode(1, null);
        assertThat(AddTwoNumbers2.addTwoNumbers(l1, null)).isEqualTo(l1);
    }

    @Test
    void AddTwoNumbers2Test4() {
        assertThat(AddTwoNumbers2.addTwoNumbers(null, null)).isEqualTo(null);
    }

    @Test
    void AddTwoNumbers2Test5() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        ListNode expected = new ListNode(8, new ListNode(0, new ListNode(7, null)));

        assertThat(AddTwoNumbers2.addTwoNumbers(l1, l2)).isEqualTo(expected);
    }

    @Test
    void AddTwoNumbers2Test6() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(6, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        ListNode expected = new ListNode(8, new ListNode(1, new ListNode(0, null)));

        assertThat(AddTwoNumbers2.addTwoNumbers(l1, l2)).isEqualTo(expected);
    }

    @Test
    void AddTwoNumbers2Test7() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, null)));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, null)));
        ListNode expected = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(8, null))));

        assertThat(AddTwoNumbers2.addTwoNumbers(l1, l2)).isEqualTo(expected);
    }

    @Test
    void AddTwoNumbers2Test8() {
        ListNode l1 = new ListNode(0, null);
        ListNode l2 = new ListNode(0, null);
        ListNode expected = new ListNode(0, null);

        assertThat(AddTwoNumbers2.addTwoNumbers(l1, l2)).isEqualTo(expected);
    }

    @Test
    void AddTwoNumbers2Test9() {
        ListNode l1 = new ListNode(2, new ListNode(6, null));
        ListNode l2 = new ListNode(2, null);
        ListNode expected = new ListNode(2, new ListNode(8, null));

        assertThat(AddTwoNumbers2.addTwoNumbers(l1, l2)).isEqualTo(expected);
    }
}
