class Solution {
    public boolean XXX(TreeNode root) {
        return heightForTree(root) != -1;
    }

    public int heightForTree(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = heightForTree(node.left);
        int rightHeight = heightForTree(node.right);

        //如果两个子数高度相差大于1，或者子树的子树都已经不符合要求了，就返回不符合要求（返回值为-1）；
        if (Math.abs(leftHeight - rightHeight) >= 2 || leftHeight == -1 || rightHeight == -1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}

