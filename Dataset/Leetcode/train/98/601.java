 class Solution {
    public TreeNode pre = null;
    public boolean XXX(TreeNode root) {
        if(root==null)  return true;
        return InOrder(root);
    }
    public boolean InOrder(TreeNode root)
    {
        if(root==null)  return true;
        boolean left = InOrder(root.left);
        if(pre!=null && root.val<=pre.val)
            return false;
        pre = root;
        boolean right = InOrder(root.right);
        return left&&right;

    }

}

