 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if(p == null || q == null){
            if(p == q) return true;
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        if(!XXX(p.left, q.left)){
            return false;
        }
        if(!XXX(p.right, q.right)){
            return false;
        }
        return true;
    }
}

