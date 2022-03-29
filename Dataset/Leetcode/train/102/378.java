class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) {
            return resultList;
        }
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> line = new ArrayList<>();
            while (size > 0) {
                TreeNode oneNode = queue.poll();
                line.add(oneNode.val);
                if (oneNode.left != null) {
                    queue.offer(oneNode.left);
                }
                if (oneNode.right != null) {
                    queue.offer(oneNode.right);
                }
                size--;
            }
            resultList.add(line);
        }
        return resultList;
    }
}

