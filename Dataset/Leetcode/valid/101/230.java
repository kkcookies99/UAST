 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null){return true;}
        return XXX(root.left,root.right);
    }
    private boolean XXX(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null){return true;}
        if(t1==null||t2==null){return false;}
        if(t1.val!=t2.val){return false;}
        return XXX(t1.left,t2.right)&&XXX(t1.right,t2.left);
    }
}

