 class Solution {
    public boolean XXX(TreeNode root) {
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode real, TreeNode phantom) {
        if (phantom == real) return true;
        if (phantom == null || real == null || phantom.val != real.val) return false;
        return helper(real.left, phantom.right) && helper(real.right, phantom.left);
    }
}

