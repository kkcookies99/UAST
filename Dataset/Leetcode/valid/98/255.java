 class Solution {
    Integer pre = null;

    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }

        var left = XXX(root.left);
        if (pre == null || pre < root.val) {
            pre = root.val;
        } else {
            return false;
        }
        var right = XXX(root.right);

        return (left && right);
    }
}

