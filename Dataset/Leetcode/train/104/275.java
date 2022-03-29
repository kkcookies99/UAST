class Solution {
    public int XXX(TreeNode root) {
        return preorder(root, 0);
    }
    public int preorder(TreeNode p, int depth) {
        if (p == null) return depth;
        int d1 = preorder(p.left, depth + 1);
        int d2 = preorder(p.right, depth + 1);
        return d1>d2?d1:d2;
    }
}

