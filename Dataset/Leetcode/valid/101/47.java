 class Solution {
    public boolean XXX(TreeNode root) {
        return compare(root.left,root.right);
    }

    public boolean compare(TreeNode l,TreeNode r){
        if(l==null&&r==null) return true;
        else if(l==null||r==null) return false;

        if(l.val!=r.val) return false;
        return compare(l.left,r.right)&& compare(l.right,r.left);
    }
    
}

