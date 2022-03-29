 class Solution {
    public boolean XXX(TreeNode root) {
        return cheak(root,root);
    }

    public boolean cheak(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null&&q!=null||p!=null&&q==null){
            return false;
        }
        return p.val==q.val&&cheak(p.left,q.right)&&cheak(p.right,q.left);
    }
}

