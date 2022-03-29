class Solution {
    public boolean XXX(TreeNode root) {
        return dfs(root) == Integer.MAX_VALUE?false:true;
    }

    public int dfs(TreeNode node) {
        if (node == null) return 0;
        int left = dfs(node.left);
        if (left == Integer.MAX_VALUE) return left;
        int right = dfs(node.right);
       if (right == Integer.MAX_VALUE || Math.abs(left - right) > 1) return Integer.MAX_VALUE;
        return Math.max(left + 1,right + 1);
    }
}

