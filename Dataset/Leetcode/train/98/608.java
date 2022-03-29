 class Solution {
    TreeNode pre=null;
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        boolean left=XXX(root.left);
        if(pre!=null&&pre.val>=root.val)return false;
        pre=root;
        boolean right=XXX(root.right);
        return left&&right;
    }
}

