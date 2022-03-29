  public int XXX(TreeNode root) {
        return dep(1,root);
    }
    public int dep(int h,TreeNode node){
           if (node == null) return h-1;
        int left = dep(h+1,node.left);
        int right = dep(h+1,node.right);
        if (node.left == null) return right;
        if (node.right == null) return left;
        return Math.min(left,right);
    }

