 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            int temp = node.val;
            if (node.left == null && node.right == null) {
                if (temp == sum) {
                    return true;
                }
                continue;
            }
           sum -= node.val;
            if (node.left != null) {
                queue.offer(node.left)；
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return true;
    }
}

