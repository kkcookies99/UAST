 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        return isSameTree(root.left, root.right);
    }

     public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        if(!isSameTree(p.left,q.right)) return false;
        if(!isSameTree(p.right,q.left)) return false;
        return true;
    }
}

