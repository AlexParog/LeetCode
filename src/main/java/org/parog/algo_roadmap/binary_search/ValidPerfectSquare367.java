package org.parog.algo_roadmap.binary_search;

/**
 * 1.
 * 1) Левая граница начинается с 1.
 * 2) Правая граница может быть числом равным num, которое <= 2^31-1.
 * 3) В int может не поместиться, используем long.
 * 2.
 * Тесты в классе {@link ValidPerfectSquare367Test}
 * 3.
 * 1) Время O(logN) - бинарный поиск
 * 2) Память O(1) - констатная память
 */
public class ValidPerfectSquare367 {
    public static boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid <= num) {
                if (isSquareNumber(num, mid)) {
                    return true;
                }
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    private static boolean isSquareNumber(long num, long mid) {
        return mid * mid == num;
    }
}
