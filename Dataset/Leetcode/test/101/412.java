 class Solution {
    public boolean XXX(TreeNode root) { 
        if(root==null) return true;
        TreeNode l=root.left;
        TreeNode r=root.right;
        if(l==null&&r==null) return true;
        if(l==null||r==null) return false;
        if(l.val!=r.val) return false;
        return p(l.left,r.right)&&p(l.right,r.left);
    }

    public static boolean p(TreeNode l,TreeNode r){
        if(l==null&&r==null) return true;
        if(l==null||r==null) return false;
        if(l.val==r.val&&l.val==r.val){
            return p(l.left,r.right)&&p(l.right,r.left);
        }
        else{
            return false;
        }
    }
}

