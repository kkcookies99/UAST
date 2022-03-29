 class Solution {
    public int XXX(TreeNode root) {
        if (root==null) return 0;
        int ld = XXX(root.left);
        int rd = XXX(root.right);
        if (ld==0&&rd==0) return 1;
        else if (ld==0) return 1 + rd;
        else if (rd==0) return 1 + ld;
        else return 1 + Math.min(ld, rd);
    }
}

