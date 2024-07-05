package org.parog.algo_roadmap.linked_list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link PalindromeLinkedList234}
 */
public class PalindromeLinkedList234Test {
    @Test
    void PalindromeLinkedList234Test1() {
        assertThat(PalindromeLinkedList234
                .isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, null))))))
                .isEqualTo(true);
    }

    @Test
    void PalindromeLinkedList234Test2() {
        assertThat(PalindromeLinkedList234
                .isPalindrome(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(1, null))))))
                .isEqualTo(false);
    }

    @Test
    void PalindromeLinkedList234Test3() {
        assertThat(PalindromeLinkedList234
                .isPalindrome(new ListNode(1, new ListNode(2, new ListNode(1, new ListNode(1, null))))))
                .isEqualTo(false);
    }

    @Test
    void PalindromeLinkedList234Test4() {
        assertThat(PalindromeLinkedList234
                .isPalindrome(new ListNode(2, new ListNode(1, new ListNode(1, new ListNode(1, null))))))
                .isEqualTo(false);
    }

    @Test
    void PalindromeLinkedList234Test5() {
        assertThat(PalindromeLinkedList234
                .isPalindrome(new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, null))))))
                .isEqualTo(false);
    }

    @Test
    void PalindromeLinkedList234Test6() {
        assertThat(PalindromeLinkedList234
                .isPalindrome(new ListNode(1, new ListNode(2, new ListNode(1, new ListNode(2, null))))))
                .isEqualTo(false);
    }

    @Test
    void PalindromeLinkedList234Test7() {
        assertThat(PalindromeLinkedList234
                .isPalindrome(new ListNode(1,
                        new ListNode(2,
                                new ListNode(2,
                                        new ListNode(2,
                                                new ListNode(1, null)))))))
                .isEqualTo(true);
    }
}
