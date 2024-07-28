package org.parog.yandex75;

/**
 * 1.
 * 1 <= nums.length <= 10^5
 * nums[i] равна либо 0, либо 1.
 * 2.
 * Тестовый класс {@link LongestSubarrayOfFirstAfterDeletingOneElement1493Test}
 */
public class LongestSubarrayOfFirstAfterDeletingOneElement1493 {
    /**
     * Решение с помощью Counting sums
     * Временная сложность: O(N) за один проход по массиву, где N - количество элементов в массиве
     * Пространственная сложность: O(1) поскольку используется фиксированное количество переменных
     *
     * @param nums массив 0 и 1
     * @return наибольший диапазон единиц
     */
    public static int longestSubarrayWithCounting(int[] nums) {
        // сумма единиц до последнего 0
        int prevSumOfUnits = 0;
        // сумма единиц после последнего 0
        int currSumOfUnits = 0;
        // максимальная сумма диапазона единиц после пропуска одного нуля
        int maxSumOfUnits = 0;

        for (int num : nums) {
            if (num == 1) { // увеличиваем текущий счетчик единиц
                currSumOfUnits++;
            } else { // максимизируем диапазон единиц, обновляем значения диапазонов сумм для следующей итерации подсчета
                maxSumOfUnits = Math.max(maxSumOfUnits, prevSumOfUnits + currSumOfUnits);
                prevSumOfUnits = currSumOfUnits;
                currSumOfUnits = 0;
            }
        }

        // краевой случай, когда в конце массива находится наибольшая сумма единиц без нуля [0,1,1,0,1,1,1]
        maxSumOfUnits = Math.max(maxSumOfUnits, prevSumOfUnits + currSumOfUnits);

        // если в массиве были только одни единицы, то необходимо уменьшить maxSumOfUnits
        return maxSumOfUnits == nums.length ? maxSumOfUnits - 1 : maxSumOfUnits;
    }

    /**
     * Решение с помощью Sliding window
     * Временная сложность: O(N) за один проход по массиву, где N - количество элементов в массиве
     * Пространственная сложность: O(1) поскольку используется фиксированное количество переменных
     *
     * @param nums массив 0 и 1
     * @return наибольший диапазон единиц
     */
    public static int longestSubarrayWithSlidingWindow(int[] nums) {
        // счетчик нулей в диапазоне окна
        int numZero = 1;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            // элемент на правой границе равен 0, то в текущем диапазоне окна больше нулей не может быть
            if (nums[right] == 0) {
                numZero--;
            }

            if (numZero < 0) { // если numZero меньше нуля, перемещает левый указатель вправо
                if (nums[left] == 0) {
                    numZero++;
                }
                left++;
            }
        }

        // длина массива минус левый указатель минус один (для учета одного удаления)
        return nums.length - left - 1;
    }
}
