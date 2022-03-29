class Solution {
    public boolean XXX(TreeNode root) {
        return root == null || XXX(root.left) && XXX(root.right) && (Math.abs(depth(root.left) - depth(root.right)) <= 1);
    }

    //求树的深度
    public static int depth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(depth(root.left), depth(root.right));
    }
}

