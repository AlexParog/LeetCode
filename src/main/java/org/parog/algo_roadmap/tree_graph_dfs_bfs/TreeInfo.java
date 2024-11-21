package org.parog.algo_roadmap.tree_graph_dfs_bfs;

/**
 * Вспомогательный класс для задачи {@link BalancedBinaryTree110}.
 */
public class TreeInfo {
    /**
     * Является ли дерево сбалансированным.
     */
    private boolean balanced;
    /**
     * Высота дерева.
     */
    private int height;

    public TreeInfo(boolean balanced, int height) {
        this.balanced = balanced;
        this.height = height;
    }

    public boolean isBalanced() {
        return balanced;
    }

    public void setBalanced(boolean balanced) {
        this.balanced = balanced;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
