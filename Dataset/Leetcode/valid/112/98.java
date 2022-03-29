class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if(root==null) return false;
        return dfs(root,targetSum);
    }
    public boolean dfs(TreeNode root, int target){
        if(root.val==target && root.left==null && root.right==null){
            return true;
        }
        if(root.left==null && root.right==null) return false;
        if(root.left==null) return dfs(root.right,target-root.val);
        if(root.right==null) return dfs(root.left,target-root.val);
        return dfs(root.left,target-root.val) || dfs(root.right,target-root.val);
    }
}

