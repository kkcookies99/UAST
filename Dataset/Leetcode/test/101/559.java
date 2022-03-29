 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null)
            return true;
        return isS(root.left,root.right);
    }

    public boolean isS(TreeNode left,TreeNode right){
        if(left==right)
            return true;
        if(left==null||right==null)
            return  false;
        return left.val==right.val&&isS(left.left,right.right)&&isS(left.right,right.left);
    }
}

