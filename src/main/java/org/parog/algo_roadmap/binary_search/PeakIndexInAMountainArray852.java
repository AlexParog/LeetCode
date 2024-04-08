package org.parog.algo_roadmap.binary_search;

/**
 * 1.
 * Диапазон arr.length: 3 <= arr.length <= 10^5
 * Диапазон arr[i]: 0 <= arr[i] <= 10^6
 * arr - это гарантированно mountain array.
 * 2.
 * Тестовый класс {@link PeakIndexInAMountainArray852Test}
 * 3.
 * Ограничение по времени: O(logN) - бинарный поиск
 * Ограничение по памяти: O(1) - константное время, так как алгоритм использует только фиксированное количество переменных,
 * независимо от размера входного массива arr
 */
public class PeakIndexInAMountainArray852 {
    public static int peakIndexInMountainArray(int[] arr) {
        if (arr.length < 3) return -1;
        if (arr[0] > arr[1]) return -1;
        if (arr[arr.length - 1] > arr[arr.length - 2]) return -1;

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid + 1]) { // спускаем с вершины
                right = mid;
            } else {
                left = mid + 1; // идем на вершину
            }
        }
        // После выхода из цикла left будет указывать на peak
        return left;
    }

    /**
     * Более простая задача: является ли переданный массив "mountain array".
     *
     * @param arr массив
     * @return true / false
     */
    private static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;

        int n = arr.length, uphill = 0, downhill = n - 1;
        // идем в гору
        while (uphill < n - 1) {
            if (arr[uphill] < arr[uphill + 1]) uphill++;
            else break;
        }

        // пик не обнаружен
        if (uphill == n - 1) return false;

        // спускаемся с горы
        while (downhill > 0) {
            if (arr[downhill] < arr[downhill - 1]) downhill--;
            else break;
        }
        // пик не обнаружен
        if (downhill == 0) return false;

        // единая вершина
        return uphill == downhill;
    }
}
