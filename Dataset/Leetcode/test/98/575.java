 class Solution {
    public boolean XXX(TreeNode root) {
        return helper (root, null, null);
    }
    private boolean helper (TreeNode root, Integer lower, Integer upper) {
        // base case
        if (root == null) {
            return true;
        }
        //current level job
        if (lower != null && root.val <= lower || upper != null && root.val >= upper) {
            return false;
        }
        // recursive role
        return (helper(root.left, lower, root.val) && helper(root.right, root.val, upper));
    }
}

