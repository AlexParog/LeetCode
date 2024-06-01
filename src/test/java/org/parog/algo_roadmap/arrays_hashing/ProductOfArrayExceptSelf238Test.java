package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link ProductOfArrayExceptSelf238}
 */
public class ProductOfArrayExceptSelf238Test {
    @Test
    void ProductOfArrayExceptSelf238Test1() {
        assertThat(ProductOfArrayExceptSelf238.productExceptSelf(new int[]{1, 2, 3, 4}))
                .isEqualTo(new int[]{24, 12, 8, 6});
    }

    @Test
    void ProductOfArrayExceptSelf238Test2() {
        assertThat(ProductOfArrayExceptSelf238.productExceptSelf(new int[]{-1, 1, 0, -3, 3}))
                .isEqualTo(new int[]{0, 0, 9, 0, 0});
    }
}
