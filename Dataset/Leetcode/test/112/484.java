 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        return dfs(root, sum, 0);
    }

    public boolean dfs(TreeNode root, int sum, int cnt) {
        if (root==null) return false;
        cnt+=root.val;
        if (cnt==sum&&root.left==null&&root.right==null) return true;
        boolean b1 = dfs(root.left, sum, cnt);
        boolean b2 = dfs(root.right, sum, cnt);
        return b1||b2;
    }
}

