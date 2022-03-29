 public int XXX(TreeNode root) {
           if (root == null) {
            return 0;
           }
        int i = maxHeight(root);

        return i;
    }

    int maxHeight(TreeNode root) {
        int le = 0;
        int ri = 0;
        int max = 0;
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left != null) {
            le = maxHeight(root.left) + 1;
        }
        if (root.right != null) {
            ri = maxHeight(root.right) + 1;
        }
     
         if (le > ri) {
             max = le ;
         } else {
             max = ri ;
        }
        

        return max;
    }

