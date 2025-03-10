package org.parog.algo_roadmap.tree_graph_dfs_bfs;

import java.util.*;

/**
 * 1.
 * Количество комнат равно длине массива rooms: n == rooms.length.
 * Диапазон номера комнаты: 2 <= n <= 1000.
 * Количество ключей в одной комнате: 0 <= rooms[i].length <= 1000.
 * Диапазон общего количества ключей во всех комнатах: 1 <= sum(rooms[i].length) <= 3000.
 * Ключи указывают на комнаты с корректными номерами: 0 <= rooms[i][j] < n.
 * Все значения rooms[i] уникальны: В каждой комнате ключи не повторяются.
 * 2.
 * Тестовый класс {@link KeysAndRooms841Test}
 * 3.
 * Временная сложность: O(N + K), где N — количество комнат (вершин графа), K — общее количество ключей (ребер графа).
 * Пространственная сложность: O(N) для хранения посещенных комнат и структуры данных (стека или очереди).
 */
public class KeysAndRooms841 {
    /**
     * Реализация DFS.
     *
     * @param rooms комнаты
     * @return true, если посетили все комнаты, иначе false
     */
    public static boolean canVisitAllRoomsByDFS(List<List<Integer>> rooms) {
        // посещенные комнаты
        Set<Integer> visited = new HashSet<>();

        // начинаем с 0 комнаты
        dfs(rooms, 0, visited);

        return visited.size() == rooms.size();
    }

    /**
     * Рекурсивная реализация DFS. Если комната уже посещена, функция завершается.
     * Иначе комната добавляется в visited, и функция рекурсивно вызывается для всех комнат, доступных из текущей.
     * DFS может использовать меньше памяти, если граф "узкий" (максимальная глубина меньше максимальной ширины).
     *
     * @param rooms   комнаты
     * @param room    текущая комната
     * @param visited посещенные комнаты
     */
    private static void dfs(List<List<Integer>> rooms, int room, Set<Integer> visited) {
        // если комнаты посещена, то пропускаем ее
        if (visited.contains(room)) {
            return;
        }

        // добавляем комнату в посещенные
        visited.add(room);
        // Рекурсивно посещаем все комнаты, доступные из текущей
        for (int key : rooms.get(room)) {
            dfs(rooms, key, visited);
        }
    }

    /**
     * Реализация BFS. Очередь используется для обхода графа в ширину. Пока очередь не пуста, извлекаем комнату,
     * добавляем ее соседей в очередь и помечаем их как посещенные. BFS может использовать больше памяти, если граф "широкий".
     *
     * @param rooms комнаты
     * @return true, если посетили все комнаты, иначе false
     */
    public static boolean canVisitAllRoomsByBFS(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offerFirst(0);
        visited[0] = true;

        while (!deque.isEmpty()) {
            int room = deque.pollFirst();
            // Добавляем в очередь все комнаты, доступные из текущей
            for (int key : rooms.get(room)) {
                if (!visited[key]) {
                    visited[key] = true;
                    deque.offerFirst(key);
                }
            }
        }

        for (boolean seen : visited) {
            if (!seen) return false;
        }

        return true;
    }


}
