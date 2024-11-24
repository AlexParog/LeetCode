package org.parog.algo_roadmap.arrays_hashing;

/**
 * 1.
 * Диапазон длины массива: 1 <= flowerbed.length <= 2 * 10^4
 * Значения массива flowerbed[i] равны 0 или 1.
 * На клумбе нет двух соседних цветов.
 * Значение количества непосаженных цветов: 0 <= n <= flowerbed.length
 * 2.
 * Тестовый класс {@link CanPlaceFlowers605Test}
 * 3.
 * Временная сложность: O(N), так как проходимся по всему массиву ровно один раз
 * Пространственная сложность: O(1), так как не используем доп. структур для хранения значений
 */
public class CanPlaceFlowers605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed == null) {
            return false;
        }
        if (n == 0) {
            return true;
        }

        int count = 0;
        // жадный алгоритм: сажаем цветов, если есть такая возможность
        for (int bed = 0; bed < flowerbed.length; bed++) {
            if (flowerbed[bed] == 0) {
                boolean canPlant = true;
                // не находимся на последнем элементе массива и можем ли посадить цветок
                if ((bed < flowerbed.length - 1 && flowerbed[bed + 1] == 1)) {
                    canPlant = false;
                }
                // не находимся на первом элементе массива и можем ли посадить цветок
                if ((bed > 0 && flowerbed[bed - 1] == 1)) {
                    canPlant = false;
                }

                if (canPlant) {
                    flowerbed[bed] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }
}
