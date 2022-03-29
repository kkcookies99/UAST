class Solution {
    public int XXX(TreeNode root) {
        
        return height(root);
    }

    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }

        int leftHeight = height(node.left) + 1;

        int rightHeight = height(node.right) + 1;

        if (node.left == null || node.right == null) {
            return node.left == null ? rightHeight : leftHeight;
        }

        return Math.min(leftHeight, rightHeight);
    }
}

