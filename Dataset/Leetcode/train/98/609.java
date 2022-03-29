 class Solution {
    private Integer val;
    public boolean XXX(TreeNode root) {
        if (root == null)
            return true;
        boolean left = XXX(root.left);
        if (val != null && val >= root.val)
            return false;
        val = root.val;
        boolean right = XXX(root.right);
        return left && right;
    }
}

