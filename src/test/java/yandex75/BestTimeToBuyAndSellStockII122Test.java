package yandex75;

import org.junit.jupiter.api.Test;
import org.parog.yandex75.BestTimeToBuyAndSellStockII122;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для решения задачи {@link org.parog.yandex75.BestTimeToBuyAndSellStockII122}
 */
public class BestTimeToBuyAndSellStockII122Test {

    @Test
    void BestTimeToBuyAndSellStockII122Test1() {
        assertThat(BestTimeToBuyAndSellStockII122.maxProfit(null))
                .isEqualTo(0);
    }

    @Test
    void BestTimeToBuyAndSellStockII122Test2() {
        assertThat(BestTimeToBuyAndSellStockII122.maxProfit(new int[]{1}))
                .isEqualTo(0);
    }

    @Test
    void BestTimeToBuyAndSellStockII122Test3() {
        assertThat(BestTimeToBuyAndSellStockII122.maxProfit(new int[]{1, 2}))
                .isEqualTo(1);
    }

    @Test
    void BestTimeToBuyAndSellStockII122Test4() {
        assertThat(BestTimeToBuyAndSellStockII122.maxProfit(new int[]{1, 1}))
                .isEqualTo(0);
    }

    @Test
    void BestTimeToBuyAndSellStockII122Test5() {
        assertThat(BestTimeToBuyAndSellStockII122.maxProfit(new int[]{2, 1}))
                .isEqualTo(0);
    }

    @Test
    void BestTimeToBuyAndSellStockII122Test6() {
        assertThat(BestTimeToBuyAndSellStockII122.maxProfit(new int[]{7, 1, 5, 3, 6, 4}))
                .isEqualTo(7);
    }

    @Test
    void BestTimeToBuyAndSellStockII122Test7() {
        assertThat(BestTimeToBuyAndSellStockII122.maxProfit(new int[]{100, 90, 80, 0, 99}))
                .isEqualTo(99);
    }

    @Test
    void BestTimeToBuyAndSellStockII122Test8() {
        assertThat(BestTimeToBuyAndSellStockII122.maxProfit(new int[]{1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9}))
                .isEqualTo(24);
    }
}
