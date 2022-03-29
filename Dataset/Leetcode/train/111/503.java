class Solution {
    public int XXX(TreeNode root) {
        return dfs(root);
    }
    public int dfs(TreeNode node){
        if(node==null) return 0;
        if(node.left!=null&&node.right!=null){
            return Math.min(dfs(node.left),dfs(node.right))+1;
        }
        return Math.max(dfs(node.left),dfs(node.right))+1;
    }
}

