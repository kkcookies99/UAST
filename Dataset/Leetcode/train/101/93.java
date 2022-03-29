 class Solution {
    public boolean XXX(TreeNode root) {
        return check(root,root);
    }
    public boolean check(TreeNode q,TreeNode p) {
        if(q == null && p == null) {
            return true;
        }
        if(q == null || p == null) {
            return false;
        }
        if(q.val == p.val && check(q.left,p.right) && check(q.right,p.left)) {
            return true;
        }
        return false;
    }
}

