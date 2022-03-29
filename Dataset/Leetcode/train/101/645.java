 class Solution {
    public boolean XXX(TreeNode root) {
        return root == null ? true : isMirror(root.left, root.right);
    }
    public boolean isMirror(TreeNode r1, TreeNode r2) {
        // r1 和 r2 都为 null
        if (r1 == r2) {
            return true;
        }
        // r1 或 r2 其中一个为 null 或者 r1 和 r2 都不为 null 且值不同
        else if ((r1 == null || r2 == null) || r1.val != r2.val) {
            return false;
        }
        // r1 和 r2 不为 null 但是值一样
        else {
            return isMirror(r1.left, r2.right) && isMirror(r1.right, r2.left) ? true : false;
        }
    }
}

