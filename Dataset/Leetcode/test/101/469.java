 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }
    private boolean isMirror(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null) {
            if(root1 == root2) {
                return true;
            }
            else {
                return false;
            }
        }
        if(root1.val != root2.val) {
            return false;
        }
        if(isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left)) {
            return true;
        }
        else {
            return false;
        }
    }
}

