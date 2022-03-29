 class Solution {
    long pre = Long.MIN_VALUE;

    public boolean XXX(TreeNode root) {
        if (root != null) {
            if (!XXX(root.left)) return false;
            if (root.val <= pre) return false;
            pre = root.val;
            if (!XXX(root.right)) return false;
        }
        return true;
    }
}

