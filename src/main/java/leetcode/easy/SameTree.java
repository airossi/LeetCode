package leetcode.easy;

import leetcode.models.TreeNode;

public class SameTree {

    public SameTree() {}

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;

        if (p == null || q == null || p.getVal() != q.getVal())
            return false;

        return isSameTree(p.getLeft(), q.getLeft()) && isSameTree(p.getRight(), q.getRight());
    }
}
