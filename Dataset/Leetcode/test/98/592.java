 class Solution {
    public boolean XXX(TreeNode root) {
        return XXX(root,null,null);
    }

    boolean XXX(TreeNode root,TreeNode min,TreeNode max){
        if(root == null) return true;

        if(min != null && min.val >= root.val) return false;
        if(max != null && max.val <= root.val) return false;

        return XXX(root.left,min,root) && XXX(root.right,root,max);
    }
}

