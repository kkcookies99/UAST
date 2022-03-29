 class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            Queue<TreeNode> tmpQueue = new LinkedList<>();
            tmpQueue.addAll(queue);
            queue.clear();
            while (!tmpQueue.isEmpty()) {
                TreeNode node = tmpQueue.poll();
                if (node != null) {
                    tmp.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            if (!tmp.isEmpty()) {
                result.add(tmp);
            }
        }
        return result;
    }
}

