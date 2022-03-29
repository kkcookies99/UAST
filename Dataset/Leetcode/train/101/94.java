 class Solution {
    public boolean XXX(TreeNode root) {
       return recusion(root,root);
    }
    public boolean recusion(TreeNode lnode, TreeNode rnode) {
        if (lnode == null && rnode == null) {
            return true;
        }
        if (lnode == null || rnode == null) {
            return false;
        }
        if (lnode.val != rnode.val) {
            return false;
        }
        return recusion(lnode.left, rnode.right) && recusion(lnode.right, rnode.left);
    }
}

