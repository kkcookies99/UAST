 class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> topList = new ArrayList<>();
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        while (!nodeQueue.isEmpty()){
            int len = nodeQueue.size();
            List<Integer> levelList = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode node = nodeQueue.poll();
                if (node.left != null) nodeQueue.offer(node.left);
                if (node.right != null) nodeQueue.offer(node.right);
                levelList.add(Integer.valueOf(node.val));
            }
            topList.add(levelList);
        }
        return topList;
    }
}

