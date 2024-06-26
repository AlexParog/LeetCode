package org.parog.leetcode_programming_skills50;

/**
 * 1.
 * Может ли массив быть пустым? да
 * Является массив монотонным, если в нем [1, 1, 1, 1]? нет, однако [1] - монотонный
 * Используются ли целые числа? int
 * <p>
 * 2.
 * 1) [] - пустой
 * 2) [1, 2, 5, 10, 1000] - возрастающий
 * 3) [-2, -1, 0, 1] - убывающий
 * 4) [10, 8, 2, 1, 1, 2] - немонотонный
 * 5) [1, 1, 1, 1, 1] - немонотонный
 * <p>
 * 3.
 * Решение через перебор элементов с использованием флаговых переменных: increasing, decreasing.
 * Рассмотрим два случая (начинаем со 2го элемента):
 * 1) если текущий элемент меньше предыдущего, тогда increasing = false,
 * 2) иначе если текущий элемент больше предыдущего, тогда decreasing = false.
 * Также добавляем случай для проверки, когда массив является ни убывающим, ни возрастающим,
 * т.е. когда оба флага false -> прерываем цикл.
 * <p>
 * 4.
 * Время O(n) - итерация по всему массиву
 * Память O(n) - используем входящий массив
 */
public class MonotonicArray896 {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            } else if (nums[i] < nums[i - 1]) {
                increasing = false;
            }

            if (!increasing && !decreasing) {
                return false;
            }
        }

        return true;
    }
}
