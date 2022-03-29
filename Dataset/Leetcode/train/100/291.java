 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        return XXX(p.left, q.left)&&XXX(p.right, q.right)&&(p.val==q.val);
    }
}

