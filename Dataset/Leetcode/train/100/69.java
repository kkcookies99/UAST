 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null || p.val != q.val)
            return false;
        boolean leftNode = XXX(p.left,q.left);
        boolean rightNode = XXX(p.right,q.right);
        return leftNode && rightNode;

    }
}

