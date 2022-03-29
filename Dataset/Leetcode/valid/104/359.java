class Solution {
    public int XXX(TreeNode root) {
        return this.dfs(root,0);
    }
    public int dfs(TreeNode root,int step){
        if(root == null){
            return step;
        }
        return Math.max(dfs(root.left,step+1),dfs(root.right,step+1));
    }
}

