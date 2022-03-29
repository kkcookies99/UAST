 class Solution {
    public boolean XXX(TreeNode root) {
        return func(root.left, root.right);
    }

    boolean func(TreeNode left, TreeNode right){
        if(left==null && right==null)
            return true;
        if((left==null && right!=null)||(left!=null && right==null))
            return false;
        if(left.val!=right.val)
            return false;
        

        boolean outside = func(left.left, right.right);
        boolean inside = func(left.right, right.left);
        
        return outside && inside;           
    }
}

