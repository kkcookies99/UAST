 class Solution {
    private boolean result = true;

    public boolean XXX(TreeNode root) {
        if (root == null) {
            return result;
        }
        XXX(root, Long.MIN_VALUE, Long.MAX_VALUE);
        return result;
    }

    private void XXX(TreeNode node, long min, long max) {
        // ※※ 小技巧
        if (node == null || !result) {
            return;
        }
        if (node.val <= min || node.val >= max) {
            // ※※ 小技巧
            result = false;
        }
        XXX(node.left, min, node.val);
        XXX(node.right, node.val, max);
    }
}

