class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null){
            return true ;
        }
        int l = depth(root.left) ;
        int r = depth(root.right) ;
        if(Math.abs(l-r)>1){
            return false ;
        }
        //这个左右子树都要满足这个条件才可以
        return XXX(root.left)&&XXX(root.right) ;
    }

    public int depth(TreeNode root){
        if(root==null){
            return 0 ;
        }
        int l = depth(root.left) ;
        int r = depth(root.right) ;
        return l>r ? l+1:r+1 ;
    }
}

