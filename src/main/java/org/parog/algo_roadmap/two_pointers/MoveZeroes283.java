package org.parog.algo_roadmap.two_pointers;

/**
 * 1.
 * Диапазон длины массива: 1 <= nums.length <= 10^4
 * Диапазон элемента: -2^31 <= nums[i] <= 2^31 - 1
 * Решение должны быть in-place
 * 2.
 * Тестовый класс {@link MoveZeroes283Test}
 */
public class MoveZeroes283 {
    /**
     * Временная сложность: O(n)
     * Пространственная сложность: O(1)
     *
     * @param nums массив чисел
     * @return массив, где сначала идут ненулевые элементы с сохранением порядка, а потом нули
     */
    public static int[] moveZeroes_TwoStepZeroShift(int[] nums) {
        // указатель начала для ненулевых элементов
        int index = 0;

        // цикл для перемещения ненулевых элементов в начало массива
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // сдвигаем все предыдущие нули вправо от ненулевых элементов
                nums[index] = nums[i];
                index++;
            }
        }

        // заполнения оставшуюся часть массива нулями
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }

        return nums;
    }

    /**
     * Временная сложность: O(n)
     * Пространственная сложность: O(1)
     *
     * @param nums массив чисел
     * @return массив, где сначала идут ненулевые элементы с сохранением порядка, а потом нули
     */
    public static int[] moveZeroes_ParallelMovementOfZeros(int[] nums) {
        // для отслеживания количества последовательных нулей
        int snowBallSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                snowBallSize++;
            } else if (snowBallSize > 0) {
                // Если встречается ненулевой элемент сразу после последовательности нулей,
                // он перемещается на позицию первого нуля, а нули сдвигаются вправо
                nums[i - snowBallSize] = nums[i];
                nums[i] = 0;
            }
        }

        return nums;
    }
}
