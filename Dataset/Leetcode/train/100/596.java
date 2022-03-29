 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        return (p == null && q == null) || (p != null && q != null && (p.val == q.val) && XXX(p.left, q.left) && XXX(p.right, q.right));
    }```

