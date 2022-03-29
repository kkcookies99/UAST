 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null)return true;
        return isS(root.left,root.right);
    }
    public boolean isS(TreeNode s,TreeNode t){
        if(s==null&&t==null)return true;
        if(s==null||t==null||s.val!=t.val)return false;
        return isS(s.right,t.left)&&isS(s.left,t.right);
    }
}

