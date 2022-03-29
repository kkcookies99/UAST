 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null)return true;
        return XXX(root.left,root.right);
        
    }
    public boolean XXX(TreeNode p,TreeNode q){
        if(p==null&&q==null)return true;
        if(p!=null&&q!=null){
            if(p.val==q.val){
              return  XXX(p.left,q.right)&&XXX(p.right,q.left);
            }
        }
        return false;
    }

}

