class Solution {
    public boolean XXX(TreeNode root) {
        return getDepth(root) != -1;
    }
    //返回二叉树的深度，如果该二叉树不是平衡二叉树则返回-1
    public int getDepth(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = getDepth(root.left);
        int rightHeight = getDepth(root.right);
        if (leftHeight == -1 || rightHeight == -1) return -1;  //左右子树出现了非平衡二叉树，直接返回 
        return Math.abs(leftHeight - rightHeight) > 1 ? -1 : Math.max(leftHeight, rightHeight) + 1;
    }
}

