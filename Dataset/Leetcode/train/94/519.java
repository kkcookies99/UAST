 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> resList = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode node = stack.pop();
                resList.add(node.val);
                root = node.right;
            }
        }
        return resList;
    }
}

