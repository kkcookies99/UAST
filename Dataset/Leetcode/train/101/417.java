 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        if (root.right == null && root.left != null) return false;
        if (root.left == null && root.right != null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue.offer(root.left);
        queue2.offer(root.right);
        while (!queue.isEmpty() && !queue2.isEmpty()) {
            TreeNode p1 = queue.poll();
            TreeNode p2 = queue2.poll();
            if (p1.val != p2.val) return false;
            if (p1.left == null && p2.right != null) return false;
            if (p1.right == null && p2.left != null) return false;
            if (p1.left != null) queue.offer(p1.left);
            if (p1.right != null) queue.offer(p1.right);
            if (p2.right != null) queue2.offer(p2.right);
            if (p2.left != null) queue2.offer(p2.left);
            if (queue.size() != queue2.size()) return false;
        }
        return true;
    }
}

