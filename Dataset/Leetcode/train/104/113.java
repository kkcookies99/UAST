 public int XXX(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(XXX(root.left), XXX(root.right));
        //等价于
//        if (root == null) {
//            return 0;
//        } else {
//            return 1 + Math.max(XXX(root.left), XXX(root.right));
//        }
    }

