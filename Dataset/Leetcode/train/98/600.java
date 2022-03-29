 class Solution {
    Integer pre=null;
    public boolean XXX(TreeNode root) {
        return go(root);
    }

    public boolean go(TreeNode root){
        if(root==null)
            return true;
        boolean b=go(root.left);
        if(pre!=null&&(pre>=root.val||!b))
            return false;
        pre=root.val;
        b=go(root.right);
        return b;
    }
}

