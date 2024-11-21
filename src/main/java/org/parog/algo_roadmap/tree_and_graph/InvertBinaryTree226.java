package org.parog.algo_roadmap.tree_and_graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1.
 * Количество TreeNode находится в диапазоне [0,100]
 * Диапазон значения TreeNode: -100 <= Node.val <= 100
 * 2.
 * Тестовый класс {@link InvertBinaryTree226Test}
 * 3.
 * Временная сложность: O(N), где n - общее количество узлов во входном дереве
 * Пространственная сложность: O(N), где n - максимальный размер очереди определяется шириной дерева
 * (максимальным количеством узлов на каком-либо уровне).
 */
public class InvertBinaryTree226 {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        // добавляем сразу корень в очередь
        queue.offer(root);

        while (!queue.isEmpty()) {
            // извлекаем текущий узел из очереди
            TreeNode currentTreeNode = queue.poll();

            // инвертируем дочерние узлы у текущего узла с помощью доп. переменной
            TreeNode temp = currentTreeNode.left;
            currentTreeNode.left = currentTreeNode.right;
            currentTreeNode.right = temp;

            // спускаемся на следующий уровень: добавляем инвертированные дочерние узлы в очередь для их обработки,
            // если они существуют
            if (currentTreeNode.left != null) {
                queue.offer(currentTreeNode.left);
            }
            if (currentTreeNode.right != null) {
                queue.offer(currentTreeNode.right);
            }
        }

        return root;
    }
}
