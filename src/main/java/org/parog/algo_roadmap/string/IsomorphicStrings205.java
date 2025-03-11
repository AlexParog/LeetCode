package org.parog.algo_roadmap.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.
 * Диапазон длины строки: 1 <= s.length <= 5 * 10^4
 * Длины строк s и t равны: t.length == s.length
 * s и t состоят из валидных ascii символов.
 * 2.
 * Тестовый класс {@link IsomorphicStrings205Test}
 */
public class IsomorphicStrings205 {
    /**
     * Временная сложность: O(N), где N - количество символ в строках s и t (длины строк равны).
     * Пространственная сложность: O(N), где N - количество символов в мапе.
     *
     * @param s входящая строка s.
     * @param t входящая строка t.
     * @return true, если строки изоморфны.
     */
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char symbolS = s.charAt(i);
            char symbolT = t.charAt(i);

            if ((mapST.containsKey(symbolS) && mapST.get(symbolS) != symbolT) ||
                    (mapTS.containsKey(symbolT) && mapTS.get(symbolT) != symbolS)) {
                return false;
            }
            mapST.put(symbolS, symbolT);
            mapTS.put(symbolT, symbolS);
        }

        return true;
    }

    /**
     * Временная сложность: O(N), где N - количество символ в строках s и t (длины строк равны).
     * Пространственная сложность: O(1), так как используем константное значение в памяти.
     *
     * @param s входящая строка s.
     * @param t входящая строка t.
     * @return true, если строки изоморфны.
     */
    public static boolean optimizedIsIsomorphic(String s, String t) {
        int[] mapST = new int[256];
        int[] mapTS = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char symbolS = s.charAt(i);
            char symbolT = t.charAt(i);

            if ((mapST[symbolS] != 0 && mapST[symbolS] != symbolT) ||
                    (mapTS[symbolT] != 0 && mapTS[symbolT] != symbolS)) {
                return false;
            }
            mapST[symbolS] = symbolT;
            mapTS[symbolT] = symbolS;
        }

        return true;
    }
}
