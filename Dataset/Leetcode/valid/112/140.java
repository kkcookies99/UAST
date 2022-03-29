class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if (root == null) return false;

        int res = targetSum - root.val;
        if (res == 0 && root.left == null && root.right == null) return true;

        return XXX(root.left,res) || XXX(root.right,res);

    }
  
}

