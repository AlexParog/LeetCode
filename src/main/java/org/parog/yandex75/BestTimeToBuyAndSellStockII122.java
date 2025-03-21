package org.parog.yandex75;

/**
 * 1.
 * Диапазон длины prices: 1 <= prices.length <= 3 * 10^4
 * Диапазон значений элементов prices: 0 <= prices[i] <= 10^4
 * Неограниченное количество сделок: Мы можем покупать и продавать акции сколько угодно раз.
 * 2. Тестовый класс {@link BestTimeToBuyAndSellStockII122Test}
 * 3.
 * Временная сложность: O(N), так как алгоритм проходит по массиву цен один раз, выполняя для каждого элемента константное
 * количество операций.
 * Пространственная сложность: O(1), так как алгоритм использует только несколько переменных для хранения текущего состояния.
 */
public class BestTimeToBuyAndSellStockII122 {
    /**
     * Любое повышение цены можно разбить на последовательность подъемов и спусков. Суммарная прибыль от
     * последовательности сделок "купить на подъеме, продать на спуске" будет равна прибыли от одной сделки "купить
     * в самом низу, продать на самом верху".
     *
     * @param prices цена в конкретный день
     * @return максимальная прибыль
     */
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 1) return 0;

        int profit = 0;
        int buy = 0;
        int sell = 1;

        // жадный подход: продавать при любой возможности, чтобы максимизировать прибыль
        while (sell < prices.length) {
            if (prices[buy] < prices[sell]) {
                int currProfit = prices[sell] - prices[buy];
                profit += currProfit;
            }
            buy = sell;
            sell++;
        }

        return profit;
    }
}
