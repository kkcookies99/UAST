 class Solution {
    public boolean XXX(TreeNode root) {
        return recur(root,root);
    }
    public boolean recur(TreeNode l,TreeNode r){
        if(l==null){
            return r==null;
        }
        if(r==null){
            return l==null;
        }
        return recur(l.left,r.right)&&(l.val==r.val)&&recur(l.right,r.left);
    }
}

