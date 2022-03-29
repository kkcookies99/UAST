 class Solution {
    public boolean XXX(TreeNode root) {
        return inOrder(root, new long[]{Long.MIN_VALUE});
    }

    public boolean inOrder(TreeNode root, long[] last) {
        if (root == null) return true;
        if (root.left != null) {
            boolean isLeftValid = inOrder(root.left, last);
            if (!isLeftValid) return false;
        }
        if (last[0] >= root.val) return false;
        last[0] = root.val;
        if (root.right != null) {
            boolean isRightValid = inOrder(root.right, last);
            if (!isRightValid) return false;
        }
        return true;
    }
}

