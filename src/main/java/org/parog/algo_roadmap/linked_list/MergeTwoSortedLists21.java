package org.parog.algo_roadmap.linked_list;

/**
 * 1.
 * Количество узлов в обоих списках находится в диапазоне [0, 50]
 * -100 <= Node.val <= 100
 * Оба списка list1 и list2 отсортированы в неубывающем порядке
 * 2.
 * Тестовый класс {@link MergeTwoSortedLists21Test}
 */
public class MergeTwoSortedLists21 {
    /**
     * Временная сложность: O(n+m), где n и m длины списков list1 и list2 соответственно. Это потому, что мы проходим
     * по каждому элементу обоих списков ровно один раз. В худшем случае мы посещаем все n + m узлов.
     * Пространственная сложность: O(1), пространственная сложность по внешней памяти не увеличивается, так как мы
     * не создаем новые узлы, а только перенаправляем указатели существующих узлов. Новый список просто использует
     * уже существующие узлы из list1 и list2
     *
     * @param list1 связный список
     * @param list2 связный список
     * @return объединенный связный список
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        final ListNode root = new ListNode();
        ListNode previous = root;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                // связываем с текущим элементом
                previous.next = list1;
                // перемещаемся на следующий связный элемент
                list1 = list1.next;
            } else {
                previous.next = list2;
                list2 = list2.next;
            }
            previous = previous.next;
        }

        // добавляем оставшиеся отсортированные элементы в конец
        previous.next = list1 != null ? list1 : list2;
        return root.next;
    }

    /**
     * Временная сложность: O(n+m), где n и m длины списков list1 и list2 соответственно. Это потому, что мы проходим
     * по каждому элементу обоих списков ровно один раз. В худшем случае мы посещаем все n + m узлов.
     * Пространственная сложность: O(n + m) из-за рекурсивного вызова. Каждый рекурсивный вызов занимает место в стеке
     * вызовов, и в худшем случае может быть выполнено n + m вызовов, где n и m — длины списков list1 и list2 соответственно
     *
     * @param list1 связный список
     * @param list2 связный список
     * @return объединенный связный список
     */
    public static ListNode mergeTwoListsRecursion(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoListsRecursion(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoListsRecursion(list2.next, list1);
            return list2;
        }
    }
}
