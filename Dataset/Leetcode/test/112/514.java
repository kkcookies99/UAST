 class Solution {
    public boolean XXX(TreeNode root, int sum) {
       if (root == null) return false;
       if (root.val == sum && root.left == null && root.right == null) return true;
       return XXX(root.left, sum - root.val) || XXX(root.right, sum - root.val);
    }
}

