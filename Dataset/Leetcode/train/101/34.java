 public boolean XXX(TreeNode root) {
        if (root == null)
            return true;
        Stack<TreeNode> left = new Stack<>();
        Stack<TreeNode> right = new Stack<>();
        left.push(root.left);
        right.push(root.right);
        while (!left.isEmpty() && !right.isEmpty()) {
            TreeNode ln = left.pop();
            TreeNode rn = right.pop();
            if (ln == null && rn == null)
                continue;
            if (ln == null || rn == null)
                return false;
            if (ln.val != rn.val)
                return false;
            left.push(ln.left);
            left.push(ln.right);
            right.push(rn.right);
            right.push(rn.left);
        }
        return true;
    }

