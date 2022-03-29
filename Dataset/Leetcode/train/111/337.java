class Solution {
    public int XXX(TreeNode root) {
        if (root == null) return 0;
        int leftMinDepth = XXX(root.left);
        int rightMinDepth = XXX(root.right);
        if (leftMinDepth == 0)
            return rightMinDepth + 1;
        else if (rightMinDepth == 0)
            return leftMinDepth + 1;
        else
            return Math.min(leftMinDepth, rightMinDepth) + 1;
    }
}

