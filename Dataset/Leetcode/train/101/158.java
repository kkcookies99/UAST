 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        return isSame(root.left,root.right);
    }
    public boolean isSame(TreeNode r1,TreeNode r2){
        if(r1==null&&r2==null) return true;
        if(r1==null||r2==null) return false;
        if(r1.val!=r2.val) return false;
        return isSame(r1.left,r2.right)&&isSame(r1.right,r2.left);
    }
}

