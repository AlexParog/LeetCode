package org.parog.algo_roadmap.arrays_hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.
 * Диапазон длины массива: 1 <= nums.length <= 2 * 10^4
 * Диапазон значений: -1000 <= nums[i] <= 1000
 * Диапазон значения k: -10^7 <= k <= 10^7
 * 2.
 * Тестовый класс {@link SubarraySumEqualsK560Test}
 * 3.
 * Временная сложность: O(N), где N - количество чисел во входном массиве. Проходим по массиву один раз, и для каждого
 * элемента выполняем операции с хэш-таблицей (вставка и поиск), которые в среднем занимают O(1).
 * Пространственная сложность: O(N), где N - количество уникальных префиксных сумм. В худшем случае, если все префиксные
 * суммы уникальны, хэш-таблица будет содержать N элементов.
 */
public class SubarraySumEqualsK560 {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSum = new HashMap<>();
        int result = 0;
        // префиксная сумма со значением 0 встречалась 1 раз
        prefixSum.put(0, 1);

        int sum = 0;
        for (int num : nums) {
            // Вычисляем текущую префиксную сумму
            sum += num;

            // Если (sum - k) есть в хэш-таблице, добавляем количество таких сумм к результату
            if (prefixSum.containsKey(sum - k)) {
                result += prefixSum.get(sum - k);
            }

            // Обновляем хэш-таблицу: увеличиваем количество для текущей префиксной суммы
            prefixSum.merge(sum, 1, Integer::sum);
        }

        return result;
    }
}
