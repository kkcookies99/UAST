 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        //p与q都为null
        if(p == null && q == null){
            return true;
        }
        //p为null或者q为null
        if(p == null || q == null){
            return false;
        }
        //p与q的值不一样
        if(p.val != p.val){
            return false;
        }
        return p.val == q.val && XXX(p.left,q.left) && XXX(p.right, q.right);
    }
}

