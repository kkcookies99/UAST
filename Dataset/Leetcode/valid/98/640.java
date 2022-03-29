 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null)
            return true;
        return check(root,root.left,root.right);
    }
    public boolean check(TreeNode root,TreeNode left,TreeNode right){
        if(left!=null&&left.val>=root.val)
            return false;
        if(right!=null&&right.val<=root.val)
            return false;

        if(root==null||left==null||right==null)
            return true;
        return check(root.left,left.left,left.right)&&check(root.right,right.left,right.right);
    }
}

