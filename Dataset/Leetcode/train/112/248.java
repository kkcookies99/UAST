 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        return dfs(root,targetSum);
    }
    public boolean dfs(TreeNode root,int targetSum){
        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null&&root.val==targetSum){
            return true;
        }
        return dfs(root.left,targetSum-root.val) ||
        dfs(root.right,targetSum-root.val);
    }
}

