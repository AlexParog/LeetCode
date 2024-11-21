package org.parog.algo_roadmap.tree_graph_dfs_bfs;

/**
 * 1.
 * Количество TreeNode в дереве находится в диапазоне [0,5000]
 * Диапазон значений TreeNode: -10^4 <= Node.val <= 10^4
 * 2.
 * Тестовый класс {@link BalancedBinaryTree110Test}
 */
public class BalancedBinaryTree110 {
    /**
     * В худшем случае (например, для вырожденного дерева, похожего на список), isBalanced() вызывается для каждого узла,
     * и для каждого вызова isBalanced() мы дважды вызываем getTreeHeight() (для левого и правого поддерева). Получается,
     * что для каждого узла мы выполняем операцию с O(N) сложностью. Это приводит к общей временной сложности O(N^2).
     * <p>
     * Временная сложность: O(N^2), где n - максимальное количество узлов в дереве.
     * Пространственная сложность: O(N), так как мы используем рекурсию, то стек вызовов методов будет заполняться,
     * поэтому он будет равен максимальному количеству узлов во входящем дереве.
     *
     * @param root входящее дерево
     * @return сбалансировано или нет
     */
    public static boolean isBalancedV1(TreeNode root) {
        if (root == null) {
            return true;
        }

        // главное условие: дерево является сбалансированным, если разница в высоте поддеревьев не больше 1
        if (Math.abs(getTreeHeight(root.left) - getTreeHeight(root.right)) > 1) {
            return false;
        }

        return Math.abs(getTreeHeight(root.left) - getTreeHeight(root.right)) <= 1;
    }

    /**
     * Временная сложность: O(N), где n - максимальное количество узлов в дереве, каждое из которых мы проходим ровно
     * один раз: одновременно проверяла баланс и возвращала высоту поддерева.
     * Пространственная сложность: O(N), так как мы используем рекурсию, то стек вызовов методов будет заполняться,
     * поэтому он будет равен максимальному количеству узлов во входящем дереве.
     *
     * @param root входящее дерево
     * @return сбалансировано или нет
     */
    public static boolean isBalancedV2(TreeNode root) {
        return isBalancedOptimized(root).isBalanced();
    }

    /**
     * Рекурсивно проверяет баланс и возвращает информацию о балансе и высоте поддерева. Функция isBalanced() вызывает
     * isBalancedOptimized() и возвращает только информацию о балансе.
     *
     * @param root входящее дерево
     * @return структура, которая одновременно определяет сбалансировано ли дерево и высоту.
     */
    private static TreeInfo isBalancedOptimized(TreeNode root) {
        if (root == null) {
            return new TreeInfo(true, 0);
        }

        TreeInfo left = isBalancedOptimized(root.left);
        TreeInfo right = isBalancedOptimized(root.right);

        // проверяем баланс дерева
        if (!left.isBalanced() || !right.isBalanced()) {
            return new TreeInfo(false, -1);
        }

        // дерево является сбалансированным, если разница в высоте поддеревьев не больше 1
        if (Math.abs(left.getHeight() - right.getHeight()) > 1) {
            return new TreeInfo(false, -1);
        }

        return new TreeInfo(true, 1 + Math.max(left.getHeight(), right.getHeight()));
    }

    /**
     * Рекурсивно вычисляем высоту веток деревьев, которая равна 1 (текущий узел) плюс
     * максимум среди высот левого и правого поддерева.
     *
     * @param currentTreeNode текущий узел поддерева
     * @return высота поддерева
     */
    private static int getTreeHeight(TreeNode currentTreeNode) {
        if (currentTreeNode == null) {
            return 0;
        }

        int leftTreeHeight = getTreeHeight(currentTreeNode.left);
        int rightTreeHeight = getTreeHeight(currentTreeNode.right);

        return 1 + Math.max(leftTreeHeight, rightTreeHeight);
    }
}
