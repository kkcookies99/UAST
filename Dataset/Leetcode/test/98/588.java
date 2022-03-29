 class Solution {
    TreeNode prev = null;
    public boolean XXX(TreeNode root) {
        if (root == null) return true;
        if (!XXX(root.left)) return false;
        if (prev != null && root.val <= prev.val) return false;
        prev = root;
        return XXX(root.right);
    }
}


