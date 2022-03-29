class Solution {
    public int XXX(TreeNode root) {
        if(root == null)
            return 0;
        int lh = XXX(root.left);
        int rh = XXX(root.right);
        // 可能是叶子也可能是左右孩子为空
        if(lh == 0 || rh == 0)
            return lh + rh + 1;
        // 左右孩子都不为空，返回最小深度
        return Math.min(lh, rh) + 1;
    }
}

