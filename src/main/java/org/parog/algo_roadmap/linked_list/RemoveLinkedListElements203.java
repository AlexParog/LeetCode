package org.parog.algo_roadmap.linked_list;

/**
 * 1.
 * Количество узлов в списке находится в диапазоне [0, 10^4].
 * 1 <= Node.val <= 50
 * 0 <= val <= 50
 * 2.
 * Тестовый класс {@link RemoveLinkedListElements203Test}
 * 3.
 * Временная сложность: O(N), так как проходим каждый узел ровно один раз
 * Пространственная сложность: O(1), O(1), так как мы не используем дополнительную память, пропорциональную размеру
 * входных данных. Мы создаем только несколько указателей (dummy, current, previous), независимо от длины списка.
 */
public class RemoveLinkedListElements203 {
    public static ListNode removeElements(ListNode head, int val) {
        // чтобы не пропустить самый первый элемент
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // указывает на текущий узел
        ListNode current = head;
        // указывает на предыдущий
        ListNode previous = dummy;
        while (current != null) {
            if (current.val == val) {
                previous.next = current.next;
            } else {
                // перемещаем указатель предыдущего на позицию текущего
                previous = current;
            }
            // перемещаем указатель текущего на следующий узел
            current = current.next;
        }
        return dummy.next;
    }
}
