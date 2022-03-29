class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> row = new LinkedList<>();
            for (int i = 0; i < queue.size(); i++) {
                TreeNode node = queue.poll();
                TreeNode left = node.left, right = node.right;
                row.add(node.val);
                if (left != null) queue.add(left);
                if (right != null) queue.add(right);
            }
            res.add(row);
        }
        return res;
    }
}

