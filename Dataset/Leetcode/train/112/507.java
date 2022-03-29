 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if (root==null){
            return false;
        }
        return dfs(root,sum,0);
    }
    public boolean dfs(TreeNode root, int sum,int ans){
        if (root==null){
            return false;
        }
        ans+=root.val;
        if (root.left==null&&root.right==null){
            return ans==sum;
        }
        return dfs(root.left,sum,ans)||dfs(root.right,sum,ans);
    }
}

