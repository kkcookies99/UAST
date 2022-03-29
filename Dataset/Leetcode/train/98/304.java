     public boolean XXX(TreeNode root) {
        return isBST(root,-888,-888);

    }
    boolean isBST(TreeNode root,int min ,int max){

        if(root==null) return true;
        if(min!=-888&&root.val<=min) return false;
        if(max!=-888&&root.val>=max) return false;

        return isBST(root.left,min,root.val)&&isBST(root.right,root.val,max);
    }

