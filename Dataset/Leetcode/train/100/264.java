     public boolean XXX(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }

        // 值相同
        if ((p.val == q.val)) {
            // 左右树结构相同
            if ((p.left == null && q.left != null || p.left != null && q.left == null) ||
                    (p.right == null && q.right != null || p.right != null && q.right == null)) {
                return false;
            }
        } else {
            return false;
        }

        // 查左右树
        if (p.left != null) {
            // 说明左子树不相同
            if (!XXX(p.left, q.left)) {
                return false;
            }
        }
        if (p.right != null) {
            if (!XXX(p.right, q.right)) {
                return false;
            }
        }
        return true;
    }

