class Solution {
    public boolean XXX(TreeNode root) {
        return dfs(root) >= 0;
    }
    // 若检查到非平衡节点则返回 -1 否则返回该节点最大高度
    public int dfs(TreeNode root) {
        if (root == null) return 0;

        int left = dfs(root.left);
        if (left < 0) return -1;

        int right = dfs(root.right);
        if (right < 0) return -1;

        int deep = Math.abs(left - right);

        return deep > 1 ? -1 : Math.max(left, right) + 1;
    } 
}

