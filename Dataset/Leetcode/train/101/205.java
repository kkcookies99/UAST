 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        return bfs(root.left, root.right);
    }
    public boolean bfs(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        else if(p == null || q == null) return false;
        else if(p.val != q.val) return false;
        else return bfs(p.left, q.right) && bfs(p.right, q.left);
    }   
}

