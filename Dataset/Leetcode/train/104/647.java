 public int XXX(TreeNode root) {
        //this node is null ,then return zero;
        if (root == null) return 0;
        //left && right both are null ,then return 1 (represent this node)
        if (root.left == null && root.right == null) return 1;
        return Math.max(XXX(root.left), XXX(root.right)) + 1;
    }

