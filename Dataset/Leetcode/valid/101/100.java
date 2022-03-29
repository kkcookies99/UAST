 class Solution {
    public boolean XXX(TreeNode root) {
        return isMirror(root, root);
    }
    
    private boolean isMirror(TreeNode root1, TreeNode root2) {
        if(root1 == null) return root2 == null;
        if(root2 == null) return root1 == null;
        if(root1.val != root2.val) return false;
        return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
    }
}

