 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        return judge(root.left,root.right);
    }
    
    //判断两个结点是否对称,包括两个结点的值一样,左子树对称,右子树对称
    private boolean judge(TreeNode t1,TreeNode t2) {
        if(t1==null&&t2==null) return true;
        if(t1==null||t2==null) return false;
        if(t1.val!=t2.val) return false;
        return judge(t1.left,t2.right)&&judge(t1.right,t2.left);
    }
}

