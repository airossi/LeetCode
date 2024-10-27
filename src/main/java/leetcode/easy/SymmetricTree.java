package leetcode.easy;

import leetcode.models.TreeNode;

public class SymmetricTree {

    public SymmetricTree() {
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        return areSymmetricTrees(root.getLeft(), root.getRight());
    }

    private boolean areSymmetricTrees(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;

        if (left == null || right == null || left.getVal() != right.getVal())
            return false;

        return areSymmetricTrees(left.getLeft(), right.getRight()) && areSymmetricTrees(left.getRight(), right.getLeft());
    }
}
