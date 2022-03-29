 class Solution {
    public boolean XXX(TreeNode root) {
        return root == null || resolve(root.left, root.right);
    }

    public boolean resolve(TreeNode a, TreeNode b) {
        if (a == null || b == null) {
            return a == null && b == null;
        }

        return a.val == b.val && resolve(a.left, b.right) && resolve(a.right, b.left);
    }
}


