class Solution {
    public int XXX(TreeNode root) {
        return dfs(root);
    }

    int dfs(TreeNode tree){
        return tree==null?0:1+Math.max(dfs(tree.left),dfs(tree.right));
    }
}

