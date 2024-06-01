package org.parog.algo_roadmap.arrays_hashing;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.
 * 2.
 * 3.
 */
public class ProductOfArrayExceptSelf238 {

    // TL
    // решение с помощью префиксов и постфиксов
    public static int[] productExceptSelf(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int miss = 0;

        while (miss < nums.length) {
            int el = 1;
            for (int i = 0; i < nums.length; i++) {
                if (i == miss){
                    continue;
                }
                el *= nums[i];
            }
            result.add(el);
            miss++;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
