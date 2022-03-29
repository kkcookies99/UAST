 class Solution {
    public boolean XXX(TreeNode root) {
        TreeNode n1 = root.left;
        TreeNode n2 = root.right;
        return traverse(n1, n2);
    }

    public boolean traverse(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        }
        if (n1 == null || n2 == null) {
            return false;
        }
        if (!traverse(n1.left, n2.right)) {
            return false;
        }
        if (!traverse(n1.right, n2.left)) {
            return false;
        }
        if (n1.val != n2.val) {
            return false;
        }
        return true;
    }
}

