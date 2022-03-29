 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        return compareTwoNodes(root.left, root.right);
    }
    
    private boolean compareTwoNodes(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return right == left;
        } else if (left.val != right.val) {
            return false;
        } else {
            return compareTwoNodes(left.right, right.left) &&
                    compareTwoNodes(left.left, right.right);
        }
    }
}

