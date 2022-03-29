class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        int l = 0, r = 0;
        l = XXX(root.left);
        r = XXX(root.right);
        return l == 0 ? (r == 0 ? 1 : r + 1) : ((r == 0 ? l+1 : Math.min(l,r) + 1));
    }
}

