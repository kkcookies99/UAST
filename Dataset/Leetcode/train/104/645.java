 public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 返回左子树最大深度
        int leftMaxDeep = XXX(root.left);
        // 返回右子树最大深度
        int rightMaxDeep = XXX(root.right);
        return (leftMaxDeep > rightMaxDeep ? leftMaxDeep : rightMaxDeep) + 1;
    }

