     public List<Integer> XXX(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        stack.push(root);
        while (!stack.empty()) {
            TreeNode cur = stack.peek();
            if (cur.left == null) {
                TreeNode pop = stack.pop();
                result.add(pop.val);
                if (pop.right != null) {
                    stack.push(pop.right);
                }
                continue;
            }
            stack.push(cur.left);
            cur.left = null;
        }
        return result;
    }

