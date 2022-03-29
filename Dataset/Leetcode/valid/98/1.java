 class Solution {
    double last = -Double.MAX_VALUE;
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (XXX(root.left)) {
            if (last < root.val) {
                last = root.val;
                return XXX(root.right);
            }
        }
        return false;
    }
}

