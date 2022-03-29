 class Solution {
    public boolean XXX(TreeNode root) {
       return isBST(root,null,null);
    }

    boolean isBST(TreeNode root,TreeNode min, TreeNode max){

        if(root==null) return true;
        if(min!=null&&root.val<=min.val) return false;
        if(max!=null&&root.val>=max.val) return false;
        return isBST(root.left,min,root)&&isBST(root.right,root,max);

    }
}

