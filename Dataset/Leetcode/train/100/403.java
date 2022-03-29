 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        boolean flagright = false;
        boolean flagleft = false;
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        if(p.val==q.val){
            flagleft = XXX(p.left,q.left);
            flagright = XXX(p.right,q.right);
        }else{
            return false;
        }
        return flagleft&&flagright;
    }
}

