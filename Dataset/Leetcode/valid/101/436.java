 class Solution {
    public boolean XXX(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode left, TreeNode right) {
        if (left==null && right == null) return true;
        if (left== null || right == null) return false;
        if (left.val != right.val) return false;
        return check(left.left, right.right) && check(left.right, right.left);
    }
}

