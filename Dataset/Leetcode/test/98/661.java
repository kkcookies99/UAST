 class Solution {
    public boolean XXX(TreeNode root) {
        return Helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean Helper(TreeNode root,long min,long max){
        if(root==null)return true;
        if(root.val>=max||root.val<=min)return false;
        return Helper(root.left,min,root.val)&&Helper(root.right,root.val,max);
    }
}

