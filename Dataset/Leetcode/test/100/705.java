 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if(p == null && q == null)return true;
        if(p == null && q != null)return false;
        if(q == null && p != null)return false;
        if(q.val != p.val)return false;
        return XXX(p.left,q.left) && XXX(p.right,q.right);
    }
}

