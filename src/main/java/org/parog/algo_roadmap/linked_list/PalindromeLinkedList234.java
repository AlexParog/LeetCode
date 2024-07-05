package org.parog.algo_roadmap.linked_list;

/**
 * 1.
 * Количество узлов в списке находится в диапазоне [1, 10^5].
 * Диапазон значений элемента: 0 <= Node.val <= 9
 * 2.
 * Тестовый класс {@link PalindromeLinkedList234Test}
 * 3.
 * Временная сложность: O(N), поиск середины - O(N / 2), разворот второй половины - O(N / 2), сравнение на палиндром - O(N / 2)
 * Пространственная сложность: O(1), так как используются постоянно количество дополнительных указателей
 */
public class PalindromeLinkedList234 {
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // нашли середину списка
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode current = slow;
        // разворачиваем вторую половину списка
        // previous будет указывать на голову развернутой второй половины списка
        while (current != null) {
            ListNode next = current.next; // сохраняем следующий узел
            current.next = prev; // разворачиваем указатель current
            prev = current; // перемещаем prev на текущий узел
            current = next; // перемещаем current на следующий узел
        }

        // сравниваем на палиндром
        ListNode firstHalf = head;
        ListNode secondHalf = prev;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
}
