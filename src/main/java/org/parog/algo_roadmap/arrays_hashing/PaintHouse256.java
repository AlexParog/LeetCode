package org.parog.algo_roadmap.arrays_hashing;

/**
 * link - <a href="https://leetcode.ca/2016-08-12-256-Paint-House/">LeetCode Premium</a>
 * 1.
 * costs.length == n
 * Количество цветов: costs[i].length == 3
 * Диапазон количества домов: 1 <= n <= 100
 * Диапазон цены цвета: 1 <= costs[i][j] <= 20
 * 2.
 * Тестовый класс {@link PaintHouse256Test}
 */
public class PaintHouse256 {
    /**
     * Временная сложность: O(N), где N — количество домов. Мы проходим по каждому дому один раз.
     * Пространственная сложность: O(N), так как храним DP-таблицу размером N x 3
     *
     * @param costs входящая матрица
     * @return минимальная цена за покраску домов
     */
    public static int minCost(int[][] costs) {
        if (costs == null || costs.length == 0) {
            return 0;
        }

        // количество домов
        int n = costs.length;
        int[][] dp = new int[n][3];

        // База DP: стоимость покраски первого дома
        dp[0][0] = costs[0][0];
        dp[0][1] = costs[0][1];
        dp[0][2] = costs[0][2];

        // Заполняем DP-таблицу
        for (int i = 1; i < n; i++) {
            // если покрасили в первый цвет, то находим минимум (по цене) среди второго и третьего
            dp[i][0] = costs[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            // если покрасили во второй цвет, то находим минимум (по цене) среди первого и третьего
            dp[i][1] = costs[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            // если покрасили в третий цвет, то находим минимум (по цене) среди первого и второго
            dp[i][2] = costs[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        // минимальное значение в последней строке
        return Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2]));
    }

    /**
     * Временная сложность: O(N), где N — количество домов. Мы проходим по каждому дому один раз.
     * Пространственная сложность: O(1), так как храним последнюю итерацию (фиксированный массив из 3 элементов, состоящий из конечных сумм)
     *
     * @param costs входящая матрица
     * @return минимальная цена за покраску домов
     */
    public static int optimizedMinCost(int[][] costs) {
        if (costs == null || costs.length == 0) {
            return 0;
        }

        // Инициализация массива dp для хранения текущих стоимостей (не храним все вычисления, а используем только последние)
        int[] dp = new int[3];

        // Заполняем DP-таблицу
        // Вычисляем новые значения для каждого цвета
        for (int i = 0; i < costs.length; i++) {
            // если покрасили в первый цвет, то находим минимум (по цене) среди второго и третьего
            int dp0 = costs[i][0] + Math.min(dp[1], dp[2]);
            // если покрасили во второй цвет, то находим минимум (по цене) среди первого и третьего
            int dp1 = costs[i][1] + Math.min(dp[0], dp[2]);
            // если покрасили в третий цвет, то находим минимум (по цене) среди первого и второго
            int dp2 = costs[i][2] + Math.min(dp[0], dp[1]);

            dp[0] = dp0;
            dp[1] = dp1;
            dp[2] = dp2;
        }

        // минимальное значение в массиве финальных сумм
        return Math.min(dp[0], Math.min(dp[1], dp[2]));
    }
}
