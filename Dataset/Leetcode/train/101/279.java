 class Solution {
    public boolean XXX(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        else if(p == null || q == null){
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }
}

