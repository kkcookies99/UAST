 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }

        TreeNode nullNode = new TreeNode(Integer.MAX_VALUE);

        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>(queue.size());
            List<TreeNode> nextCollections = new ArrayList<>(queue.size() * 2);
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    nextCollections.add(node.left);
                } else {
                    nextCollections.add(nullNode);
                }
                if (node.right != null) {
                    nextCollections.add(node.right);
                } else {
                    nextCollections.add(nullNode);
                }
            }

            int n = list.size();
            for (int i = 0; i < n / 2; i++) {
                if (!list.get(i).equals(list.get(n - 1 - i))) {
                    return false;
                }
            }

            HashSet<TreeNode> set = new HashSet<>(nextCollections);
            if (set.size() == 1 && nextCollections.get(0) == nullNode) {
                break;
            }

            queue.addAll(nextCollections);
        }
        return true;
    }
}

