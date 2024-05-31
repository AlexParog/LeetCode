package org.parog.algo_roadmap.arrays_hashing;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.
 * Диапазон списка и строки: 0 <= strs.length < 100
 * Диапазон элемента списка: 0 <= strs[i].length < 200
 * Символы элемента списка относится только к кодировке UTF-8
 * 2.
 * Тестовый класс {@link EncodeAndDecodeStrings271Test}
 * 3.
 * Временная сложность: O(n), где n количество символов в строке или количество слов в списке
 * Пространственная сложность: O(n), где n количество символов в строке или количество слов в списке
 */
public class EncodeAndDecodeStrings271 {
    /**
     * Проходимся по каждому слову списка и добавляем количество букв в текущем слове, а также разделительный символ #
     * с последующим словом.
     *
     * @param strs список слов
     * @return зашифрованная строка
     */
    public static String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        for (String s : strs) {
            builder.append(s.length()).append("#").append(s);
        }

        return builder.toString();
    }

    /**
     * Считываем длину каждого слова до символа #, далее добавляем n-ое количество символов слова в результирующий список
     *
     * @param str зашифрованная строка
     * @return расшифрованный список слов
     */
    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            // пропускаем символ # и останавливаемся на длине следующего слова, не считая этого символа
            i = j + 1 + length;
            result.add(str.substring(j + 1, i));
        }

        return result;
    }
}
