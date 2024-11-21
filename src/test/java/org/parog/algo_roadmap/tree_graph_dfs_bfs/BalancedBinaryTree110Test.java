package org.parog.algo_roadmap.tree_graph_dfs_bfs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link BalancedBinaryTree110}
 */
public class BalancedBinaryTree110Test {
    @Test
    void BalancedBinaryTree110Test1() {
        assertThat(BalancedBinaryTree110.isBalancedV2(new TreeNode(3,
                new TreeNode(9, null, null),
                new TreeNode(20,
                        new TreeNode(15, null, null),
                        new TreeNode(7, null, null)))))
                .isEqualTo(true);
    }

    @Test
    void BalancedBinaryTree110Test2() {
        assertThat(BalancedBinaryTree110.isBalancedV2(new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4, null, null),
                                new TreeNode(4, null, null)),
                        new TreeNode(3, null, null)),
                new TreeNode(2, null, null))))
                .isEqualTo(false);
    }

    @Test
    void BalancedBinaryTree110Test3() {
        assertThat(BalancedBinaryTree110.isBalancedV2(null))
                .isEqualTo(true);
    }

    @Test
    void BalancedBinaryTree110Test4() {
        assertThat(BalancedBinaryTree110.isBalancedV2(new TreeNode(1, null, null)))
                .isEqualTo(true);
    }
}
