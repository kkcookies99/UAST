 class Solution {
    long max = Long.MIN_VALUE;
    public boolean XXX(TreeNode root) {
        if(root == null){return true;}
        return dfs(root);
    }

    private boolean dfs(TreeNode node){
        if(node==null){return true;}
        boolean a = dfs(node.left);
        if(node.val <= max || !a){return false;}
        max = node.val;
        boolean b = dfs(node.right);
        return a && b;
    }
}

