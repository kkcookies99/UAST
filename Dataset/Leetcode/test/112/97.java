class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        boolean[] bool = {false};
        if(root == null) return bool[0];
        dfs(root,targetSum,0,bool);
        return bool[0];
    }
    private void dfs(TreeNode root,int targetSum, int sum, boolean[] bool){
        sum += root.val;
        if(root.left == null && root.right == null) bool[0] = sum == targetSum;
        else {
            if(root.left != null && !bool[0]) dfs(root.left,targetSum,sum,bool);
            if(root.right != null && !bool[0]) dfs(root.right,targetSum,sum,bool);
        }
    }
}

