package org.parog.algo_roadmap.tree_graph_dfs_bfs;

import java.util.Objects;

/**
 * Вспомогательный класс для решения задач Tree Node (деревья)
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TreeNode)) return false;

        TreeNode treeNode = (TreeNode) o;

        // Рекурсивно сравниваем текущий узел по значению и левое/правое поддеревья
        return val == treeNode.val &&
                Objects.equals(left, treeNode.left) &&
                Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        // Используем utility метод Objects.hash для вычисления уникального hash-кода
        return Objects.hash(val, left, right);
    }
}
