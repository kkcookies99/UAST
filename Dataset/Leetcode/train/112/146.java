class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if (root == null) return false;
        return dfs(root, targetSum, 0);
    }

    public boolean dfs(TreeNode root, int targetSum, int curNum) {
        if (root.left == null && root.right == null && curNum + root.val == targetSum) return true;

        boolean rightResult = root.right != null && dfs(root.right, targetSum, curNum + root.val);
        boolean leftResult = root.left != null && dfs(root.left, targetSum, curNum + root.val);

        return rightResult || leftResult;
    }
}

