 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        return traverseBothTree(p, q);
    }

    private boolean traverseBothTree(TreeNode p, TreeNode q) {
        if (p != null && q != null && p.val == q.val) {
            return true && traverseBothTree(p.left, q.left) && traverseBothTree(p.right, q.right);
        } else if (p == null && q == null) {
            return true;
        } 
        else {
            return false;
        }
    }
}

