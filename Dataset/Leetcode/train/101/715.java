 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null)return true;
        return boolSym(root.left,root.right);
    }
    boolean boolSym(TreeNode left,TreeNode right){
        if(left==null&&right==null)return true;
        if(left==null||right==null)return false;
        if(left.val == right.val){
            boolean b1 = boolSym(left.left,right.right);
            boolean b2 = boolSym(left.right,right.left);
            if(b1&&b2)return true;
        }
        return false;
    }
}

