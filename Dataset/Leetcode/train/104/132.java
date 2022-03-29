class Solution {
    public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getDepth(root.left, 1), getDepth(root.right, 1));
    }
    
    private int getDepth(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        depth++;
        return Math.max(getDepth(root.left, depth), getDepth(root.right, depth));
        
    }
}

