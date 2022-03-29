class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        Queue<TreeNode> ax = new LinkedList<TreeNode>();
        LinkedList<Integer> temp;
        int counter;
        if (root != null)
            for (ax.offer(root); !ax.isEmpty(); result.offer(temp))
                for (counter = ax.size(), temp = new LinkedList<Integer>();
                counter-- > 0; temp.offer(root.val)) {
                    root = ax.poll();
                    if (root.left != null) ax.offer(root.left);
                    if (root.right != null) ax.offer(root.right);
                }
        return result;
    }
}

