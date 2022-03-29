     public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        TreeNode cur = root;
        while (cur != null) {
            TreeNode left = cur.left;
            if (left != null) {
                while (left.right != null && left.right != cur) left = left.right;
                if (left.right == null) {
                    left.right = cur;
                    cur = cur.left;
                    continue;
                }
                left.right = null;
            }
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }

