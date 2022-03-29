 class Solution {
   static boolean ans = true;

    public boolean XXX(TreeNode root) {
        dfs(root);
        return ans;

    }

    static void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.left.val >= root.val) {
            ans = false;
        }
        if (root.right != null && root.right.val <= root.val) {
            ans = false;
        }
        dfs(root.left);
        dfs(root.right);
    }
}

