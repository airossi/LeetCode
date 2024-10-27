package leetcode.easy;

import leetcode.models.TreeNode;

public class MaximumDepthBinaryTree {

    public MaximumDepthBinaryTree() {
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
    }
}
