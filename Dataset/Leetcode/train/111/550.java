class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        int L = XXX(root.left);
        int R = XXX(root.right);
        if(L==0) return R + 1;
        else if (R==0) return L + 1;
        else return Math.min(L, R) + 1;
    }
}

