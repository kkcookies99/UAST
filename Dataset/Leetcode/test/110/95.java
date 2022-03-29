class Solution {
    public boolean XXX(TreeNode root) {
        return root == null || (XXX(root.left) && XXX(root.right) && (Math.abs(h(root.left) - h(root.right)) <= 1));
    }
    
    private static int h(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(h(root.left), h(root.right));
    }
}

