class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> treeList = new ArrayList<>();
        if(root == null) {
            return treeList;
        }
        List<Integer> tree = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        tree.add(root.val);
        queue.offer(root);
        int size;
        while(!queue.isEmpty()) {
            size = queue.size();
            treeList.add(tree);
            tree = new ArrayList<>();
            while(size > 0) {
                TreeNode node = queue.poll();
                if(node.left != null) {
                    queue.offer(node.left);
                    tree.add(node.left.val);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                    tree.add(node.right.val);
                }
                --size;
            }
        }
        return treeList;
    }
}

