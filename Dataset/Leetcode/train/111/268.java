class Solution {
    public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = XXX(root.left);
        int rh = XXX(root.right);
        if (lh >0 && rh > 0) {
            return Math.min(lh, rh) + 1;
        } else if (lh == 0 || rh == 0) {
            return Math.max(lh, rh) + 1;
        }
        return 0;
    }
}

