 public boolean XXX(TreeNode root) {
        if (root == null) return true;
        if (!getPre(root, root.right) || !getNext(root, root.left)) {
            return false;
        }
        return XXX(root.left) && XXX(root.right);

    }

    boolean getNext(TreeNode target, TreeNode root) {
        if (target == null) return true;
        if (root == null) return true;
        while (root.right != null) {
            root = root.right;
        }
        return target.val > root.val;
    }

    boolean getPre(TreeNode target, TreeNode root) {
        if (target == null) return true;
        if (root == null) return true;
        while (root.left != null) {
            root = root.left;
        }
        return target.val < root.val;

    }

