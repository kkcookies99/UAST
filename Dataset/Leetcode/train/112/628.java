 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if( root == null )return false;
        int ans = 0;
        return dfs( root , sum , ans );
    }

    public boolean dfs( TreeNode root , int sum ,int ans){
        if(root == null){
            return false;
        }
        ans += root.val;
        if(root.left == null && root.right == null){
            return ans == sum;//叶节点需要判断是否满足结果
        }
        return dfs( root.left , sum , ans ) || dfs( root.right ,sum ,ans );
    }
}

