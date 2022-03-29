class Solution {
    public boolean XXX(TreeNode root) {
        return pre(root);
    }

    boolean pre(TreeNode tree){
        if(tree==null) return true;
        if(Math.abs(dfs(tree.left) - dfs(tree.right))>1) return false;
        return pre(tree.left)&&pre(tree.right);
    }

    int dfs(TreeNode tree){
        if(tree==null) return 0;
        return Math.max(1+dfs(tree.left),1+dfs(tree.right));
    }

}

