    public boolean XXX(TreeNode root) {
//      如果 当前二叉树为空时，返回true
        if(root == null) return true;
//        将左右两个子树分别拆开
        return isSame(root.left, root.right);
    }
    public boolean isSame(TreeNode p, TreeNode q){
        if( p == null && q == null ) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSame(p.left,q.right) && isSame(p.right, q.left);
    }

