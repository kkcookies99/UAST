class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();

        if (root == null)
            return res;
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> cur = new ArrayList<>();
            for (int size = queue.size(); size > 0; size--) {
                TreeNode tree = queue.poll();
                cur.add(tree.val);
                if (tree.left != null) 
                    queue.offer(tree.left);
                if (tree.right != null)
                    queue.offer(tree.right);
                }
            res.add(cur);
        }
        
        return res;
    }
}```

