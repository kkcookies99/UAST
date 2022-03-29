class Solution {
    public int XXX(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        int level = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            while (n > 0) {
                TreeNode node = queue.poll();
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                n--;
            }
            level++;
        }
        return level;
    }
}

