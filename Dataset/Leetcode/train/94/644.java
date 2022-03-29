 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        push(stack, root);
        while (!stack.isEmpty()) 
            res.add(getNextVal(stack));
        return res;
    }
    void push(Deque<TreeNode> stack, TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
    int getNextVal(Deque<TreeNode> stack) {
        TreeNode res = stack.pop();
        push(stack, res.right);
        return res.val;
    }
}

