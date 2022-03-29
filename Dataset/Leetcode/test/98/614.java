 class Solution {
    TreeNode pre = null;
    public boolean XXX(TreeNode root) {
        if(root == null)return true;
        boolean f1 = XXX(root.left);
        if(pre != null && root.val <= pre.val){
            return false;
        }
        pre = root;
        boolean f2 = XXX(root.right);
        return f1 && f2;
    }
}

