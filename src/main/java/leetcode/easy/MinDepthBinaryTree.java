package leetcode.easy;

import leetcode.models.TreeNode;

public class MinDepthBinaryTree {

    public MinDepthBinaryTree() {
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return minWithDepth(root, 1);
    }

    private int minWithDepth(TreeNode root, int depth) {
        if (root.getLeft() == null && root.getRight() == null) {
            return depth;
        }
        if (root.getLeft() != null && root.getRight() != null)
            return Math.min(minWithDepth(root.getLeft(), depth + 1), minWithDepth(root.getRight(), depth + 1));
        if (root.getLeft() != null) {
            return minWithDepth(root.getLeft(), depth + 1);
        } else {
            return minWithDepth(root.getRight(), depth + 1);
        }
    }
}
