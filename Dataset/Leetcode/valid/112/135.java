class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if (root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left == null && node.right == null && node.val == targetSum) return true;
            if (node.left != null) {
                node.left.val += node.val;
                queue.add(node.left);
            }
            if (node.right != null) {
                node.right.val += node.val;
                queue.add(node.right);
            }
        }
        return false;
    }
}

