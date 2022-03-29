 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) return true;
        return isMirrorTree(root.left, root.right);
    }

    public boolean isMirrorTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        return root1.val == root2.val && isMirrorTree(root1.left, root2.right)
            && isMirrorTree(root1.right, root2.left);
    }
}

