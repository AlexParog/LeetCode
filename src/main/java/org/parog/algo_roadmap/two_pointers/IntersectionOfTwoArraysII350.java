package org.parog.algo_roadmap.two_pointers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * 1.
 * Длина массивов nums1, nums2: 1 <= nums1.length, nums2.length <= 1000
 * Диапазон элементов массивов: 0 <= nums1[i], nums2[i] <= 1000
 * 2.
 * Тестовый класс {@link IntersectionOfTwoArraysII350Test}
 */
public class IntersectionOfTwoArraysII350 {

    /**
     * Реализация через HashMap.
     * <p>
     * Временная сложность: O(m + n), где m и n - длины массивов nums1 и nums2 соответственно.
     *  Создание HashMap: O(m) в среднем случае для put/get/containsKey в HashMap.
     *  Проход по largerArr: O(n)
     *  Преобразование результата в массив: O(k), где k - количество элементов в пересечении.
     * Пространственная сложность: O(m) для хранения элементов smallestArr в HashMap.
     *
     * @param nums1 массив 1
     * @param nums2 массив 2
     * @return пересечение с повторениями
     */
    public static int[] intersectWithHashMap(int[] nums1, int[] nums2) {
        int[] smallestArr, largerArr;
        if (nums1.length >= nums2.length) {
            smallestArr = nums2;
            largerArr = nums1;
        } else {
            smallestArr = nums1;
            largerArr = nums2;
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : smallestArr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersection = new ArrayList<>();
        for (int num : largerArr) {
            // Проверяем, содержится ли число в Map и встречается ли оно больше 0 раз
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                intersection.add(num);
                // Уменьшаем счетчик числа в Map, так как мы его уже учли в результате
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }

        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }


    /**
     * Реализация через два указателя.
     * <p>
     * Временная сложность: O(m log m + n log n + m + n)
     *  Сортировка nums1: O(m log m)
     *  Сортировка nums2: O(n log n)
     *  Проход по отсортированным массивам с двумя указателями: O(m + n)
     *  Преобразование результата в массив: O(k)
     * Пространственная сложность: O(log m + log n) (или O(1) в зависимости от реализации сортировки)
     * + O(k) для хранения результата.
     *
     * @param nums1 массив 1
     * @param nums2 массив 2
     * @return пересечение с повторениями
     */
    public static int[] intersectWithTwoPointers(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int indexNums1 = 0;
        int indexNums2 = 0;

        List<Integer> intersection = new ArrayList<>();
        while (indexNums1 < nums1.length && indexNums2 < nums2.length) {
            if (nums1[indexNums1] == nums2[indexNums2]) {
                intersection.add(nums1[indexNums1]);
                indexNums1++;
                indexNums2++;
            } else if (nums1[indexNums1] < nums2[indexNums2]) {
                indexNums1++;
            } else {
                indexNums2++;
            }
        }

        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }

    /**
     * Находит пересечение двух отсортированных массивов, когда второй массив хранится на диске и не может быть
     * полностью загружен в память.
     *
     * @param nums1     Первый отсортированный массив, который может быть загружен в память.
     * @param nums2File Путь к файлу, содержащему второй отсортированный массив (числа разделены запятыми).
     * @return Список элементов, входящих в пересечение обоих массивов.
     * @throws IOException Если возникает ошибка при чтении файла.
     */
    public static List<Integer> intersectWithLimitedMemory(int[] nums1, String nums2File) throws IOException {
        Arrays.sort(nums1);

        List<Integer> intersection = new ArrayList<>();
        int indexNums1 = 0;

        // Размер буфера для чтения из файла
        int bufferSize = 1024; // ограничение памяти

        try (BufferedReader reader = new BufferedReader(new FileReader(nums2File))) {
            // Читаем первую часть данных из файла
            int[] buffer = readAndSortChunk(reader, bufferSize);

            while (indexNums1 < nums1.length && buffer != null) {
                int indexBuffer = 0;
                // Сравниваем элементы nums1 и buffer
                while (indexNums1 < nums1.length && indexBuffer < buffer.length) {
                    if (nums1[indexNums1] == buffer[indexBuffer]) {
                        intersection.add(nums1[indexNums1]);
                        indexNums1++;
                        indexBuffer++;
                    } else if (nums1[indexNums1] < buffer[indexBuffer]) {
                        indexNums1++;
                    } else {
                        indexBuffer++;
                    }
                }

                // Читаем следующую часть данных, если текущая обработана
                buffer = readAndSortChunk(reader, bufferSize);
            }
        }

        return intersection;
    }

    /**
     * Читает часть данных (чанк) из файла, преобразует строки в числа и сортирует чанк.
     *
     * @param reader     BufferedReader для чтения из файла.
     * @param bufferSize Максимальный размер чанка.
     * @return Отсортированный массив чисел, прочитанных из файла, или null, если файл закончился.
     * @throws IOException Если возникает ошибка при чтении файла.
     */
    private static int[] readAndSortChunk(BufferedReader reader, int bufferSize) throws IOException {
        String[] line = reader.readLine().split(","); // Предполагаем, что числа разделены запятыми
        int[] chunk = new int[Math.min(line.length, bufferSize)];
        for (int i = 0; i < chunk.length; i++) {
            chunk[i] = Integer.parseInt(line[i]);
        }
        Arrays.sort(chunk);
        return chunk.length > 0 ? chunk : null; // Возвращаем null, если файл закончился
    }
}
