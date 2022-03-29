 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        else if(p==null) return false;
        else if(q==null) return false;
        else return(p.val==q.val&& XXX(p.left, q.left)&&XXX(p.right, q.right));
    }
}

