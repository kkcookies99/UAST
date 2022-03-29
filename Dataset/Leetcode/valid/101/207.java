 class Solution {
    public boolean XXX(TreeNode root) {
        //根空，则对称
        if (root == null ) return true;
        //否则比较根的左右子树判断是否对称
        return cmp(root.left, root.right);
    }
    //cmp
    private boolean cmp(TreeNode n1, TreeNode n2) {
        //若左右子树均为空，则对称
        if (n1 == null && n2 == null ) return true;
        //若左子树为空或右子树为空或左右子树对应值不等，则不对称
        if (n1 == null || n2 == null || n1.val != n2.val) return false;
        //递归比较左右子树的左右节点是否相等
        return cmp(n1.left, n2.right) && cmp(n1.right, n2.left);
        }
}

