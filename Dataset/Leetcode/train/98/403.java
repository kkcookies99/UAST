 class Solution {
    public boolean XXX(TreeNode root) {
        return XXX(root,null,null);
    }
    public boolean XXX(TreeNode root, TreeNode min, TreeNode max) {
        if (null == root) {
            return true;
        }
        if (null != min && min.val >= root.val) {
            return false;
        }
        if (null != max && max.val <= root.val) {
            return false;
        }
        return XXX(root.left, min, root) && XXX(root.right, root, max);
    }
}

