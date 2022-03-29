 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        return root.left == null && root.right == null && sum == root.val 
                || XXX(root.left, sum - root.val) || XXX(root.right, sum - root.val);
    }
}

