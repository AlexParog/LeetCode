package org.parog.algo_roadmap.tree_graph_dfs_bfs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link InvertBinaryTree226}
 */
public class InvertBinaryTree226Test {

    @Test
    void InvertBinaryTree226Test1() {
        assertThat(InvertBinaryTree226.invertTree(new TreeNode(2,
                new TreeNode(1, null, null),
                new TreeNode(3, null, null))))
                .isEqualTo(new TreeNode(2,
                        new TreeNode(3, null, null),
                        new TreeNode(1, null, null)));
    }

    @Test
    void InvertBinaryTree226Test2() {
        assertThat(InvertBinaryTree226.invertTree(null))
                .isEqualTo(null);
    }

    @Test
    void InvertBinaryTree226Test3() {
        assertThat(InvertBinaryTree226.invertTree(new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1, null, null),
                        new TreeNode(3, null, null)),
                new TreeNode(7,
                        new TreeNode(6, null, null),
                        new TreeNode(9, null, null)))))
                .isEqualTo(new TreeNode(4,
                        new TreeNode(7,
                                new TreeNode(9, null, null),
                                new TreeNode(6, null, null)),
                        new TreeNode(2,
                                new TreeNode(3, null, null),
                                new TreeNode(1, null, null))));
    }

    @Test
    void InvertBinaryTree226Test4() {
        assertThat(InvertBinaryTree226.invertTree(new TreeNode(5,
                new TreeNode(9,
                        new TreeNode(4, null, null),
                        new TreeNode(6,
                                new TreeNode(7, null, null),
                                new TreeNode(13, null, null))),
                new TreeNode(7,
                        null,
                        new TreeNode(11,
                                new TreeNode(6, null, null),
                                null)))))
                .isEqualTo(new TreeNode(5,
                        new TreeNode(7,
                                new TreeNode(11, null,
                                        new TreeNode(6, null, null)),
                                null),
                        new TreeNode(9,
                                new TreeNode(6,
                                        new TreeNode(13, null, null),
                                        new TreeNode(7, null, null)),
                                new TreeNode(4,
                                        null,
                                        null))));
    }
}
