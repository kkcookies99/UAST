 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        return dfs(root,sum,0);
    }
    private boolean dfs(TreeNode root, int sum, int cur){
        if(root == null){
            return false;
        }
        //叶子节点
        cur += root.val;
        if(root.left == null && root.right == null){
            if(cur == sum){
                return true;
            }else{
                return false;
            }
        }
        return dfs(root.left, sum, cur) || dfs(root.right, sum, cur);
    }
}

