class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        recursion(Arrays.asList(root), result);
        return result;
    }

    public void recursion(List<TreeNode> nodes, List<List<Integer>> result) {
        if (nodes.isEmpty()) return;
        List<TreeNode> nextLevel = new ArrayList<TreeNode>();
        List<Integer> currentLevel = new ArrayList<Integer>();
        for(int i = 0; i < nodes.size(); i++ ) {
            currentLevel.add(nodes.get(i).val);
            if (nodes.get(i).left != null) nextLevel.add(nodes.get(i).left);
            if (nodes.get(i).right != null) nextLevel.add(nodes.get(i).right);
        }
        result.add(currentLevel);
        recursion(nextLevel, result);
    }


    // public List<List<Integer>> XXX(TreeNode root) {
    //     List<List<Integer>> result = new ArrayList<>();
    //     if (root == null) return result;

    //     Queue<TreeNode> queue = new LinkedList<TreeNode>();
    //     queue.offer(root);
    //     while(!queue.isEmpty()) {
    //         List<Integer> current = new ArrayList<>();
    //         int size = queue.size();
    //         for (int i = 0; i < size; i++ ) {
    //             TreeNode node = queue.poll();
    //             current.add(node.val);
    //             if (node.left != null) queue.offer(node.left);
    //             if (node.right != null) queue.offer(node.right);
    //         }
    //         result.add(current);
    //     }

    //     return result;
    // }
}

