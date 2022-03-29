 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        return DFS(root.left,root.right);
    }
    
    public boolean DFS(TreeNode p,TreeNode q){
        if(p == null&&q == null) return true;
        else if((p == null&&q!=null)||(q == null&&p != null)) return false;//遇到不符合的情况就直接剪枝


        if(p.val != q.val) { 
            return false;
        }
        else return DFS(p.right,q.left) && DFS(p.left,q.right);
    }
}

