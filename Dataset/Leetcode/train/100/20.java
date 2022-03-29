   public boolean XXX(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null) {

            if (XXX(p.left, q.left)) {
                if (p.val.equals(q.val)) {
                    if (XXX(p.right, q.right)) {

                        return true;
                    }
                }
            }

        }
        return false;
    }

