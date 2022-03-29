 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if(p==null &&  q==null) return true;
         if( (p!=null && q==null)  || (p==null && q!=null)  || (p.val!=q.val))                
             return false;         
                     
         return XXX(p.left,q.left) && XXX(q.right,p.right);
    }
}

