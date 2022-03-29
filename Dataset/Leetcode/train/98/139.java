 class Solution {
    public boolean XXX(TreeNode root) {
        //Long.MIN_VALUE
        return XXX(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    public boolean XXX(TreeNode root,long left,long right) {
        if(root==null) return true;
        if(root.val<=left || root.val>=right) return false;
        return XXX(root.left,left,root.val) && XXX(root.right,root.val,right);       
    }
}

