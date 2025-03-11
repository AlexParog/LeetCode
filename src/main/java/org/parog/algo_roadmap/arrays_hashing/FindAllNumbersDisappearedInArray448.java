package org.parog.algo_roadmap.arrays_hashing;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.
 * Диапазон [1,n], где n равен длине массива: n == nums.length
 * Диапазон значений n: 1 <= n <= 10^5
 * Диапазон значения массива: 1 <= nums[i] <= n
 * 2.
 * Тестовый класс {@link FindAllNumbersDisappearedInArray448Test}
 * 3.
 * Временная сложность: O(N), так как проходимся по всем элементам массива.
 * Пространственная сложность: O(N), создаем дополнительный массив, длина которого равна длине входного массива.
 */
public class FindAllNumbersDisappearedInArray448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] visited = new boolean[nums.length];

        for (int num : nums) {
            visited[num - 1] = true;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
