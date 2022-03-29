class Solution {
    public int XXX(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return 0;
        queue.add(root);
        int n, d = 0;
        TreeNode t;
        while (!queue.isEmpty()) {
            d++;
            n = queue.size();
            for (int i = 0; i < n; i++) {
                t = queue.remove();
                if (t.left == null && t.right == null) return d;
                if (t.left != null) queue.add(t.left);
                if (t.right != null) queue.add(t.right);
            }
        }
        return d;
    }
}

