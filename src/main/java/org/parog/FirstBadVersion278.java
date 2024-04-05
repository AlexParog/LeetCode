package org.parog;

/**
 * 1.
 * Диапазон для n: 1 <= n <= 2^31-1,
 * поэтому используем формулу mid = left + (right - left) / 2, чтобы не было переполнения
 * 2.
 * Тестовый класс {@link FirstBadVersion278Test}
 * 3.
 * Ограничения по времени: O(lonN), где n - количество версий
 * Ограничения по памяти: O(1) - используем только входящие константы
 */
public class FirstBadVersion278 {
    private static final long BAD_VERSION = 4;

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (!isBadVersion(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    private static boolean isBadVersion(long version) {
        return version == BAD_VERSION;
    }
}
