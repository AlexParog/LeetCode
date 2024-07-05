package org.parog.algo_roadmap.linked_list;

/**
 * 1.
 * Количество узлов в списке находится в диапазоне [0, 5000]
 * Допустимые значения: -5000 <= Node.val <= 5000
 * 2.
 * Тестовый класс {@link ReverseLinkedList206Test}
 * 3.
 * Временная сложность: O(N), проходим полностью весь связный список
 * Пространственная сложность: O(1), не создаем никаких дополнительных узлов, а просто меняем связи между ними
 */
public class ReverseLinkedList206 {
    public static ListNode reverseList(ListNode head) {
        ListNode previous = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        return previous;
    }
}
