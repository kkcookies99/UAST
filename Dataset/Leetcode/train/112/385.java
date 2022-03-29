   public boolean XXX(TreeNode root, int targetSum) {
        if(root==null) return false;
        if(root.left==null&&root.right==null&&targetSum==root.val) return true;
        boolean l=XXX(root.left,targetSum-root.val);
        boolean r=XXX(root.right,targetSum-root.val);
        return l||r;
    }

