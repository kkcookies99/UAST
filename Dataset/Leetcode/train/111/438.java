class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        return dfs(root,1);
    }
    int dfs(TreeNode root,int depth){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return depth;
        int left = dfs(root.left,depth + 1);
        int right = dfs(root.right,depth + 1);
        if(left == 0 || right == 0) return right + left;
         return Math.min(left,right);
    }
}

