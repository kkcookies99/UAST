 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) return true;

        return solute(root.left, root.right);
    }
    
    public boolean solute(TreeNode lRoot, TreeNode rRoot) {
        if(lRoot==null && rRoot==null) return true;
        else if((lRoot==null&&rRoot!=null) || (lRoot!=null&&rRoot==null)) return false;
        else if(lRoot.val != rRoot.val) return false;

        return solute(lRoot.left, rRoot.right) && solute(lRoot.right, rRoot.left);
    }
}

