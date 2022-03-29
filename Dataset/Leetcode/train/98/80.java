 class Solution {
    public boolean XXX(TreeNode root) {
        long prev = Long.MIN_VALUE;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode node = stack.pop();
                if (prev != Long.MIN_VALUE && node.val <= prev) return false;
                prev = node.val;
                root = node.right;
            }
        }
        return true;
    }
}

