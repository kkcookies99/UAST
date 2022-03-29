 class Solution {

    private TreeNode pre;

    public boolean XXX(TreeNode root) {
        if (null == root) {
            return true;
        }
        if (!XXX(root.left)) {
            return false;
        }
        if (null == pre) {
            pre = root;
        } else {
            if (root.val > pre.val) {
                pre = root;
            } else {
                return false;
            }
        }
        return XXX(root.right);
    }
}

