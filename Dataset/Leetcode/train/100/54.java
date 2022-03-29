 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
            return true;
        else if((p!=null&&q==null)||(p==null&&q!=null))
            return false;
        else if(p.val!=q.val)
            return false;
        else
        {
            var x=XXX(p.left,q.left);
            var y=XXX(p.right,q.right);
            return x&&y;
        }

    }
}

