class Solution {
    public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 1, depth = 1;
        TreeNode node;
        while (!queue.isEmpty()) {
            node = queue.poll();
            if (node.left == null && node.right == null) {
                break;
            }
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            if (--count == 0) {
                count = queue.size();
                depth++;
            }
        }
        return depth;
    }
}

