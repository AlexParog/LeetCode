package org.parog.yandex75;

/**
 * 1.
 * Диапазон длины prices: 1 <= prices.length <= 3 * 10^4
 * Диапазон значений элементов prices: 0 <= prices[i] <= 10^4
 * 2.
 * Тестовый класс {@link BestTimeToBuyAndSellStock121Test}
 * 3.
 * Временная сложность: O(n), где n - количество элементов внутри prices
 * Пространственная сложность: O(1), так как не используются дополнительные структуры данных
 */
public class BestTimeToBuyAndSellStock121 {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 1) return 0;

        int profit = -1;
        int buy = 0;
        int sell = 1;

        while (sell < prices.length) {
            if (prices[buy] < prices[sell]) {
                int currProfit = prices[sell] - prices[buy];
                profit = Math.max(profit, currProfit);
            } else {
                buy = sell;
            }
            sell++;
        }

        return Math.max(profit, 0);
    }
}
