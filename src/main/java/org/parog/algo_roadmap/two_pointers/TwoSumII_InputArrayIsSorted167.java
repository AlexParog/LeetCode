package org.parog.algo_roadmap.two_pointers;

/**
 * 1.
 * Диапазон длины массива: 2 <= numbers.length <= 3 * 10^4
 * Диапазон элемента массива: -1000 <= numbers[i] <= 1000
 * numbers сортирован в порядке убывания
 * Диапазон целевого числа: -1000 <= target <= 1000
 * Тесты создаются таким образом, что существует ровно одно решение.
 * Нельзя использовать один и тот же элемент дважды.
 * Решение должно использовать постоянную пространственную сложность
 * 2.
 * Тестовый класс {@link TwoSumII_InputArrayIsSorted167Test}
 */
public class TwoSumII_InputArrayIsSorted167 {

    /**
     * Реализация с двумя указателями.
     * <p>
     * Идея: Используем два указателя, один в начале, другой в конце массива.
     * Сравниваем сумму элементов на указателях с целевым значением и
     * перемещаем указатели соответственно, чтобы найти нужную пару.
     * <p>
     * Временная сложность: O(n), где n - длина массива.
     * Пространственная сложность: O(1), используется константное дополнительное пространство.
     *
     * @param numbers отсортированный массив чисел
     * @param target  целевое значение суммы
     * @return массив из двух индексов (с учетом 1-индексации) чисел, дающих в сумме target, или [-1, -1],
     * если решение не найдено
     */
    public static int[] twoSumTwoPointers(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[]{-1, -1};
    }

    /**
     * Реализация через бинарный поиск.
     * <p>
     * Идея: Для каждого элемента массива ищем его дополнение (target - элемент)
     * в оставшейся части массива с помощью Binary Search.
     * <p>
     * Временная сложность: O(n log n), где n - длина массива.
     * Пространственная сложность: O(1), используется константное дополнительное пространство.
     *
     * @param numbers отсортированный массив чисел
     * @param target  целевое значение суммы
     * @return массив из двух индексов (с учетом 1-индексации) чисел, дающих в сумме target, или [-1, -1],
     * если решение не найдено
     */
    public static int[] twoSumBinarySearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int low = i + 1;
            int high = numbers.length - 1;
            int complement = target - numbers[i];
            while (low <= high) {
                int mid = (low + high) / 2;
                if (numbers[mid] == complement) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[mid] < complement) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return new int[]{-1, -1};
    }
}
