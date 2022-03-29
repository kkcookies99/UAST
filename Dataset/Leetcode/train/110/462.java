class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        int depthLeft = depth(root.left);
        int depthRight = depth(root.right);
        return Math.abs(depthLeft - depthRight) < 2 && (XXX(root.left) && XXX(root.right));
    }
    
    private int depth(TreeNode node) {
        return node == null ? 0 : Math.max(depth(node.left), depth(node.right)) + 1;
    }
}

