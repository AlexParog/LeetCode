package org.parog.algo_roadmap.linked_list;

/**
 * Вспомогательный класс для решения задач Linked List
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
