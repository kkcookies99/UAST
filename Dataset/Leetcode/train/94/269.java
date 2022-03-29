     public List<Integer> XXX(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        Stack<TreeNode> nodes = new Stack<>();
        if (root == null)
            return ret;
        nodes.add(root);
        while (!nodes.isEmpty()) {
            TreeNode oneNode = nodes.pop();
            if (oneNode.left == null && oneNode.right == null) {
                ret.add(oneNode.val);
                continue;
            }
            if (oneNode.right != null)
                nodes.add(oneNode.right);
            nodes.add(oneNode);
            oneNode.right = null;
            if (oneNode.left != null)
                nodes.add(oneNode.left);
            oneNode.left = null;
        }
        return ret;
    }

