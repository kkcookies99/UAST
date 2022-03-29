class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        return dfs(root);
    }

    private int dfs(TreeNode root){
        if(root.left == null && root.right == null) return 1;
        if(root.left == null) return dfs(root.right) + 1;
        if(root.right == null) return dfs(root.left) + 1;
        return Math.min(dfs(root.left),dfs(root.right)) + 1;
    }
}

