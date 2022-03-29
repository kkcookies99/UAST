     public boolean XXX(TreeNode root) {

        if (root == null) {
            return false;
        }

        return check(root.right,root.left);

    }
    boolean check(TreeNode rootRight,TreeNode rootLeft) {

        // 两个都为空
        if(rootLeft== null && rootRight == null){
            return  true;
        }
        // 一个为空。
        if(rootLeft==null||rootRight==null){
            return false;
        }
        if(rootLeft.val!=rootRight.val){
            return false;
        }

        return check(rootRight.right,rootLeft.left)&&check(rootRight.left,rootLeft.right);

    }```

