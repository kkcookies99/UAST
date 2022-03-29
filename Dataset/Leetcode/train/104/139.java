class Solution {
    public int XXX(TreeNode root) {
        return DFS(root);
    }

    /* 深度优先遍历 */
    public int DFS(TreeNode root) {
        if (root == null)
            return 0;
        int left = 1, right = 1;
        if (root.left != null)
            left += DFS(root.left);
        if (root.right != null)
            right += DFS(root.right);
        return left > right ? left : right;
    }
}

