 class Solution {
    Integer leftMax = null;
    public boolean XXX(TreeNode root) {
        if (root == null) return true;
        boolean left = XXX(root.left);
        if (leftMax == null || leftMax < root.val) leftMax = root.val;
        else return false;
        boolean right = XXX(root.right);
        return left&&right;
    }
}

