package org.parog.algo_roadmap.arrays_hashing;

/**
 * 1.
 * Диапазон длины матрицы: 1 <= logs.length <= 100
 * Диапазон годов: 1950 <= birthi < deathi <= 2050
 * 2.
 * Тестовый класс {@link MaximumPopulationYear1854Test}
 * 3.
 * Временная сложность: O(n), где n — количество записей в logs. Мы проходим по массиву logs дважды:
 * первый раз для подсчета изменений популяции и второй раз для нахождения года с максимальной популяцией.
 * Пространственная сложность: O(1) - так как используем фиксированный массив populationChanges длиной 101
 */
public class MaximumPopulationYear1854 {
    public static int maximumPopulation(int[][] logs) {
        // Массив для годов от 1950 до 2050 включительно
        int[] populationInYear = new int[101];

        // отмечаем даты рождения и даты смерти
        for (int[] period : logs) {
            populationInYear[period[0] - 1950]++; // дата рождения
            populationInYear[period[1] - 1950]--; // дата смерти
        }

        int maxPopulation = 0;
        int currentPopulation = 0;
        int minYearWithMaxPeople = 1950;

        /*
        Идем по фиксированному массиву размеров 101, просматривая каждый год:
        1. Находим глобальный максимум по наибольшему количеству людей, живших в один год
        2. Находим такой год: 1950 (минимальное возможное значение) + индекс года, где жили наибольшее количество
            - minYearWithMaxPeople всегда покажет минимальный год, так как по хронологии он всегда будет слева
         */
        for (int year = 0; year < populationInYear.length; year++) {
            currentPopulation += populationInYear[year];
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                minYearWithMaxPeople = 1950 + year;
            }
        }

        return minYearWithMaxPeople;
    }
}
