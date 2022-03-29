 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return sum - root.val == 0;

        return root.left != null && XXX(root.left, sum - root.val) || 
               root.right != null && XXX(root.right, sum - root.val); 
    }
}

