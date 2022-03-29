     public boolean XXX(TreeNode root) {
        return isSame(root.left,root.right);
    }

    public boolean isSame(TreeNode a,TreeNode b){
        //判断临界条件
        if(a == null && b == null) return true;
        else if(a == null || b == null) return false;
        //查看内外
        boolean outside = isSame(a.left,b.right);
        boolean inside = isSame(a.right,b.left);
        if(outside && inside && a.val == b.val){
            return true;
        }
        return false;
    }

