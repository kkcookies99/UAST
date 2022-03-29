class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        int leftH = height(root.left); //左子树高度
        int rightH = height(root.right); //右子树高度
        return Math.abs(leftH - rightH) <= 1 && XXX(root.left) && XXX(root.right);
    }

    //求一颗树的高度
    private int height(TreeNode root) {
        if(root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}

