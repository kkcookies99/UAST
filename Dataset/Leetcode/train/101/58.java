 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }
    
    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null) return right == null;
        if (right == null) return left == null;
        return left.val == right.val
            && isMirror(left.left, right.right)
            && isMirror(left.right, right.left);
    }
}

