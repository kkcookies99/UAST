 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if(root==null)return false;
        return dfs(root,targetSum);
    }
    public boolean dfs(TreeNode node,int targetSum){
        if(node==null)return false;
        return (node.left==null&&node.right==null&&targetSum-node.val==0)||dfs(node.left,targetSum-node.val)||dfs(node.right,targetSum-node.val);
    }
}

