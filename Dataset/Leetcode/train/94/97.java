 public List<Integer> XXX(TreeNode root) {
    List<Integer> s = new ArrayList<>();
    if(Objects.isNull(root)){
        return s;
    }
    Stack<TreeNode> stack = new Stack<>();
    stack.add(root);
    while (!stack.isEmpty()){
        TreeNode node = stack.pop();

        TreeNode left = node.left;
        TreeNode right = node.right;

        node.left = null;
        node.right = null;
        if(Objects.nonNull(right)){
            stack.add(right);
        }

        stack.add(node);

        if(Objects.nonNull(left)){
            stack.add(left);
        }

        if(Objects.isNull(left)){
            s.add(node.val);
            stack.pop();
        }

    }

    return s;
}
