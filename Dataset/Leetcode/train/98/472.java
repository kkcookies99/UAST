 class Solution {
    private boolean getIsvalidBST(TreeNode root,Integer min,Integer max){
        if(root==null){
            return true;
        }
        if((min!=null&&root.val<=min)||(max!=null&&root.val>=max)){
            return false;
        }
        return getIsvalidBST(root.left,min,root.val)&&getIsvalidBST(root.right,root.val,max);
    }
    public boolean XXX(TreeNode root) {
        return getIsvalidBST(root,null,null);
    }
}

