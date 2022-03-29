 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if(p == null && q==null){
            return true;
        }else if(p==null||q==null){
            return false;
        }else{
            if(p.val==q.val){
                return XXX(p.left, q.left) && XXX(p.right, q.right);
            }else{
                return false;
            }
        }
    }
}

