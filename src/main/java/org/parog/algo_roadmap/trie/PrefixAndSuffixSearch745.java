package org.parog.algo_roadmap.trie;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 1.
 * Диапазон массива слов внутри словаря: 1 <= words.length <= 10^4
 * Диапазон длины слова: 1 <= words[i].length <= 7
 * Диапазон длины префикса и суффикса: 1 <= pref.length, suff.length <= 7
 * words[i], pref и suff состоят только из строчных английских букв.
 * Не более 10^4 вызовов будет сделано к функции f.
 * 2.
 * Тестовый класс {@link PrefixAndSuffixSearch745Test}
 * 3.
 * Временная сложность: O(P + S), где P - длина префикса, S - длина суффикса. Перебор всех слов с данным префиксом
 * и суффиксом также занимает время, пропорциональное количеству таких слов, что в худшем случае может быть O(N), где
 * N - количество слов.
 * Пространственная сложность: O(N * L^2), в худшем случае из-за необходимости хранения всех комбинаций префиксов и
 * суффиксов вместе с набором слов, которые они представляют.
 */
public class PrefixAndSuffixSearch745 {

    /**
     * Корневые узлы для префикса и суффикса
     */
    private TrieNode rootP, rootS;
    /**
     * Мапа, хранящая слово и его последний индекс в массиве words
     */
    private Map<String, Integer> indexes;

    /**
     * Конструктор специального словаря, в котором поиск слов осуществляется по префиксу и суффиксу.
     *
     * @param words слова
     */
    public PrefixAndSuffixSearch745(String[] words) {
        rootP = new TrieNode();
        rootS = new TrieNode();
        indexes = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
            indexes.put(words[i], i);
        }
    }

    /**
     * Возвращает индекс слова в словаре, которое имеет префикс pref и суффикс suff. Если существует более одного
     * допустимого индекса, возвращается наибольший из них. Если такого слова в словаре нет, возвращается -1.
     * <p>
     * Временная сложность: O(P + S), где P - длина префикса, S - длина суффикса. Перебор всех слов с данным префиксом
     * и суффиксом также занимает время, пропорциональное количеству таких слов, что в худшем случае может быть O(N), где
     * N - количество слов.
     * Пространственная сложность: O(N * L) - использование Trie для префиксов и суффиксов требует хранения всех узлов
     * и слов, что в худшем случае потребует.
     *
     * @param pref префикс
     * @param suff суффикс
     * @return индекс слова в словаре, которое имеет префикс pref и суффикс suff, иначе -1
     */
    public int f(String pref, String suff) {
        //
        TrieNode patterPref = rootP, patternSuff = rootS;

        // достаем все уникальные слова, начинающиеся на префикс
        // идем по префиксному дереву вглубь
        for (int i = 0; i < pref.length(); i++) {
            char c = pref.charAt(i);
            // Если в какой-то момент нужный узел не найден, возвращаем -1.
            if (!patterPref.children.containsKey(c)) return -1;
            patterPref = patterPref.children.get(c);
        }
        // уникальные слова, начинающиеся на префикс
        Set<String> prefixes = patterPref.words;

        // достаем все уникальные слова, заканчивающиеся на суффикс
        // идем по суффиксному дереву вглубь
        for (int i = 0; i < suff.length(); i++) {
            char c = suff.charAt(suff.length() - 1 - i);
            if (!patternSuff.children.containsKey(c)) return -1;
            patternSuff = patternSuff.children.get(c);
        }
        // уникальные слова, заканчивающиеся на преффикс
        Set<String> suffixes = patternSuff.words;

        int index = -1;
        for (String word : prefixes)
            // Если слово также содержится в множестве слов с данным суффиксом, проверяем его индекс
            // и обновляем максимальный найденный индекс.
            if (suffixes.contains(word))
                index = Math.max(index, indexes.get(word));

        return index;
    }

    /**
     * Строим префиксное и суффиксное дерево. Для префиксного дерево слева->направо, для суффиксного справа->налево.
     * Каждый префикс или суффикс, если у него дочерний узел, хранит в себе множество уникальных слов, связанных
     * с текущим префиксом или суффиксом. Количество элементов в Map корневых элементах rootP, rootS:
     * 1. для rootP - это количество уникальных дочерних элементов слева->направо (т.е. слова, начинающиеся на уникальную букву)
     * 2.для rootS - это количество уникальных дочерних элементов справа->налево (т.е. слова, начинающиеся на уникальную букву)
     * <p>
     * Временная сложность: O(N * L), где L - длина слова, N - количество слов. Для каждого слова мы добавляем его в
     * префиксный, суффиксный Trie, что занимает O(L).
     * Пространственная сложность: O(N * L) - использование Trie для префиксов и суффиксов требует хранения всех узлов
     * и слов, что в худшем случае потребует.
     *
     * @param word слова
     */
    private void insert(String word) {
        TrieNode patterPref = rootP, patternSuff = rootS;
        for (int i = 0; i < word.length(); i++) {
            //Для префиксного trie мы идем по символам слова слева->направо
            char c = word.charAt(i);
            // Если текущий символ отсутствует в children текущего узла, создаем новый узел и добавляем его
            if (!patterPref.children.containsKey(c))
                patterPref.children.put(c, new TrieNode());
            // Переходим к следующему узлу
            patterPref = patterPref.children.get(c);
            // сохраняем слово, связанное с текущим префиксом
            patterPref.words.add(word);

            // Для суффиксного trie мы идем по символам слова справа->налево
            c = word.charAt(word.length() - 1 - i);
            if (!patternSuff.children.containsKey(c))
                patternSuff.children.put(c, new TrieNode());
            patternSuff = patternSuff.children.get(c);
            // сохраняем слово, связанное с текущим суффиксом
            patternSuff.words.add(word);
        }
    }
}
