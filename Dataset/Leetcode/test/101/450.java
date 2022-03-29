 class Solution {
    public boolean XXX(TreeNode root) {
        if (root==null) return true;
        return XXX(root.left, root.right);
        
    }
    private boolean XXX(TreeNode lnode, TreeNode rnode) {
        if (lnode==null && rnode==null) return true;
        if (lnode==null || rnode==null) return false;
        if (lnode.left==null && lnode.right==null
            && rnode.left==null && rnode.right==null
            && lnode.val==rnode.val) return true;
        if (lnode.val != rnode.val) {
            return false;
        } else {
            return XXX(lnode.left,rnode.right) 
                    && XXX(lnode.right, rnode.left);
                    
        }
    } 
}

