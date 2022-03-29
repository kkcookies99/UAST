 class Solution {
    long pre = Long.MIN_VALUE;
    public boolean XXX(TreeNode root) {
        if (root == null)
            return true;
        if (root.left != null){
            if (!XXX(root.left))
                return false;
        }
        if (root.val <= pre)
            return false;
        else
            pre = root.val;
        if (root.right != null)
            return XXX(root.right);
        else 
            return true;
    }
}

