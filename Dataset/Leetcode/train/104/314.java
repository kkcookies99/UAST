class Solution {
    public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int rightDepth = 1, leftDepth = 1;
        if (root.left != null) {
            leftDepth = XXX(root.left) + 1;
        }
        if (root.right != null) {
            rightDepth = XXX(root.right) + 1;
        }
        return rightDepth > leftDepth ? rightDepth : leftDepth;
    }
}

