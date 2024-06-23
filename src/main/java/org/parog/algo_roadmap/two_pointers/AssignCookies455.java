package org.parog.algo_roadmap.two_pointers;

import java.util.Arrays;

/**
 * 1.
 * Диапазон коэффициентов жадности: 1 <= g.length <= 3 * 10^4
 * Диапазон количества печенья: 0 <= s.length <= 3 * 10^4
 * Соотношение диапазонов: 1 <= g[i], s[j] <= 2^31 - 1
 * 2.
 * Тестовый класс {@link AssignCookies455Test}
 * 3.
 * Временная сложность: O(n log n + m log m), где n, m количество элементов в массивах g и s соответственно
 * Пространственная сложность: O(n + m) для прохода по массивам, что подходит для больших входных данных
 */
public class AssignCookies455 {
    public static int findContentChildren(int[] g, int[] s) {
        // необходимо, чтобы эффективно сопоставлять детей и печенья
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int cookie = 0;

        while (child < g.length && cookie < s.length) {
            // мы можем назначить печенье s[cookie] ребенку g[child], и ребенок g[child] будет доволен
            if (s[cookie] >= g[child]) {
                child++;
            }
            cookie++;
        }

        return child;
    }
}


