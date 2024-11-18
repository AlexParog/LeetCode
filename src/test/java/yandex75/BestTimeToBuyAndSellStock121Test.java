package yandex75;

import org.junit.jupiter.api.Test;
import org.parog.yandex75.BestTimeToBuyAndSellStock121;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link BestTimeToBuyAndSellStock121}
 */
public class BestTimeToBuyAndSellStock121Test {

    @Test
    void BestTimeToBuyAndSellStock121Test1() {
        assertThat(BestTimeToBuyAndSellStock121.maxProfit(null))
                .isEqualTo(0);
    }

    @Test
    void BestTimeToBuyAndSellStock121Test2() {
        assertThat(BestTimeToBuyAndSellStock121.maxProfit(new int[]{1}))
                .isEqualTo(0);
    }

    @Test
    void BestTimeToBuyAndSellStock121Test3() {
        assertThat(BestTimeToBuyAndSellStock121.maxProfit(new int[]{1, 2}))
                .isEqualTo(1);
    }

    @Test
    void BestTimeToBuyAndSellStock121Test4() {
        assertThat(BestTimeToBuyAndSellStock121.maxProfit(new int[]{1, 1}))
                .isEqualTo(0);
    }

    @Test
    void BestTimeToBuyAndSellStock121Test5() {
        assertThat(BestTimeToBuyAndSellStock121.maxProfit(new int[]{2, 1}))
                .isEqualTo(0);
    }

    @Test
    void BestTimeToBuyAndSellStock121Test6() {
        assertThat(BestTimeToBuyAndSellStock121.maxProfit(new int[]{7, 1, 5, 3, 6, 4}))
                .isEqualTo(5);
    }

    @Test
    void BestTimeToBuyAndSellStock121Test7() {
        assertThat(BestTimeToBuyAndSellStock121.maxProfit(new int[]{100, 90, 80, 0, 99}))
                .isEqualTo(99);
    }

    @Test
    void BestTimeToBuyAndSellStock121Test8() {
        assertThat(BestTimeToBuyAndSellStock121.maxProfit(new int[]{1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9}))
                .isEqualTo(9);
    }
}
