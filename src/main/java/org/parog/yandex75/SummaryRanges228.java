package org.parog.yandex75;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.
 * Длина массива: 0 <= nums.length <= 20
 * Диапазон значения элемента массива: -2^31 <= nums[i] <= 2^31 - 1
 * Все значения nums уникальны
 * nums сортируется в порядке возрастания
 * 2.
 * Тестовый класс {@link SummaryRanges228Test}
 * 3.
 * Временная сложность: O(N), где N - количество элементов в массиве nums
 * Пространственная сложность: O(N), где N - количество диапазонов в результирующем списке
 */
public class SummaryRanges228 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        }

        int rangeStart = nums[0];
        int rangeEnd = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 1 + nums[i - 1]) {
                addRange(result, rangeStart, rangeEnd);
                rangeStart = nums[i];
            }
            rangeEnd = nums[i];
        }

        addRange(result, rangeStart, rangeEnd);
        return result;
    }

    /**
     * Добавляем диапазон в список диапазонов:
     * 1. если один элемент в диапазоне: "rangeStart"
     * 2. иначе: "rangeStart->rangeEnd"
     * <p>
     * Данный метод "бьет" по временной сложности из-за конкатенации строк и чисел (5ms).
     * В 5 раз эффективнее иметь сразу StringBuilder и добавлять туда диапазоны.
     *
     * @param result     конечный список
     * @param rangeStart начала диапазона
     * @param rangeEnd   конец диапазона
     */
    private static void addRange(List<String> result, int rangeStart, int rangeEnd) {
        if (rangeStart != rangeEnd) {
            result.add(rangeStart + "->" + rangeEnd);
        } else {
            result.add(Integer.toString(rangeStart));
        }
    }

    /**
     * Реализация через StringBuilder. Основное преимущество этого метода — использование StringBuilder для
     * более эффективного построения строк, что может снизить накладные расходы на создание строковых объектов.
     *
     * @param nums отсортированный по возрастанию массив чисел
     * @return список диапазонов
     */
    public static List<String> summaryRangesWithStringBuilder(int[] nums) {
        List<String> list = new ArrayList<>();
        StringBuilder range = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1] - 1) {
                range.append(nums[i]).append("->");
                // идем до конца текущего диапазона
                while (i < nums.length - 1 && nums[i] == nums[i + 1] - 1) {
                    i++;
                }

                range.append(nums[i]);
                list.add(range.toString());
                // обнуляем диапазон
                range.setLength(0);
            } else {
                list.add(Integer.toString(nums[i]));
            }
        }
        return list;
    }
}
