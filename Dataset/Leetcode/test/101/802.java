 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        dfs(root.left);
        return same(root.left,root.right);
    }
    public void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        dfs(root.right);
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
    }
    public boolean same(TreeNode t1,TreeNode t2){
        if(t1==null && t2==null) return true;
        if((t1==null && t2!=null) || (t1!=null && t2==null)) return false;
        return same(t1.left,t2.left) && same(t1.right,t2.right) && t1.val==t2.val;
    }
}

