package org.parog.algo_roadmap.two_pointers;

/**
 * 1.
 * Длина nums1.length == m + n
 * Длина nums2.length == n
 * Диапазон n, m: 0 <= m, n <= 200
 * Гарантировано: 1 <= m + n <= 200
 * Диапазон nums1[i], nums2[j]: -10^9 <= nums1[i], nums2[j] <= 10^9
 * 2.
 * Тестовый класс {@link MergeSortedArray88Test}
 * 3.
 * Временная сложность: в худшем случае O(m + n), где длины массивов nums1 и nums2
 * Пространственная сложность: O(1), так как никакие структуры данных дополнительно не используются
 */
public class MergeSortedArray88 {

    /**
     * Можно избавиться от дополнительного цикла while, добавив условие indexNum1 >= 0, которое необходимо для проверки
     * границы массива nums1. То есть по суть в одном цикле while две подзадачи: вставка элементов в порядке возрастания
     * и копирование оставшихся элементов, которые не обработали.
     *
     * @param nums1 входящий массив nums1
     * @param m     количество элементов заполненных элементов
     * @param nums2 входящий массив nums2
     * @param n     количество элементов заполненных элементов
     * @return объединенный отсортированный в порядке возрастания массив
     */
    public static int[] optimizedMerge(int[] nums1, int m, int[] nums2, int n) {
        int indexNum1 = m - 1;
        int indexNum2 = n - 1;
        int insert = m + n - 1;

        while (indexNum2 >= 0) {
            if (indexNum1 >= 0 && nums1[indexNum1] > nums2[indexNum2]) {
                nums1[insert--] = nums1[indexNum1--];
            } else {
                nums1[insert--] = nums2[indexNum2--];
            }
        }

        return nums1;
    }

    /**
     * Разделение на две подзадачи и явная проверка двух указателей, чтобы не вышли за рамки массивов nums1 и nums2.
     * Код становится более понятным, так как явно выделены подзадачи: вставка элементов в порядке возрастания
     * и копирование оставшихся элементов, которые не обработали.
     *
     * @param nums1 входящий массив nums1
     * @param m     количество элементов заполненных элементов
     * @param nums2 входящий массив nums2
     * @param n     количество элементов заполненных элементов
     * @return объединенный отсортированный в порядке возрастания массив
     */
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int indexNums1 = m - 1;
        int indexNums2 = n - 1;
        int insertionPosition = m + n - 1;

        // вставка, сравнение, уменьшение индекса происходит за O(1)
        while (indexNums1 >= 0 && indexNums2 >= 0) {
            if (nums1[indexNums1] < nums2[indexNums2])
                nums1[insertionPosition--] = nums2[indexNums2--];
            else
                nums1[insertionPosition--] = nums1[indexNums1--];
        }

        // копирует оставшиеся элементы из nums2 в начало nums1
        while (indexNums2 >= 0)
            nums1[insertionPosition--] = nums2[indexNums2--];

        return nums1;
    }
}
