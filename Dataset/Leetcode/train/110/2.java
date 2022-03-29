class Solution {
    public boolean XXX(TreeNode root) {
        return height(root) >= 0;
    }

    private int height(TreeNode root) {
        if(root == null)
            return 0;
        int lh = height(root.left), rh = height(root.right);
        if(lh >= 0 && rh >= 0 && Math.abs(lh - rh) <= 1) {
            return Math.max(lh, rh) + 1;
        } else {
            return -1;
        }
    }
}

