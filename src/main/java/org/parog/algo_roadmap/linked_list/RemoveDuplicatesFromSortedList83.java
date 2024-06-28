package org.parog.algo_roadmap.linked_list;

/**
 * 1.
 * Количество узлов в списке находится в диапазоне [0, 300]
 * -100 <= Node.val <= 100
 * Список гарантированно будет отсортирован по возрастанию
 * 2.
 * Тестовый класс {@link RemoveDuplicatesFromSortedList83Test}
 * 3.
 * Временная сложность: O(n), так как проходим по каждому узлу ровно один раз
 * Пространственная сложность: O(1), пространственная сложность по внешней памяти не увеличивается, так как мы
 * не создаем новые узлы, а только перенаправляем указатели существующих узлов
 */
public class RemoveDuplicatesFromSortedList83 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode currentEl = head;

        // пока не дойдем до конца связного списка
        while (currentEl != null) {
            // удаляем все подряд идущие одинаковые элементы
            while (currentEl.next != null && currentEl.next.val == currentEl.val) {
                // если находим подряд идущие одинаковые узлы, то перемещаем указатель на самый последний из них,
                // а потом отрезаем их
                currentEl.next = currentEl.next.next;
            }
            // перемещаем указатель на новый уникальный элемент связного списка
            currentEl = currentEl.next;
        }
        return head;
    }
}
