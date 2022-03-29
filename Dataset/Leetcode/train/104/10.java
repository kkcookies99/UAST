class Solution {
    public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = XXX(root.left);
        int right = XXX(root.right);
        return Math.max(left, right) + 1;
    }
}

