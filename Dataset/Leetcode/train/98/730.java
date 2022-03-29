 class Solution {

    private long pre = Long.MIN_VALUE;
    boolean flag = true;

    public boolean XXX(TreeNode root) {
        mid(root);
        return flag;
    }

    private void mid(TreeNode root) {
        if (root != null) {
            mid(root.left);
            if (root.val > pre) {
                pre = root.val;
            } else {
                flag = false;
                return;
            }
            mid(root.right);
        }
    }
}

