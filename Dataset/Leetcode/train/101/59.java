 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(root);
        q2.add(root);
        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode left = q1.poll();
            TreeNode right = q2.poll();
            if (left == null && right == null) continue;
            if (left == null || right == null) return false;
            if (left.val != right.val) return false;
            q1.add(left.left);
            q1.add(left.right);
            q2.add(right.right);
            q2.add(right.left);
        }
        return q1.isEmpty() && q2.isEmpty();
    }
}

