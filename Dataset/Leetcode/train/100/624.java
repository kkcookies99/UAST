 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        return dfs(p,q);
    }
    boolean dfs(TreeNode p,TreeNode q){
        if(p==null&&q==null)
        return true;
        if(p==null^q==null||p.val!=q.val)
        return false;
        return dfs(p.left,q.left)&&dfs(p.right,q.right);
    }
}

