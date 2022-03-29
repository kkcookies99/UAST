 class Solution {

    private TreeNode pre=null;
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        boolean isLeft=XXX(root.left);
        if(pre==null||pre.val<root.val)
            pre=root;
        else
            return false;
        return isLeft&&XXX(root.right);
    }
}

