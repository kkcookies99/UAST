 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }else if (p != null && q !=null && p.val == q.val) {
             return XXX(p.right, q.right) & XXX(p.left, q.left);
        } else {
            return false;
        }
    }
}

