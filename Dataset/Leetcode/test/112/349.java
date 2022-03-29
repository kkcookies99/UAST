 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if (null == root) return false;
        int t = targetSum - root.val;
        if (t == 0 && null == root.left && null == root.right) return true;
        return XXX(root.left, t) || XXX(root.right, t);
    }
}

