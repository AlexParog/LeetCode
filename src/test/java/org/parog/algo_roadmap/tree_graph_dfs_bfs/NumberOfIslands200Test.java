package org.parog.algo_roadmap.tree_graph_dfs_bfs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link NumberOfIslands200}
 */
public class NumberOfIslands200Test {
    @Test
    void NumberOfIslands200Test1() {
        assertThat(NumberOfIslands200.numIslands(new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}})).isEqualTo(1);
    }

    @Test
    void NumberOfIslands200Test2() {
        assertThat(NumberOfIslands200.numIslands(new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}})).isEqualTo(3);
    }

    @Test
    void NumberOfIslands200Test3() {
        assertThat(NumberOfIslands200.numIslands(new char[][]{
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'}})).isEqualTo(1);
    }

    @Test
    void NumberOfIslands200Test4() {
        assertThat(NumberOfIslands200.numIslands(new char[][]{
                {'1', '0', '1', '1', '1'},
                {'1', '0', '1', '0', '1'},
                {'1', '0', '1', '0', '1'},
                {'1', '1', '1', '0', '1'}})).isEqualTo(1);
    }

    @Test
    void NumberOfIslands200Test5() {
        assertThat(NumberOfIslands200.numIslands(new char[][]{
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}})).isEqualTo(0);
    }
}
