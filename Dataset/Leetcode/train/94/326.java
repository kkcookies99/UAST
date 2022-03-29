 public List<Integer> XXX(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode temp = root;
        while (temp != null || !stack.isEmpty()) {
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            temp = stack.pop();
            result.add(temp.val);
            temp = temp.right;
        }
        return result;
    }

