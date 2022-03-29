class Solution {
    public int XXX(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int depth){
        if(root == null)return depth;
        else if(root.left == null && root.right == null)return depth+1;
        else if(root.left == null)return dfs(root.right, depth+1);
        else if(root.right == null)return dfs(root.left, depth+1);
        return Math.min(dfs(root.left, depth+1), dfs(root.right, depth+1));
    }
}

