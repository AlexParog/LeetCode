package org.parog.algo_roadmap.trie;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Реализация дерева префиксов и суффиксов
 */
public class TrieNode {
    /**
     * Хранит все буквы, следующие за текущей буквой (TrieNodes)
     */
    public Map<Character, TrieNode> children;
    /**
     * Хранит все слова, которые разделяют текущий префикс/суффикс
     */
    public Set<String> words;

    /**
     * Конструктор
     */
    public TrieNode() {
        children = new HashMap<>();
        words = new HashSet<>();
    }
}
