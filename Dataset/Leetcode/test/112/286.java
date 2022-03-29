 public boolean XXX(TreeNode root, int targetSum) {
        if (root == null) return false;
        //叶子节点
        if (root.left == null && root.right == null) {
            if (targetSum-root.val == 0) return true;
            else return false;
        }
        return XXX (root.left,targetSum-root.val) || XXX(root.right,targetSum-root.val);
    }

