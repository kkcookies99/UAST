class Solution {
    public boolean XXX(TreeNode root) {
        return root == null || (Math.abs(depth(root.left) - depth(root.right)) <= 1) && XXX(root.left) && XXX(root.right);
    }

    //求树的深度
    public static int depth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(depth(root.left), depth(root.right));
    }
}

