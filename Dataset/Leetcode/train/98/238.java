 class Solution {
    long cur = Long.MIN_VALUE;
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        boolean left = XXX(root.left);
        if(root.val <= cur) return false;
        cur = root.val;
        boolean right = XXX(root.right);
        return left && right;
    }
}

