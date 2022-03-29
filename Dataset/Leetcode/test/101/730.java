 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        return isEqual(root.left,root.right);
    }
    boolean isEqual(TreeNode rootl,TreeNode rootr) {
        if(rootl == null && rootr == null) return true;
        if(rootl == null || rootr == null) return false;
        if(rootl.val == rootr.val)
            return isEqual(rootl.left,rootr.right) && isEqual(rootl.right,rootr.left);
        return false;
    }
}

