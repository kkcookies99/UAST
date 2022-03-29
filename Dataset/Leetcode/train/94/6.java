 class Solution {
    Stack<TreeNode> stack = new Stack<>();
    List<Integer> res = new ArrayList<>();

    public List<Integer> XXX(TreeNode root) {
        if (root == null) return res;
        digui(root);
        return res;
    }
    private void digui(TreeNode node) {
        if (node != null) {
            stack.push(node);
            node = node.left;
        } else {
            if (stack.isEmpty()) {
                return;
            }
            node = stack.pop();
            res.add(node.val);
            node = node.right;
        }
        digui(node);
    }

}

