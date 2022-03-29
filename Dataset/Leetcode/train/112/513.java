 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        int s = sum - root.val;

        if (s == 0 && root.left == null && root.right == null) {
            return true;
        }

        return XXX(root.left, s) || XXX(root.right, s);
    }
}


