class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        return dfs(root,0,targetSum);
    }
    public boolean dfs(TreeNode root,int count,int targetSum){
        if(root==null)return false;
        count+=root.val;
        if(root.left==null && root.right==null){
            if(count==targetSum)return true;
            return false;
        }
        return dfs(root.left,count,targetSum)|| dfs(root.right,count,targetSum);
        
    }
}

