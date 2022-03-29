class Solution {
    public int XXX(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = XXX(root.left);
        int rightHeight = XXX(root.right);
        //当存在空子树的情况时，此时所谓最小深度就只有一种情况了:
        //直接计算根节点与非空子树构成的树的深度
        return (root.left == null || root.right == null) ? 
        (leftHeight + rightHeight + 1) : Math.min(leftHeight, rightHeight) + 1;
    }
}

