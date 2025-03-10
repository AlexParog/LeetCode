package org.parog.algo_roadmap.tree_graph_dfs_bfs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link KeysAndRooms841}
 */
public class KeysAndRooms841Test {
    @Test
    void KeysAndRooms841Test1() {
        assertThat(KeysAndRooms841.canVisitAllRoomsByDFS(List.of(
                List.of(1),
                List.of(2),
                List.of(3), List.of()))).isEqualTo(true);
    }

    @Test
    void KeysAndRooms841Test2() {
        assertThat(KeysAndRooms841.canVisitAllRoomsByDFS(List.of(
                List.of(1, 3),
                List.of(3, 0, 1),
                List.of(2),
                List.of(0)))).isEqualTo(false);
    }

    @Test
    void KeysAndRooms841Test3() {
        assertThat(KeysAndRooms841.canVisitAllRoomsByDFS(List.of(
                List.of(2),
                List.of(),
                List.of(1)))).isEqualTo(true);
    }

    @Test
    void KeysAndRooms841Test4() {
        assertThat(KeysAndRooms841.canVisitAllRoomsByDFS(List.of(
                List.of(1, 3),
                List.of(1, 4),
                List.of(2, 3, 4, 1),
                List.of(),
                List.of(4, 3, 2)))).isEqualTo(true);
    }

    @Test
    void KeysAndRooms841Test5() {
        assertThat(KeysAndRooms841.canVisitAllRoomsByBFS(List.of(
                List.of(1),
                List.of(2),
                List.of(3), List.of()))).isEqualTo(true);
    }

    @Test
    void KeysAndRooms841Test6() {
        assertThat(KeysAndRooms841.canVisitAllRoomsByBFS(List.of(
                List.of(1, 3),
                List.of(3, 0, 1),
                List.of(2),
                List.of(0)))).isEqualTo(false);
    }

    @Test
    void KeysAndRooms841Test7() {
        assertThat(KeysAndRooms841.canVisitAllRoomsByBFS(List.of(
                List.of(1, 3),
                List.of(1, 4),
                List.of(2, 3, 4, 1),
                List.of(),
                List.of(4, 3, 2)))).isEqualTo(true);
    }

    @Test
    void KeysAndRooms841Test8() {
        assertThat(KeysAndRooms841.canVisitAllRoomsByBFS(List.of(
                List.of(2),
                List.of(),
                List.of(1)))).isEqualTo(true);
    }
}
