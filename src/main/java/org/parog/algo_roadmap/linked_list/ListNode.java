package org.parog.algo_roadmap.linked_list;

/**
 * Вспомогательный класс для решения задач Linked List (связные списки)
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

    // сравниваем текущее значение и рекурсивно следующие
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListNode)) return false;

        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                (next == null ? listNode.next == null : next.equals(listNode.next));
    }

    // хэш-код на основе значений текущего узла и последующих узлов
    @Override
    public int hashCode() {
        return 31 * val + (next != null ? next.hashCode() : 0);
    }
}
