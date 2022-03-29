 class Solution {
    long prev = Long.MIN_VALUE;
    boolean isValid = true;
    public boolean XXX(TreeNode root) {
        infixOrder(root);
        return isValid;
    }
    private void infixOrder(TreeNode node) {
        if (node != null) {
            infixOrder(node.left);
            if (prev != Long.MIN_VALUE && node.val <= prev) isValid = false; 
            prev = node.val; 
            infixOrder(node.right);
        }
    }
}

