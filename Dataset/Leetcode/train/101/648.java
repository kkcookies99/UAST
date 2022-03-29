 class Solution {
    public boolean XXX(TreeNode root) {
        return helper(root, root);
    }
    
    private boolean helper(TreeNode root1, TreeNode root2) {
        //都为空是对称的
        if (root1 == null && root2 == null) {
            return true;
        }
        //只有一个为空则不对称
        if (root1 == null || root2 == null) {
            return false;
        }
        //节点值不同则不对称
        if (root1.val != root2.val) {
            return false;
        }
        else {
            //当前节点的右子树与另一个节点的左子树必须对称，当前节点的左子树与另一个节点的右子树必须对称
            return helper(root1.left, root2.right) && helper(root1.right, root2.left);
        }
    }
}

