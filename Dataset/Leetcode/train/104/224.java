class Solution {
    public int XXX(TreeNode root) {
        if ( root != null) {
            return Math.max(XXX(root.left), XXX(root.right)) + 1;
        }
        return 0;
    }
}

