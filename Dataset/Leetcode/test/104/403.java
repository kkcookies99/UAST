class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        return dfs(root,1);
    }
    public int dfs(TreeNode root,int len){
       
        if(root.left == null && root.right == null) return len;
        if(root.left == null) return dfs(root.right,len+1);
        if(root.right == null) return dfs(root.left,len+1);

        return Math.max(dfs(root.right,len+1), dfs(root.left,len+1));

    }
}

