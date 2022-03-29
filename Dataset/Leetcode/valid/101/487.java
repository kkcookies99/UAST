 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
       return traverse(root.left, root.right); 
    }

    public boolean traverse(TreeNode l, TreeNode r) {
        if(l== null) return r==null;
        if(r== null) return l==null;
        if(l.val != r.val) return false; 
        return traverse(l.left, r.right) && traverse(l.right, r.left);
    }
}

