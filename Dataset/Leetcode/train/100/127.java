 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        return traversal(p,q);
    }
    
    public boolean traversal(TreeNode x1,TreeNode x2)
    {
        if(x1==null&&x2==null)
            return true;
        if(x1==null&&x2!=null||x1!=null&&x2==null||x1.val!=x2.val)
            return false;
        if(!traversal(x1.left,x2.left)||!traversal(x1.right,x2.right))
            return false;
        return true;
    }
}

