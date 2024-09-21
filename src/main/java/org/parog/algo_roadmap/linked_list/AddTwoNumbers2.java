package org.parog.algo_roadmap.linked_list;

/**
 * 1.
 * Количество узлов в каждом связанном списке находится в диапазоне [1, 100]
 * 0 <= Node.val <= 9
 * Гарантируется, что список представляет собой число, не содержащее начальных нулей
 * 2.
 * Тестовый класс {@link AddTwoNumbers2Test}
 * 3.
 * Временная сложность: O(N), где N - максимальная длина связного списка среди l1, l2
 * Пространственная сложность:O(n), где n — длина результирующего списка, которая в худшем случае равна длине более
 * длинного списка плюс 1 (если есть перенос в старший разряд)
 */
public class AddTwoNumbers2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 != null && l2 != null) {
            ListNode dummyHead = new ListNode(0);
            ListNode tail = dummyHead;
            int carry = 0;

            // итерируемся до того, пока не дойдем до конца в обоих связных списках и
            // если остается последний разряд после суммы
            while (l1 != null || l2 != null || carry != 0) {
                int firstDigit = getNextValue(l1);
                int secondDigit = getNextValue(l2);

                // поразрядная сумма чисел и если сумма 10, то берем последнюю цифру
                // и запоминаем 1 для следующего разряда
                int sum = firstDigit + secondDigit + carry;
                int sumDigit = sum % 10;
                carry = sum / 10;

                // добавляем новую цифру после суммы
                ListNode newNode = new ListNode(sumDigit);
                tail.next = newNode;
                tail = tail.next;

                // двигаем указатель на следующие элементы, если они присутствуют
                l1 = (l1 != null) ? l1.next : null;
                l2 = (l2 != null) ? l2.next : null;
            }

            return dummyHead.next;
        } else return (l1 != null) ? l1 : l2;
    }

    private static int getNextValue(ListNode node) {
        return (node != null) ? node.val : 0;
    }

}
