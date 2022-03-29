 class Solution {
    public boolean XXX(TreeNode root) {
        return comp(root, root);
    }
    
    public boolean comp(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null || node1.val != node2.val) {
            return false;
        }
        return comp(node1.left, node2.right) && comp(node1.right, node2.left);
    }
}

