 class Solution {
    TreeNode pre;
    public boolean XXX(TreeNode root) {
        if(root==null)return true;
        if(!XXX(root.left))return false;
        if(pre!=null && pre.val>=root.val)return false;
        pre = root;
        return XXX(root.right);
    }
}

