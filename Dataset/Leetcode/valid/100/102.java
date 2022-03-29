 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if(q == null || p == null){
            if(q == p){
                return true;
            }else{
                return false;
            }
        }
        if(p.val == q.val){
            return XXX(p.left,q.left) == true ? XXX(p.right,q.right) : false;
        }else{
            return false;
        }
    }
}

