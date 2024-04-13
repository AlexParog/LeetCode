package org.parog.algo_roadmap.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.
 * Диапазон длин строк s, t: 1 <= s.length, t.length <= 5 * 10^
 * S и T строчные английские буквы в кодировке ASCII
 * 2.
 * Тестовый класс {@link ValidAnagram242Test}
 * 3.
 * (1) isAnagram
 * Сложность по времени: так как применяем встроенную сортировку массивов, то сложность по времени будет O(N logN)
 * Сложность по памяти: алгоритм создает два дополнительных char[], каждый из которых имеет длину S или T - O(N)
 * (2) isAnagramV2
 * Сложность по времени: O(N), где N - длина строки:
 * - Итерация по строкам и операции с хеш-таблицей (вставка и поиск) имеют в среднем сложность O(1).
 * - Поэтому общее время выполнения линейно зависит от длины строк.
 * Сложность по памяти: O(N) в худшем случае, когда все символы в строках разные.
 * - В этом случае в хеш-таблице будет храниться N элементов.
 */
public class ValidAnagram242 {
    /**
     * Реализация через массивы и встроенную сортировку.
     *
     * @param s строка 1
     * @param t строка 2
     * @return true - s и t анаграммы, иначе false
     */
    public static boolean isAnagram(String s, String t) {
        if (s.isEmpty() && t.isEmpty()) return false;

        if (s.length() == t.length()) {
            return checkAnagram(s, t);
        }
        return false;
    }

    /**
     * Реализация через HashMap.
     *
     * @param s строка 1
     * @param t строка 2
     * @return true - s и t анаграммы, иначе false
     */
    public static boolean isAnagramV2(String s, String t) {
        if (s.isEmpty() && t.isEmpty()) return false;

        Map<Character, Integer> hashMapS = new HashMap<>();
        Map<Character, Integer> hashMapT = new HashMap<>();

        for (char c : s.toCharArray()) {
            hashMapS.put(c, hashMapS.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            hashMapT.put(c, hashMapT.getOrDefault(c, 0) + 1);
        }

        // Если хеш-таблицы содержат одинаковые ключи с одинаковыми значениями (то есть, частоты символов совпадают),
        // то строки являются анаграммами
        return hashMapS.equals(hashMapT);
    }


    /**
     * Превращаем строки в массивы char, сортируем стандартной сортировкой (быстрой),
     * далее сравниваем массивы поэлементно.
     *
     * @param s строка 1
     * @param t строка 2
     * @return true - символы в отсортированном порядке равны, иначе false
     */
    private static boolean checkAnagram(String s, String t) {
        // O(N)
        char[] charArrS = s.toCharArray();
        char[] charArrT = t.toCharArray();

        // O(N logN)
        Arrays.sort(charArrS);
        Arrays.sort(charArrT);

        // O(N)
        return Arrays.equals(charArrS, charArrT);
    }
}
