 class Solution {
    public boolean XXX(TreeNode root) {
        return XXX(root,null,null);
    }
    public boolean XXX(TreeNode root , TreeNode left ,TreeNode right){
        if(root==null) return true;
        if(left!=null && root.val<=left.val) return false;
        if(right!=null && root.val>=right.val) return false;
        return XXX(root.left,left,root)&&XXX(root.right,root,right);
    }
}

