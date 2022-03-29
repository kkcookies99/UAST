 class Solution {
    long pre = Long.MIN_VALUE;
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        boolean left = XXX(root.left);
        if(root.val<=pre) return false;
        pre = root.val;
        boolean right = XXX(root.right);
        return left && right;
    }
}

