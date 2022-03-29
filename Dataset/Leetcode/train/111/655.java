 class Solution {
    public int XXX(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        HashMap<TreeNode, Integer> depthMap = new HashMap<>();
        queue.add(root);
        depthMap.put(root, 1);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode left = node.left, right = node.right;
            if (left == null && right == null) {
                return depthMap.get(node);
            }
            int nodeDepth = depthMap.get(node);
            if (left != null) {
                queue.add(left);
                depthMap.put(left, nodeDepth + 1);
            }
            if (right != null) {
                queue.add(right);
                depthMap.put(right, nodeDepth + 1);
            }
        }
        return 1;
    }
}

