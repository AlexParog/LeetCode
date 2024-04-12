package org.parog.algo_roadmap.string;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 1.
 * Диапазон вводимого числа: 1 <= num <= 3999
 * 2.
 * Тестовый класс {@link IntegerToRoman12Test}
 * 3.
 * Сложность по времени зависит от входного числа num и может быть выражена как O(num) в худшем случае, в среднем O(1).
 * Сложность по памяти зависит от входного числа num и может быть выражена как O(num) в худшем случае, в среднем O(1).
 * Асимптотика у обоих алгоритмов одинаковая, все зависит от входящего num.
 */
public class IntegerToRoman12 {
    /**
     * Более гибкий подход для решения задачи Integer to Roman,
     * так как можно легко расширять в будущем за счет добавления
     * новых пар "число-римская цифра" в LinkedHashMap.
     *
     * @param num число
     * @return римская запись
     */
    public static String intToRoman(int num) {
        if (num < 1) return "Bad num";

        final Map<Integer, String> intToRoman = initLinkedHashMap();
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, String> entry : intToRoman.entrySet()) {
            // медленнее работает, чем простое вычитание через while
            int quotient = num / entry.getKey();
            if (quotient == 0) {
                continue;
            }

            num %= entry.getKey();
            result.append(String.valueOf(entry.getValue()).repeat(Math.max(0, quotient)));
        }

        return result.toString();
    }

    /**
     * Реализация через массивы key, value.
     * Эффективен для небольших диапазонов чисел,
     * но менее расширяем, чем реализация intToRoman через LinkedHashMap.
     *
     * @param num число
     * @return римская запись
     */
    public static String intToRomanV2(int num) {
        String[] key = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] value = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        StringBuilder s = new StringBuilder();
        for (int j = 12; j >= 0; j--) {
            while (num >= value[j]) {
                s.append(key[j]);
                num -= value[j];
            }
        }
        return s.toString();
    }

    /**
     * Инициализация упорядоченной LinkedHashMap римских цифр.
     */
    private static Map<Integer, String> initLinkedHashMap() {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        return map;
    }
}
