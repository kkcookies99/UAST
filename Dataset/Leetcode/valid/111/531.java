class Solution {
    public int XXX(TreeNode root) {
        if(root==null) return 0;
        return dfs(root);

    }

    public int dfs(TreeNode root){
        if(root.left==null && root.right==null) return 1;
        
        int left= Integer.MAX_VALUE,right= Integer.MAX_VALUE;
        if(root.left!=null) left=dfs(root.left);
        if(root.right!=null) right=dfs(root.right);

        return Math.min(left,right)+1;
        
    }

}

