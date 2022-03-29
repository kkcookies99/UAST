 class Solution {
    public int XXX(TreeNode root) {
        if (null == root)
            return 0;
        int l = XXX(root.left);
        int r = XXX(root.right);
        if (l == 0 ^ r == 0)
            return 1 + Math.max(l, r);
        else 
            return 1 + Math.min(l, r);
    }
}

