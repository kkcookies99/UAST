class Solution {
    public int XXX(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int ld = XXX(root.left);
        int rd = XXX(root.right);
        return ld > rd ? ld + 1 : rd + 1;
    }
}

