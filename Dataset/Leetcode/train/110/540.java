class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) {
            return true;
        }
        int ld = depth(root.left);
        int rd = depth(root.right);
        if(Math.abs(ld-rd) <= 1) {
            return XXX(root.left) && XXX(root.right);
        } else {
            return false;
        }
    }

    public int depth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int ld = depth(root.left) + 1;
        int rd = depth(root.right) + 1;
        return ld > rd ? ld : rd;
    }
}

