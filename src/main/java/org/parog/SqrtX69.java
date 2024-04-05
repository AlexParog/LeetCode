package org.parog;

/**
 * 1.
 * Диапазон для n: 0 <= x <= 2^31 - 1
 * В данной задаче нам необходимо найти квадратный корень из x с округлением вниз.
 * 2.
 * Тестовый класс {@link SqrtX69Test}
 * 3.
 * Ограничений по времени: O(logN)
 * Ограничения по памяти: O(1)
 */
public class SqrtX69 {
    public static int mySqrt(int x) {
        int left = 0;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * mid == x) {
                return mid;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
