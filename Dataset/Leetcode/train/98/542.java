 class Solution {
    public boolean XXX(TreeNode root) {
        return XXX(root,null,null);
    }
    public boolean XXX(TreeNode root,TreeNode min,TreeNode max){
        if(root == null)return true;
        if(min != null && root.val  <= min.val) return false;
        if(max != null && root.val >= max.val)return false;
        return XXX(root.left,min,root) && XXX(root.right,root,max);
    }
}

