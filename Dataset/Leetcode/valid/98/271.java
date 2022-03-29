 class Solution {
    TreeNode pre=null;//前驱
    public boolean XXX(TreeNode root) {
        if (root == null) return true;
        if (!XXX(root.left)) return false;
        if (pre != null && root.val <= pre.val) return false;
        pre = root;
        if (!XXX(root.right)) return false;
        return true;
    }
}

